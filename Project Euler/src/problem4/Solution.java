package problem4;

public class Solution {
	
	public static boolean isPalindrom(int num) {
		StringBuilder s = new StringBuilder(num+"");
		s.reverse();
		return s.toString().equals(num+"");
	}
	public static void main(String[] args) {
		int maxPalindrom = 0;
		int temp;
		
		for(int y = 999; y>=100; y--) {
			for (int x = 100;x <= 999; x++) {
				temp = x*y;
				if(Solution.isPalindrom(temp)){
					maxPalindrom = temp > maxPalindrom ? temp : maxPalindrom;
				}		
			}
		}
		System.out.println(maxPalindrom);		
	}
}
