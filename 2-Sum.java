public class Solution {
    // 2n time and n space solution
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> inputValues = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            inputValues.put(nums[i], i);
        }
        int[] result = new int [2];
        for(int i = 0; i < nums.length; i++){
            if(inputValues.get(target - nums[i]) >= 0){
                result[0] = inputValues.get(target - nums[i]);
                result[1] = i;
            }
        }
        return result;
    }
}