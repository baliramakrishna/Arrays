/*package whatever //do not write package name here */

import java.io.*;

class MinimumElement{
    
    static int minimum(int a[],int s,int e){
        
        if(s>e)
        return -1;
        else if(s==e)
        return a[s];
        
        int mid=(s+e)/2;
        
        if(a[mid]>a[mid+1])
        return a[mid+1];
        else if(a[mid]<a[mid-1])
        return a[mid];
        else if(a[e]>a[mid])
        return minimum(a,s,mid-1);
        else
        return minimum(a,mid+1,e);
    }
    
	public static void main (String[] args) {
		
		int a[]={5, 6, -4,-3,-2,-1,0,1, 2, 3, 4};
		System.out.println(minimum(a,0,a.length-1));
		
	}
}
