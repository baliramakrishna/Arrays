/*package whatever //do not write package name here */

import java.io.*;

class TowerOfHanoi{
    
    static int count(int n,char from,char aux,char to){
    
    
    if(n==1){
        System.out.println("move one disk from "+from+" to " +to);
        return 1;
    }
        
      else return  count(n-1,from,to,aux)+count(1,from,aux,to)+count(n-1,aux,from,to);
    
  }
	public static void main (String[] args) {
		
		int n=10000;
		System.out.println(count(n,'A','B','C'));
	}
}
