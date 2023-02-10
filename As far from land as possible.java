class Solution {
    private static final int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        if (queue.isEmpty() || queue.size() == n * m) {
            return -1;
        }

        int maxDistance = -1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];

            for (int[] dir : dirs) {
                int a = x + dir[0];
                int b = y + dir[1];
                if (a >= 0 && a < n && b >= 0 && b < m && grid[a][b] == 0) {
                    grid[a][b] = grid[x][y] + 1;
                    maxDistance = Math.max(maxDistance, grid[a][b] - 1);
                    queue.offer(new int[]{a, b});
                }
            }
        }
        return maxDistance;    
    }
}