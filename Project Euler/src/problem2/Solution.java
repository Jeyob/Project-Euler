package problem2;

public class Solution {

	public static void main(String[] args) {
		
		int i,j,fib; i=1;j=2; fib=0;
		int evenSum = 2;
		
		do {
			fib = i+j;
			System.out.println(fib);
			evenSum+= (fib%2 == 0 ? fib : 0);  
			i=j;j=fib;
		}while(i+j < 4000000);
		
		System.out.println(evenSum);
		
	}
}
