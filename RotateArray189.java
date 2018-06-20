//解题思路：首先将数组元素翻转，然后将0到(k%length)-1的元素和(k%length)-1到nums.length-1的元素分别进行翻转

class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    
    public void reverse(int[] arr,int start,int end){
        int count=(end-start+1)/2;
        for(int i=0;i<count;i++){
            int temp=arr[start+i];
            arr[start+i]=arr[end-i];
            arr[end-i]=temp;
        }
    }
}