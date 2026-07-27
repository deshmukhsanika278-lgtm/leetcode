class Solution {
    public static void swap( int arr[],int start,int end){
        int  temp = arr[start];
        arr[start]= arr[end];
        arr[end]=temp ;
        start++;
        end-- ;
    }
    public void moveZeroes(int[] arr) {
        int j = -1 ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break ;
            }
        }
        if(j==-1){
            return ;
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,j);
                j++ ;
            }
        }
    }
}