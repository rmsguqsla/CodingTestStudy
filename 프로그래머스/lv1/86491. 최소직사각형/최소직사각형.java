class Solution {
    public int solution(int[][] sizes) {
        int maxW = Integer.MIN_VALUE;
        int maxH = Integer.MIN_VALUE;

        for (int i = 0; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];

            if (h > w) {
                w = sizes[i][1];
                h = sizes[i][0];
            }

            maxW = Math.max(maxW, w);
            maxH = Math.max(maxH, h);
        }

        return maxH * maxW;
    }
}