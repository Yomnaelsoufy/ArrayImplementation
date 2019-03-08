package arrays_lab1;

import java.math.BigInteger;
import java.util.Scanner;
public class MySpecialArrayUtils {
	public static int a[]=new int [2];


	//a)
		public static void reverse(int arr[]) {
			int temp ;for(int i=0;i<arr.length/2;i++) {
				temp=arr[i];
				arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=temp;
				
				
			}
		}
		
		//b)
		
		public static void sumEvenOdd(int[] arr) {
			int s1=0,s2=0;
			
				for(int i=0;i<arr.length;i++) {
					if(arr[i]%2==0)
					{
						s1+=arr[i];
					}
					else {
						s2+=arr[i];
					}
				}
				a[0]=s1;
				a[1]=s2;
			}
		
		
		//c
		public static double average(int[] arr) {
			double av=0,temp;
			if(arr.length==0)
				return 0;
			 for(int i=0;i<arr.length;i++) {
			
				 av+=(double)arr[i] / arr.length;
			}
			
		return av;	
		
		}
		
	//d
		
		public static void moveValue(int[] arr, int val) {
			int c=0,h;
			for(int i=arr.length-1;i>=0;i--) {
				if(arr[i]==val) {
					h=i;
				for(int j=i+1;j<=arr.length-c-1;j++) {
					arr[h++]=arr[j];
				}
					arr[arr.length-c-1]=val;
					c++;
				}
			}
			
			
			
		}
		
		
		//e)
		 public static void transpose(int[][] arr,int st[][]) {
		
			 for(int i=0;i<arr.length;i++)
			 {for(int j=0;j<arr[i].length;j++) {
				st[j][i]=arr[i][j];
			 }
		 }}
public static long fibo(int n) {
	long  p1=0,p2=1,s=0;

	for(long i=0;i<n-2;i++) {
		s=p1+p2;
		p1=p2;
		p2=s;

		   }
	return s;
	
}

}
	 
	 


