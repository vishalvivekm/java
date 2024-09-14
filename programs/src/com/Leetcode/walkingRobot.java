class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] dirs = {{0,1}, {1,0},{0,-1},{-1,0}}; // north east south wild-west
        int x = 0;
        int y = 0;
        int dirsIndex = 0;
        int maxdistance = 0;
        
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }
        
        for (int command : commands) {
            if (command == -2) { // turn left
                dirsIndex = (dirsIndex - 1 + 4) % 4; 
            } else if (command == -1) { // turn right
                dirsIndex = (dirsIndex+ 1) % 4;  
            } else { // command to move robo
                for (int i = 0; i < command; i++) {
                    int nextX = x + dirs[dirsIndex][0];
                    int nextY = y + dirs[dirsIndex][1];
                    if (obstacleSet.contains(nextX + "," + nextY)) { // obstacle hit, abort
                        break;
                    }
                    x = nextX;
                    y = nextY;
                    int distanceSquared = x*x + y*y;
                    maxdistance = Math.max(maxdistance, distanceSquared);
                }
            }
        }
        
        return maxdistance;
    }
}
