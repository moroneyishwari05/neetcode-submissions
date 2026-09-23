class Solution {
    public int subarraySum(int[] nums, int k) {
        int currSum = 0;
        int totalSubarrays = 0;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for(int n : nums){
            currSum += n;
        

            if (map.containsKey(currSum - k)) {
                totalSubarrays += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return totalSubarrays;
    }
}