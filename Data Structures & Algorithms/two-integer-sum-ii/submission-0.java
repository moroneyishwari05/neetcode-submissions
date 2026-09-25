class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0; // first position
        int index2 = numbers.length - 1; // last position (avoids array index out of bound error)


        while(index1 < index2){
            int sum = numbers[index1] + numbers[index2];

            if(sum == target){
                return new int[] { index1 + 1, index2 + 1}; // 1-indexed indices
            }

            else if(sum < target){
                index1++;
            }

            else{
                index2--;
            }
                
        }


        return new int[]{};
    }
}
