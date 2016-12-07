package problem1;

public class Solution {

	public static void main(String[] args) {
		
		int[] numbers = new int[1000];
		int sum = 0;
		
		for(int num = 0; num<numbers.length; num++) {
			numbers[num]= num;
		}
		
		System.out.println(numbers.length);
		System.out.println(numbers[999]);
		
		for(int itr : numbers) {
			if(itr%3 == 0 || itr%5 == 0) sum+=itr;
		}
		
		System.out.println(sum);
		
	}
	
}
