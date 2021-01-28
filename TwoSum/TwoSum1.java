class Solution {
    public int[] twoSum(int[] nums, int target) {
       // int l=0;
        //int r=nums.length-1;
        int arr[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i];
            if(map.containsKey(diff))
            {
                arr[0]=i;
                arr[1]=map.get(diff);
                return arr;
}
                    map.put(nums[i],i);

}
            return arr;

    }
}
