class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = nums1.length - 1;
        int j = nums2.length - 1;
        
        while (i >= 0 && j >= 0){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i--;
                j--;
            }

             else if (nums1[i] > nums2[j]) {
                i--;
            }
            else {
                j--;
            }
        }

        int[] result = new int[set.size()];
        int k = 0;

        for(int n : set){
            result[k++] = n;
        }

        return result;
    }
}