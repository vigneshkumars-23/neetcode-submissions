class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> op = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println("nums["+i+"]="+nums[i]);
            // -4, -1, -1, 0, 1, 2
            // nums[i] = -(nums[j] + nums[k])
            // We have the two only always to the right of the number
            if((i-1 >= 0) && nums[i-1] == nums[i])
                continue;
            int start=i+1, end = nums.length-1;
            while(start < end){
                int threeSum = nums[i] + nums[start] + nums[end];
                if(threeSum == 0){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[start]);
                    res.add(nums[end]);
                    op.add(res);
                    //System.out.println(nums[i] + "," + nums[start] + "," + nums[end]);
                    start++;
                    while(nums[start] == nums[start-1] && start < end)
                        start++;
                } else if(threeSum > 0){
                    end--;
                } else{
                    start++;
                }
            }
        }
        return op;
    }
}
