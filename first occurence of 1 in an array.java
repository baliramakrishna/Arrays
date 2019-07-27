/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static int search(int a[],int s,int e){
        
        if(s==e){
            if(a[s]==1)
            return s;
            else
            return -1;
        }
        else if(s>e)
        return -1;
        else{
             int mid=(s+e)/2;
            
            if(a[mid]<a[mid+1])
            return mid+1;
            else if(a[mid]>a[mid-1])
            return mid;
            else if(a[mid]==0)
            return search(a,mid+1,e);
            else
            return search(a,s,mid-1);
        }
    }
	public static void main (String[] args) {
		
		int a[]={0,0,0,1,1,1,1,1,1,1,1};
		System.out.println(search(a,0,a.length-1));
	}
}
