/*package whatever //do not write package name here */


import java.util.*;

class MinimumJumps{
    
	public static void main (String[] args) 
	{
	  int  a[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
	  int n=a.length;
	  int mind[]=new int[n];
	  mind[0]=0;
	  for(int i=1;i<n;i++)
	  mind[i]=10000;
	  int path[]=new int[n];            
		for(int i=1;i<n;i++)
		{
		    for(int j=0;j<i;j++){
		        
		       if(j+a[j]>=i){
		           
		           mind[i]=Math.min(mind[i],mind[j]+1);
		           
		       }
		    }
		}
		for(int k:mind)
		System.out.println(k);
	}
}
