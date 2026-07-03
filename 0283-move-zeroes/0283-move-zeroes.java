class Solution {
    public void moveZeroes(int[] nums) {
        //brute force
        // int n = nums.length;
        // ArrayList<Integer> temp = new ArrayList<>();
        // for(int i = 0;i<n;i++){
        //     if(nums[i]!=0){
        //         temp.add(nums[i]);
        //     }
        // }
        // int nz = temp.size();
        // for(int i =0;i<nz;i++){
        //     nums[i] = temp.get(i);
        // }
        // for(int i = nz;i<n;i++){
        //     nums[i] =0;
        // }
        //optimal
        int n = nums.length;
        int j = 0;  //idx
        for(int i =0;i<n;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}