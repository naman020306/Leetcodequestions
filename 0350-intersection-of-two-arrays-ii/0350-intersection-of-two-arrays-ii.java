class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //brute force
      int n = nums1.length;
      int m = nums2.length;
      Arrays.sort(nums1);
      Arrays.sort(nums2);

      ArrayList<Integer> ans = new ArrayList<>();
      int[] vis = new int[m];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(nums1[i]==nums2[j] && vis[j]==0){
                ans.add(nums1[i]);
                vis[j]=1;
                break;
            }
            if(nums2[j]>nums1[i]){
                break;
}}}  
      int [] result = new int[ans.size()];
      for(int i = 0; i<ans.size();i++){
        result[i]=ans.get(i);

      }
      return result;
    }
}