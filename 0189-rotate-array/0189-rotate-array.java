class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        //making the temp array by last bcz right rotation
        int temp[] = new int[k];
        for(int i=0;i<k;i++){
            temp[i]=nums[n-k+i];
        }

        //shifting
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];

        }

        //put temp back
        for(int i = 0;i<k;i++){
            nums[i]=temp[i];
        }
    }
}