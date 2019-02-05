/*package whatever //do not write package name here */

import java.util.*;

class NoofSubsets{

    static int subsets(int a[],int total){
        
        return recur(a,total,a.length-1);
        
    }
    
    static int recur(int a[],int total,int i){
        
        if(total==0)
        return 1;
        if(total<0)
        return 0;
        if(i<0)
        return 0;
        //u can use if else also
        // if(total<a[i])
        // return recur(a,total,i-1);
        //else
        return recur(a,total-a[i],i-1)+recur(a,total,i-1);
        //including element and not including element
    }
    
	public static void main (String[] args) {
		
		int a[]={1, 2, 3, 4, 5,6,7,8,12,14,16,30,10};
		Arrays.sort(a);
		int total=30;
		System.out.println(subsets(a,total));
	}
}
