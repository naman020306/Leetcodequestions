class Solution {
    public int singleNumber(int[] nums) {
        //brute
        // int n = nums.length;
        // for(int i = 0;i<n;i++){   
        //     int num = nums[i];
        //     int cnt = 0;
        //     for(int j = 0;j<n;j++){
        //         if(nums[j]==num){
        //             cnt++;
        //         }

        //     }
        //     if(cnt == 1){
        //         return num;
        //     }
        // }
        // return -1;
        
        //better approach is hashing but for bigger inputs we use map data structure 

        //optimal appraoc
        int n = nums.length;
        int xor = 0;
        for(int i=0;i<n;i++){
            xor ^= nums[i];
        }
        return xor;

    }
}