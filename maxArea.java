public class Solution {
    public int maxArea(int[] height) {
        int leftPoint = 0;
        int rightPoint = height.length - 1;
        int area = 0;
        while (leftPoint < rightPoint){
            area = Math.max (area, Math.min(height[leftPoint], height[rightPoint]) * (rightPoint - leftPoint));
            if (height[leftPoint] < height[rightPoint]){
                leftPoint ++;
            }else{
                rightPoint --;
            }
        }
        return area;
    }
}