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