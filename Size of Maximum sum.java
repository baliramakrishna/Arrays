/*package whatever //do not write package name here */

import java.io.*;

class SizeOfMaximumSum{
    
    static  int sizeofmax(int a[]){
        
        int mf=0,max=0,n=a.length, e=0,s=0,s1=1;
        for(int i=0;i<n;i++){
            
            mf+=a[i];
            if(max<mf){
                max=mf;
                e=i;
                s=s1;
            }
            if(mf<0){
            mf=0;
            s1=i;
            }
            
            
        }
        // int i;
        // for(i=e;i>=0 && max>0;i--){
        //     max-=a[i];
        // }
        return e-s;
        
    }
	public static void main (String[] args) {
		
		int a[]={1, -2, 1, 1, -2, 1};
		System.out.println(sizeofmax(a));
	}
}
