/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	    
	Scanner s1=new Scanner(System.in);
	int k=s1.nextInt();
	int a[] = {3, 7, 90, 20, 10, 50, 40};
	int n=a.length;
	int sum=0,mavg,mavg1,avg,s=1000,e=100;
	for(int i=0;i<k;i++)
	sum+=a[i];
	
	mavg=sum/k;
	mavg1=mavg;
	
	for(int i=k;i<n;i++){
	   sum=sum-a[i-k]+a[i] ;
	   avg=sum/k;
	   if(mavg>avg){
	   mavg=avg;
	   s=i-k+1;
	   e=i;
	   }
	    
	    
	}
	if(mavg1==mavg){
	s=0;
	e=k-1;
	}
	System.out.println("min avg="+mavg+" between "+s+" and " + e);
	   
	}
}
