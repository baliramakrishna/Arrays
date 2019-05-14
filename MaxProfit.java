/*package whatever //do not write package name here */

import java.io.*;

class MaxProfit{
    
    static int maxProfit(int a[],int n){
        
        int profit,maxprofit=0;
        for(int i=0;i<n;i++){
            
            profit=maxDiff(a,0,i)+maxDiff(a,i+1,n-1);
            
            if(maxprofit<profit)
            maxprofit=profit;
            
        }
        return maxprofit;
    }
    
    static int maxDiff(int a[],int s,int e){
        
        int diff=0,tdiff;
        int maxvalue=a[e];
        
        for(int i=e-1;i>=s;i--){
            
            if(a[i]>maxvalue)
            maxvalue=a[i];
            else{
                
                tdiff=maxvalue-a[i];
                
                if(tdiff>diff)
                diff=tdiff;
                
            }
            
        }
        return diff;
        
    }
	public static void main (String[] args) {
		
		int price[] ={90, 80, 70, 60, 50}; 
        int n = price.length; 
        System.out.println("Maximum Profit = "+ maxProfit(price, n)); 
	}
}
