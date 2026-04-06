class Solution {
    public int findMin(int[] nums) {
                int left = 0;
                        int right = nums.length - 1;

                                while (left < right) {
                                            int mid = (left + right) / 2;

                                                        if (nums[mid] > nums[right]) {
                                                                        left = mid + 1;   // go right
                                                                                    } else {
                                                                                                    right = mid;      // go left including mid
                                                                                                                }
                                                                                                                        }

                                                                                                                                return nums[left]; 
    }
}