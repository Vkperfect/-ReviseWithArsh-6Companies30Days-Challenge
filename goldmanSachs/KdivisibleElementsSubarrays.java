class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int n = nums.length;
        int ans = 0;
        Set<List<Integer>> subArray=new HashSet<>();
        for (int i = 0; i < n; i++) {
           int totDiv=0;
           List<Integer> temp=new ArrayList<>();
           for(int j=i;j<n;j++){
               temp.add(nums[j]);
               if(nums[j]%p==0){
                   totDiv++;
               }
               if(totDiv<=k){
                   subArray.add(new ArrayList<>(temp));
               }
           }
        }

        
        return subArray.size();
    }
}
