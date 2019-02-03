/*package whatever //do not write package name here */

import java.util.*;

class MinDiff{
    
    
    static int mindiff(int a[]){
        
        //sort the Array
        Arrays.sort(a);
        int n=a.length;
        int mind=1000000000,d=0; //take min difference as a large value
        for(int i=0;i<n-1;i++){
            
            d=Math.abs(a[i]-a[i+1]);
            if(d<mind)
            mind=d;
            
        }
        
        return mind;
    }
	public static void main (String[] args) {
		
		int a[]={30, 5, 20, 9};
		System.out.println(mindiff(a));
	    
	    
	}
}
