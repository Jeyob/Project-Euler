/*
 * Problem 5 
 * 
 * is about finding the smallest number that is evenly divisible by all numbers ranging from 1-20
 * which thought of it in another way is the same thing as trying to find the least common multiple of the set
 * {1-20}.
 * 
 * 
 */


public class Solution {
	
	public static long gcd (long a, long b) {
		long rest = 0;
		
		if(b > a){
			//swap positions
			long temp = a;
			a = b;
			b = temp;
		}
		while(b>0) {
			rest = b;
			b = a%b;
			a = rest;
		}
		return a;
	}
	
	public static long gcd(int[] set) {
		long result = set[0];
		for(int i = 1;i<set.length;i++) result=gcd(result, set[i]);
		return result;
	}
	
	public static long lcd(long a, long b) {
		return Math.abs(a*b)/gcd(a, b);
	}
	
	public static long lcd(long[] set) {
		long result = set[0];
		
		for(int i = 1;i<set.length;i++) result = lcd(result, set[i]);
		
		return result;
	}
	
	public static void main(String[] args) {
	
	long[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	long result = Solution.lcd(input);
	System.out.println(result); 
		
		
		}
	}
