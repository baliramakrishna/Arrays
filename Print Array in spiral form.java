import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	   
	   Scanner s=new Scanner(System.in);
	   int t=s.nextInt();
  
        while (t-- > 0) { 
          
           int bottom=s.nextInt();
           int right=s.nextInt();
           
           int top=0;
           int left=0;
           
           int a[][]=new int[bottom][right];
           
           for(int i=0;i<bottom;i++)
           for(int j=0;j<right;j++)
           a[i][j]=s.nextInt();
           
           bottom=bottom-1;
          right=right-1;
          StringBuffer b=new StringBuffer("");
           
           while(left<=right && top<=bottom){
               
               for(int i=left;i<=right;i++)
               b.append(a[top][i]+" ");
               
               top++;
               
               for(int i=top;i<=bottom;i++)
               b.append(a[i][right]+" ");
               
               right--;
               
               if(top<=bottom){
                   
                   for(int i=right;i>=left;i--)
                   b.append(a[bottom][i]+" ");
                   
                   bottom--;
               }
               
               if(left<=right){
                   
                   for(int i=bottom;i>=top;i--)
                   b.append(a[i][left]+" ");
                   
                   left++;
               }
               
           }
           
           System.out.println(b);
        
        }
	  
	  
	 }
}
