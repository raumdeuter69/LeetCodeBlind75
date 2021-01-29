class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> output_arr=new LinkedList();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++)
        {
            if(i==0|| nums[i]!=nums[i-1])
            {
                int low=i+1;
                int high=nums.length-1;
                int sum=0-nums[i];
                    while(low<high)
                    {
                        if(sum==nums[high]+nums[low])
                        {
                        output_arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                            while(low<high && nums[low]==nums[low+1])low++;
                        while(low<high && nums[high]==nums[high-1])high--;
                        low++;
                        high--;}
                       /* {
                            if(low)
                        }*/
                        else if (nums[low]+nums[high]>sum)
                            high--;
                        else 
                            low++;
                    }
                
}
}
        return output_arr;
    }
}
