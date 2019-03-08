/*package whatever //do not write package name here */

import java.io.*;

class Sort{
    
    static void sort(int a[],int n){
        
        int lo=0;
        int mid=0;
        int hi=n-1;
        int temp=0;
        
        while(mid<=hi){
            
            
            switch (a[mid]) 
            { 
            case 0: 
            { 
                swap(a,mid,lo);
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: 
            { 
               swap(a,mid,hi);
                hi--; 
                break; 
            } 
            } 
            
        }
        for(int i:a)
	System.out.print(i+" ");
        
    }
    
    static void swap(int a[],int n1,int n2){
        
        int temp=a[n1];
        a[n1]=a[n2];
        a[n2]=temp;
    }
	public static void main (String[] args) {
	
	int a[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
	sort(a,a.length);
	
	}
}
