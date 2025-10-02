class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int expected = 1;
        for (int i = 0; i < n; i++) {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            while (expected<nums[i]){
                ans.add(expected);
                expected++;
            }
           if(expected==nums[i])
           {
            expected++;
           }
        }
        while(expected<=nums.length)
        {
            ans.add(expected);
            expected++;
        }
        return ans;
    }
}