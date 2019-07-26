/*package whatever //do not write package name here */

import java.io.*;

class Median{
    
    public static double median(int a[],int b[]){
        
        if(a.length>b.length)
        return median(b,a);
        
        int n=a.length;
        int m=b.length;
        
        int low=0;
        int high=n;
        
        while(low<=high){
            
            int px=(low+high)/2;
            int py=(n+m+1)/2-px;
            
          int maxleftx=(px==0)?Integer.MIN_VALUE:a[px-1];
          int minrightx=(px==n)?Integer.MAX_VALUE:a[px];
          
          int maxlefty=(py==0)?Integer.MIN_VALUE:b[py-1];
          int minrighty=(py==m)?Integer.MAX_VALUE:b[py];
          
          if(maxleftx<=minrighty && maxlefty<=minrightx){
              
              if((n+m)%2==0){
                  return (double)(Math.max(maxleftx,maxlefty)+Math.min(minrightx,minrighty)/2);
              }
              else
              return (double)(Math.max(maxleftx,maxlefty));
          }
        else if(maxleftx>minrighty)
          high=px-1;
          else
          low=px+1;
            
        }
        
        return -20000;
    }
	public static void main (String[] args) {
		
		int a[] = {-5, 3, 6, 12, 15};
        int b[]= {-12, -10, -6, -3, 4, 10};
        System.out.println(median(a,b));
		
	}
}
