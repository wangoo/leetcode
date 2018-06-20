//解题思路：遍历数组中元素，发现非重复值时统计数值len+1，同时将元素组的第len个元素的值置为当前非重复元素的值。
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int len=1;
        for(int i=0;i<nums.length-1;i++){            
            if(nums[i]==nums[i+1]){             
                continue;
            }else{               
                len++;
                nums[len-1]=nums[i+1];                               
            }
        }       
        return len;
    }
}