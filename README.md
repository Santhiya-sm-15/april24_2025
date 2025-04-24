# april24_2025
The problem that i solved today in leetcode

1.You are given an array nums consisting of positive integers.

We call a subarray of an array complete if the following condition is satisfied:

The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
Return the number of complete subarrays.

A subarray is a contiguous non-empty part of an array.

Code:
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
