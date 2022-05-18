class Solution {
    public void moveZeroes(int[] nums) {
        if (nums== null || nums.length ==0)
            return;
        int id=0;
        for(int i =0;i<nums.length ;i++)
        {
            if (nums[i] !=0){
                nums[id++]= nums[i]; 
            }
        }
        while (id < nums.length){
            nums[id++] =0;
        }
        return ;
    }
}




