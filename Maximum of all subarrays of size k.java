import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     
     static void print(int a[],int n,int k){
         
         Queue<Integer> q=new LinkedList<Integer>();
         
         for(int i=0;i<k;i++)
         q.add(a[i]);
         System.out.print(q.stream().max((t1,t2)->t1-t2).get()+" ");
         for(int i=k;i<n;i++){
             
            q.remove();
            q.add(a[i]);
            System.out.print(q.stream().max((t1,t2)->t1-t2).get()+" ");
             
         }
         System.out.println();
     }
	public static void main (String[] args)
	 {
	 
	  Scanner s=new Scanner(System.in);
	   int N=s.nextInt();
	   
	   for(int i=0;i<N;i++){
	    int n=s.nextInt();
	    int k=s.nextInt();
	    int a[]=new int[n];
	   
	    for(int j=0;j<n;j++)
	    a[j]=s.nextInt();

	    
	    print(a,n,k);
	       
	   }
	 }
}
