package arrays;


import java.util.*;

/**
 * Created by daniel on 10/17/17.
 */
public class LC218_SkylineProblem {
    class Tuple implements Comparable<Tuple> {
        int x;
        int y;

        boolean start;

        public Tuple(int x, int y, boolean start) {
            this.x = x;
            this.y = y;
            this.start = start;
        }

        public boolean start() {
            return start;
        }

        public boolean end() {
            return !start;
        }

        @Override
        public int compareTo(Tuple o) {
            if (x != o.x)
                return Integer.compare(x, o.x);
            return Integer.compare(y, o.y);
        }

        @Override
        public String toString() {
            StringBuilder br = new StringBuilder();
            br.append("(").append(x).append(" ,").append(y).append(" ,");
            br.append(start ? "s)" : "e)");
            return br.toString();
        }
    }

    public List<int[]> getSkyline(int[][] buildings) {
        List<Tuple> points = new ArrayList<>();
        List<int[]> criticalPoints = new ArrayList<>();

        for (int[] building : buildings) {
            points.add(new Tuple(building[0], building[2], true));
            points.add(new Tuple(building[1], building[2], false));
        }

        Collections.sort(points);

        Queue<Integer> queue = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        queue.add(0);

        for (Tuple point : points) {
            if (point.start) {
                if (queue.peek() < point.y) {
                    int[] criticalPoint = {point.x, point.y};
                    criticalPoints.add(criticalPoint);
                }
                queue.add(point.y);
            } else {
                if (queue.peek() == point.y) {
                    queue.poll();
                    int[] criticalPoint = {point.x, queue.peek()};
                    criticalPoints.add(criticalPoint);
                }

                if (queue.peek() > point.y) {
                    queue.remove(point.y);
                }
            }
        }

        return criticalPoints;
    }

    public static void main(String[] args) {
        int[][] building = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        List<int[]> skyline = new LC218_SkylineProblem().getSkyline(building);

    }
}