// Binary search 



import java.util.Scanner;
class BinrySearch {
    public static void main(String[] args) {
       int n =5;
       int[] arr = {1,2,3,4,5};
       
       int key = 1;
       
       int a =0;
       int b = arr.length -1;
       
       int mid = (b+a)/2;
       int count=0;
       while(a<=b){
           if(arr[mid] > key){
               b = mid-1;
           }
           else if(arr[mid]<key){
               a=mid+1;
           }
           else if(arr[mid] ==key){
               System.out.println(mid);
		count = 1;
               break;
           }
           
           mid = (a+b)/2;
       }
	if(count ==0)
	System.out.println("element not found");
       
    }
}