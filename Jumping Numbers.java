import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {  
     
    static TreeSet<Integer> t=new TreeSet<>();
   static void print(int x,int num){
       
       
       Queue<Integer> q=new LinkedList<>();
       q.add(num);
       
       while(!q.isEmpty()){
           
           num=q.poll();
           
           if(num<=x){
               
               int lastDigit=num%10;
              t.add(num);
               
               if(lastDigit==0)
               q.add(num*10+(lastDigit+1));
               else if(lastDigit==9)
               q.add(num*10+(lastDigit-1));
               else{
                   q.add(num*10+(lastDigit-1));
                   q.add(num*10+(lastDigit+1));
               }
               
               
               
               
           }
           
           
       }
       
       
   }
    static void jumpingNumbers(int x ){
        
        for(int i=0;i<=9;i++)
        print(x,i);
        
        for(int k:t)
        System.out.print(k+" ");
        
    }
	public static void main (String[] args)
	 {
	   Scanner s=new Scanner(System.in);
	   int N=s.nextInt();
	   
	   for(int i=0;i<N;i++){
	   int n=s.nextInt();
	   
	    
	    jumpingNumbers(n);
	    t.clear();
	    System.out.println();
	   
	   }
	  
	 }
}
