/*package whatever //do not write package name here */

import java.io.*;

class   MaxSum{
    
    
    static int maxSum(int a[][],int n,int k){
        
        
        if(k>n)
        return -1;
        
        int b[][]=new int[n-k+1][n];
        
        for(int j=0;j<n;j++){
            
            int sum=0;
            
            for(int i=0;i<k;i++)
            sum+=a[i][j];
            
            b[0][j]=sum;
            
            for(int i=1;i<n-k+1;i++){
            sum=sum+a[i+k-1][j]-a[i-1][j];
            b[i][j]=sum;
            }
            
        }
        
        int x=-1,y=-1,max=-10000;
        for(int i=0;i<n-k+1;i++){
            
            int sum=0;
          for(int j=0;j<k;j++)
          sum+=b[i][j];
          
          if(sum>max){
              max=sum;
              x=i;
              y=0;
          }
          
          for(int j=1;j<n-k+1;j++){
              
              sum=sum+b[i][j+k-1]-b[i][j-1];
              if(sum>max){
              max=sum;
              x=i;
              y=j;
          }
              
          }
        }
        
        for(int i=x;i<x+k;i++){
            
            for(int j=y;j<y+k;j++)
            System.out.print(a[i][j]+" ");
            
            System.out.println();
        }
        
        return max;
    }
    
	public static void main (String[] args) {
		
		int[][] mat = { { 1, 1, 1, 1, 1 },  
                { 2, 2, 2, 2, 2 },  
                { 3, 8, 6, 7, 3 },  
                { 4, 4, 4, 4, 4 }, 
            { 5, 5, 5, 5, 5 } }; 
    int k = 3; 
    
    System.out.println("max sum is "+maxSum(mat,5,k));
	}
}
