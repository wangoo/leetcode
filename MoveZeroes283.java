//解题思路：遍历数组发现值为0的元素后，对后续元素进行遍历直到找到一个非0元素进行值交换。
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){ 
                for(int j=i;j<nums.length;j++){                        
                    if(nums[j]!=0){
                        nums[i]=nums[j];
                        nums[j]=0;
                        break;
                    }                   
                }
            }
        }
        
    }
}