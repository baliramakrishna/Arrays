/*package whatever //do not write package name here */

//problem is similar to that of min noof hops to reach end;
import java.util.*;

class MaximumSumIncreasingSubsequence {
    
	public static void main (String[] args) {
		
		int a[]={1, 101, 2, 3, 100, 4, 5};
		int n=a.length;
		int temp[]=new int[n];
		
		for(int i=0;i<n;i++)
		temp[i]=a[i];
		
		for(int i=1;i<n;i++){
		    
		    for(int j=0;j<i;j++){
		        
		        if(a[i]>a[j])
		         temp[i]=Math.max(a[i],temp[j]+a[i]);
		        
		    }
		}
		
		int max=temp[0];
		
		for(int k:temp){
		    if(k>max)
		    max=k;
		}
		System.out.println(max);
		
	}
}
