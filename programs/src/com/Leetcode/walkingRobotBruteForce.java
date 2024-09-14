// passes 43/50 test cases
// https://leetcode.com/problems/walking-robot-simulation/

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        boolean[] dir = {false, false, true, false};
        int dirIndex = 2;
        int maxDistance = 0;
        
        for(int i = 0; i < commands.length; i++) {
            if(commands[i] == -2){
                int leftDirIndex = dirIndex == 0 ? ((dirIndex - 1) % 4 + 4) % 4 : dirIndex - 1;
                setCurrent(dir, leftDirIndex);
                dirIndex = leftDirIndex;
            }
            if(commands[i] == -1){
                int rightDirIndex = dirIndex == 3 ? ((dirIndex + 1) % 4 + 4) % 4 : dirIndex + 1;
                setCurrent(dir, rightDirIndex);
                dirIndex = rightDirIndex;
            }
            if (commands[i] > 0 && commands[i] < 10) {
                switch(dirIndex) {
                    case 0:
                        boolean skip0 = false;
                        // check for obstacles
                        for(int[] obstacle : obstacles) {
                            if(obstacle[0] == x && obstacle[1] < y && y - commands[i] < obstacle[1]) {
                                if(i == 0 && obstacle[0] == 0 && obstacle[1] == 0) {
                                 continue;
                                }
                                y = obstacle[1] + 1;
                                skip0 = true;
                                break;     
                

                            }

                        }
                        if (!skip0) {
                        y = y - commands[i];    
                        }

                        break;
                    case 1:
                        boolean skip1  = false;
                        for(int[] obstacle : obstacles) {
                            if(obstacle[1] == y && obstacle[0] < x && x - commands[i] < obstacle[0]) {
                                if(i == 0 && obstacle[0] == 0 && obstacle[1] == 0) {
                                    continue;
                                }
                                x = obstacle[0] + 1;
                                skip1 = true;
                                break;
                                
                            }

                        }
                        if(!skip1){
                        x = x - commands[i];
                        }

                        break;
                    case 2:
                        boolean skip2 = false;
                        for(int[] obstacle : obstacles) {
                            if(obstacle[0] == x && obstacle[1] > y && y + commands[i] > obstacle[1]) {
                                if(i == 0 && obstacle[0] == 0 && obstacle[1] == 0) {
                                    continue;
                                } 
                                y = obstacle[1] - 1;
                                skip2 = true;
                                break;
                                }
                            

                        }
                       if (!skip2) {
                           y = y + commands[i];
                       }
                        break;
                    case 3:
                        boolean skip3 = false;
                        for(int[] obstacle : obstacles) {
                            if(obstacle[1] == y && obstacle[0] > x && x + commands[i] > obstacle[0]) {
                                if(i == 0 && obstacle[0] == 0 && obstacle[1] == 0) {
                                continue;
                                }
                                x = obstacle[0] - 1;
                                skip3 = true;
                                break;
                                
                            }

                        }
                        if(!skip3){
                        x = x + commands[i];      
                        }

                        break;
                }
               // if(obstacles[i])
            }
            System.out.printf("%d. x = %d, y = %d; dirIndex: %d \n",i, x, y, dirIndex);
            int product = (x * x) + (y * y);
            if ( maxDistance < product) {
                maxDistance = product;
            }
        }
        return maxDistance;
    }
    public void setCurrent(boolean[] arr, int index){
        arr[index] = true;
        for(int i = 0; i < arr.length && i != index ; i++) {
            arr[i] = false;
        }
    }
}
