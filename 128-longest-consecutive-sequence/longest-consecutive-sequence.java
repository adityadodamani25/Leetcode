class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
     int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        
        }
        for(int num:set){
        if(!set.contains(num-1)){
            int current=num;
            count=1;
            while(set.contains(current+1)){
                count++;
                current=current+1;
            }
              maxcount=Math.max(maxcount,count);

        }
    
    }
    return maxcount;
}
}