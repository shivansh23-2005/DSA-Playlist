class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int second=target-nums[i];
            if(map.containsKey(second))
            {
                list.add(nums[i]);
                list.add(second);
            }
            map.put(nums[i],i);
        }
        int[]ans=new int[list.size()];
        for(int i=0;i<ans.length;i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}