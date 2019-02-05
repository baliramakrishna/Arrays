/*package whatever //do not write package name here */

import java.io.*;

class AllSubSets{
    
	public static void main (String[] args) {
		
		int a[]={1,2,3,4};
		
		int n=a.length;
		
		String b;
		int l;
		for(int i=1;i<Math.pow(2,n);i++){
		    
		    b=Integer.toBinaryString(i);
		    char ch[]=b.toCharArray();
		    l=ch.length;
		    int k=1;
		   for(int p=l-1;p>=0 ;p--){
		       
		       if(ch[p]=='1')
		       System.out.print(a[n-k]+" ");
		       k++;
		   }
		    System.out.println();
		}
		
	}
}
