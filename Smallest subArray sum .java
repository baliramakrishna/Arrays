/*package whatever //do not write package name here */

import java.util.*;

class SmallestSubarray{
	public static void main (String[] args) {
	    
	    int a[]={1, 4, 45, 6, 0, 52};
	    int k=51,n=a.length;
	    int temp;int l=56326326,sum=0;
	    for(int i=0;i<n-1;i++){
	        sum=a[i];
	        if(a[i]>k){ //any of the number may greater than the given number;
	            l=1;
	            break;
	        }
	        for(int j=i+1;j<n;j++){
	            
	            sum=sum+a[j];
	            if(sum>k){
	            temp=j-i+1;
	           // System.out.println(temp+" "+i+" "+j);
	            if(temp<l)
	            l=temp;
	            break;
	            
	            }
	        }
	    }
	    if(a[n-1]>k)
	    l=1;
		System.out.println(l);
	}
}
