package Solution6;

import java.math.BigInteger;

public class Solution {
	public static void main(String[] a){
		BigInteger sumOfHundred = new BigInteger("5050");
		BigInteger SumSqures = new BigInteger("1");
		
		for(int i = 2;i<101;i++){
		SumSqures =	SumSqures.add(new BigInteger(i + "").pow(2));
		}
		
		sumOfHundred = sumOfHundred.pow(2);
		
		BigInteger sum = sumOfHundred.subtract(SumSqures);
		
		System.out.println(sum);
		
	}
}
