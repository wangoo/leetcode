//����˼·���������鷢��ֵΪ0��Ԫ�غ󣬶Ժ���Ԫ�ؽ��б���ֱ���ҵ�һ����0Ԫ�ؽ���ֵ������
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