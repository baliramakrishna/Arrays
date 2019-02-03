/*package whatever //do not write package name here */

import java.io.*;

class CountStepsTOGetGivenArray{
    
    static int givenArray(int a[]){
        
       int result=0;
       int n=a.length;
       while(true){
           int i;
           int count=0;
          for(i=0;i<n;i++){
              
               if(a[i]%2==1)
               break;
               
               else if(a[i]==0)
               count++;
              
          } 
          
          
         if(count==n)
         return result;
         
         if(i==n){
             
             for(int k=0;k<n;k++)
             a[k]=a[k]/2;
             result++;
         }
         else{
             
               for(int j=i;j<n;j++){
                 
                 if(a[j]%2==1){
                 a[j]--;
                 result++;
                 }
               }
             
           }   
         
           
           
       }
       
        
    }
	public static void main (String[] args) {
		
		int a[]={1,200,0,9,100};
		
		System.out.println(givenArray(a));
		
	}
}
