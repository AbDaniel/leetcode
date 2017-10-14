package graphs;

import java.util.Optional;
import java.util.Queue;
import java.util.Stack;

import static util.StringHelper.print2DIntArray;

/**
 * Created by daniel on 10/8/17.
 */
public class MaxAreaOfIsland {
    class Tuple {
        int x;
        int y;

        public Tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }

        return max;
    }


    public int dfs(int[][] grid, int startX, int startY) {
        int count = 0;
        int maxX = grid.length;
        int maxY = grid[0].length;

        Tuple start = new Tuple(startX, startY);

        Stack<Tuple> stack = new Stack<>();
        stack.add(start);

        while (!stack.isEmpty()) {
            count += 1;
            Tuple current = stack.pop();
            int x = current.x;
            int y = current.y;

            //visit
            grid[x][y] = -1;

            //Left
            if (x - 1 >= 0) {
                if (grid[x - 1][y] == 1) {
                    grid[x - 1][y] = -1;
                    stack.add(new Tuple(x - 1, y));
                }
            }

            //Right
            if (x + 1 < maxX) {
                if (grid[x + 1][y] == 1) {
                    grid[x + 1][y] = -1;
                    stack.add(new Tuple(x + 1, y));
                }
            }

            //Top
            if (y + 1 < maxY) {
                if (grid[x][y + 1] == 1) {
                    grid[x][y + 1] = -1;
                    stack.add(new Tuple(x, y + 1));
                }
            }

            //Bottom
            if (y - 1 >= 0) {
                if (grid[x][y - 1] == 1) {
                    grid[x][y - 1] = -1;
                    stack.add(new Tuple(x, y - 1));
                }
            }


        }

        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
        print2DIntArray(arr);
        int solution = new MaxAreaOfIsland().maxAreaOfIsland(arr);
        System.out.println(solution);
    }
}
