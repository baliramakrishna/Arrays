import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 { 
     
     static int mod=(int)(Math.pow(10,9)+7);
	public static void main (String[] args) throws IOException
	 {
	   
	   Scanner s=new Scanner(System.in);
	   int t=s.nextInt();
  
        while (t-- > 0) { 
          
           int n=s.nextInt();
         long a[]=new long[n];
           
           for(int i=0;i<n;i++)
           a[i]=s.nextLong();
          
          long sum=0;
           
           int count[]=new int[32];
           int ncount[]=new int[32];
          
              
              for(int i=0;i<n;i++){
                  
                  int p=0;
                  
                  long temp=a[i];
                  while(p!=32){
                     
                     long m=temp&1;
                     temp=temp>>1;
                     if(m==0)
                     ncount[p++]++;
                     else
                     count[p++]++;
                      
                  }
                  
              }
              
              for(int i=0;i<32;i++)
                 sum=(sum+(count[i]*ncount[i]*2))%mod;
              
             System.out.println(sum);
        }
	  
	  
	 }
}
