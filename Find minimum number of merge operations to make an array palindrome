/*package whatever //do not write package name here */

import java.io.*;

class MergeOperationsPalandrome{
    
    
    static int countOperations(int a[]){
        
        int result=0;
        int n=a.length;
        for(int i=0,j=n-1;i<=j;){
            
            if(a[i]==a[j]){
                
                i++;
                j--;
            }
            
            else if(a[i]>a[j]){
                j--;
                a[j]+=a[j-1];
                result++;
                
            }else{
                
                i++;
                a[i]+=a[i-1];
                result++;
            }
        }
        
        return result;
    }
    
	public static void main (String[] args) {
		
		int a[]={11, 14, 15, 99};
		System.out.println(countOperations(a));
		
	}
}
