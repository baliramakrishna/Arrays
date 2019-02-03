/*package whatever //do not write package name here */

import java.io.*;

class MinDistance{
    
	public static void main (String[] args) {
	    
	     int a[] ={3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
	     int n=a.length;
	     int x=3,y=6;
	     int prev=1000,d=1000,d1=1000;
	     for(int i=0;i<n;i++){
	         
	         if(a[i]==x|| a[i]==y){
	         prev=i;
	         break;
	         }
	     }
	     
	     for(int i=prev+1;i<n;i++){
	         if(a[i]==x||a[i]==y){
	             
	         if(a[i]==a[prev])
	         prev=i;
	         
	         else{
	             
	            d=i-prev;
	            if(d1>d)
	            d1=d;
	         }
	         
	         }
	     }
		
		System.out.println("minimum distance = "+d1);
	}
}
