public class Solution {
    // 2n time and n space solution
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, ArrayList<Integer>> inputValues = new HashMap<Integer, ArrayList<Integer>>();
        for(int i = 0; i < nums.length; i++){
            if(inputValues.get(nums[i]) == null){
                ArrayList<Integer> values = new ArrayList<Integer>();
                values.add(i);
                inputValues.put(nums[i], values);
            }else{
                inputValues.get(nums[i]).add(i);
            }
        }
        System.out.println(inputValues);
        int[] result = new int [2];
        for(int i = 0; i < nums.length; i++){
            if(inputValues.get(target - nums[i]) != null && ((target - nums[i]) != nums[i] || inputValues.get(target - nums[i]).size() >1)){
                
                result[0] = i;
                System.out.println("result 0: " + result[0]);
                System.out.println("result 1: " + result[1]);
                if(inputValues.get(target - nums[i]).size() == 1){   
                    result[1] = inputValues.get(target - nums[i]).get(0);
                }else{
                    result[1] = inputValues.get(target - nums[i]).get(1); 
                }
                break;
                
            }
        }
        return result;
    }
}