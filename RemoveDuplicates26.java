//����˼·������������Ԫ�أ����ַ��ظ�ֵʱͳ����ֵlen+1��ͬʱ��Ԫ����ĵ�len��Ԫ�ص�ֵ��Ϊ��ǰ���ظ�Ԫ�ص�ֵ��
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