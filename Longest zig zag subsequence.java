import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 { 
     
     static void zigzag(int arr[],int n)
    {
        int pos_count = 1;
        int neg_count = 1;
        for(int i = 1; i < n; ++i) 
        {
            if (arr[i-1] < arr[i]) 
            {
                pos_count = neg_count + 1;
            }
            if (arr[i-1] > arr[i]) 
            {
                neg_count = pos_count+1;
            }
        }
        System.out.println(Math.max(pos_count, neg_count));
    }
	public static void main (String[] args) throws IOException
	 {
	   
	   Scanner s=new Scanner(System.in);
	   int t=s.nextInt();
  
        while (t-- > 0) { 
          
           int n=s.nextInt();
           int a[]=new int[n];
           
           for(int i=0;i<n;i++)
           a[i]=s.nextInt();
          
          zigzag(a,n);
          
          
        }
	  
	  
	 }
}
