class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int x:nums)
            s.add(x);
        int cnt=s.size();
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            s=new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                s.add(nums[j]);
                if(s.size()==cnt)
                    res++;
            }
        }
        return res;
    }
}