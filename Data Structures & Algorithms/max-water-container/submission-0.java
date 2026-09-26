class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int max_water = 0;

        while(i < j){
            int width = j - i;
            int height = Math.min(heights[i], heights[j]);

            int area = width * height;

            max_water = Math.max(max_water, area); 

            if(heights[i] < heights[j]){
                i++;
            }       

            else{
                j--;
            }    

        }

        return max_water;
    }
}
