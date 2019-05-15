import java.util.*;

class SmallestSubarray{
    
    static int minSize(int a[],int k,int n){
        
        int s=0,e=0,sum=0,min=Integer.MAX_VALUE;
        
       while(e<n){
           
           while(sum<=k && e<n)
           sum+=a[e++];
           
           while(s<n && sum>k){
             
               
               if(e-s <min){
                   min= e- s;
               }
                 sum-=a[s++];
           }
           
           
           
       }
        
        return min;
    }
	public static void main (String[] args) {
	    
	    int a[]={1, 4, 45, 6, 0, 19};
	    int k=51,n=a.length;
	    System.out.println("smallest subarray length is "+minSize(a,k,n));
	    
}
}
