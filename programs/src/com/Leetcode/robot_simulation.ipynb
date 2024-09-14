import matplotlib.pyplot as plt

def robotSim(commands, obstacles):
    dirs = [(0, 1), (1, 0), (0, -1), (-1, 0)]  # north, east, south, west
    x, y = 0, 0
    dirsIndex = 0
    maxdistance = 0
    path = [(x, y)]

    obstacleSet = set(map(tuple, obstacles))

    for command in commands:
        if command == -2:  # turn left
            dirsIndex = (dirsIndex - 1 + 4) % 4
        elif command == -1:  # turn right
            dirsIndex = (dirsIndex + 1) % 4
        else:  # move robot
            for _ in range(command):
                nextX = x + dirs[dirsIndex][0]
                nextY = y + dirs[dirsIndex][1]
                if (nextX, nextY) in obstacleSet:  # obstacle hit, abort
                    break
                x, y = nextX, nextY
                path.append((x, y))
                distanceSquared = x*x + y*y
                maxdistance = max(maxdistance, distanceSquared)

    return path, maxdistance

def plot_robot_path(commands, obstacles):
    path, max_distance = robotSim(commands, obstacles)

    # x, y co-ordinates
    x_coords, y_coords = zip(*path)

    # plot
    plt.figure(figsize=(12, 12))
    plt.plot(x_coords, y_coords, 'b-', label='Robot Path')
    plt.scatter(x_coords[0], y_coords[0], color='green', s=100, label='Start')
    plt.scatter(x_coords[-1], y_coords[-1], color='red', s=100, label='End')

    # plot obstacles
    obstacle_x, obstacle_y = zip(*obstacles)
    plt.scatter(obstacle_x, obstacle_y, color='orange', s=100, marker='s', label='Obstacles')

    # -> for dirs
    for i in range(len(x_coords) - 1):
        plt.arrow(x_coords[i], y_coords[i],
                  x_coords[i+1] - x_coords[i], y_coords[i+1] - y_coords[i],
                  head_width=0.3, head_length=0.3, fc='b', ec='b', length_includes_head=True)

    plt.title("Robot Path Visualization")
    plt.xlabel("X coordinate")
    plt.ylabel("Y coordinate")
    plt.grid(True)
    plt.legend()
    plt.axis('equal')


    plt.text(0.05, 0.95, f'Max Distance²: {max_distance}', transform=plt.gca().transAxes,
             verticalalignment='top', bbox=dict(boxstyle='round', facecolor='white', alpha=0.8))

    plt.show()

commands = [4, -1, 3, -2, 5, 2, -2, 6, -1, 4, -1, 3, -2, 7]
obstacles = [(2, 2), (3, 3), (-2, 5), (5, -2), (0, 4), (-3, -3), (4, 0)]

plot_robot_path(commands, obstacles)
