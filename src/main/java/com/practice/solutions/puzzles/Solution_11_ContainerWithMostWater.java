package com.practice.solutions.puzzles;

public class Solution_11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int leftIndex = 0, rightIndex = height.length - 1;

        int maxArea = 0;
        while (leftIndex < rightIndex) {
            int width = rightIndex - leftIndex;
            int depth = Math.min(height[leftIndex], height[rightIndex]);
            int tempMaxArea = depth * width;
            maxArea = Math.max(tempMaxArea, maxArea);
            if (depth == height[leftIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return maxArea;
    }
}
