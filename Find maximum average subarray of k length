/*package whatever //do not write package name here */

import java.io.*;

class MAXAVERAGE{
    
	public static void main (String[] args) {
		
		int a[]={1, 12, -5, -6, 50, 3};
		int n=a.length;
	    int k=4;
	    int s=0,e=0;
	    double sum=0,avg=0,mavg=0;
	    
	    if(n<k)
	    System.out.println("not possible");
	    
	    for(int i=0;i<k;i++)
	    sum+=a[i];

	    avg=sum/k;
	    mavg=avg;
	    for(int i=k;i<n;i++){
	        
	        sum=sum-a[i-k]+a[i];
	        avg=sum/k;
	        if(avg>mavg){
	        mavg=avg;
	        s=i-k;
	        e=k;
	        
	        }
	    }
			System.out.println("maximum average is "+mavg+" between "+s+" and "+e+" indices");
	}
}
