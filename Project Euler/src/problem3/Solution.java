package problem3;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

	private static BigInteger gcd(BigInteger a, BigInteger b) {
		BigInteger remainder;
		while (b != BigInteger.ZERO) {
			remainder = a.mod(b);
			a = b;
			b = remainder;
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		BigInteger number = new BigInteger("600851475143");
		BigInteger k = new BigInteger("2");
		BigInteger x;
		BigInteger y;
		BigInteger d = new BigInteger("0");
		BigInteger dMax = new BigInteger("0");
		Random rnd = new Random();
		Set<BigInteger> map = new TreeSet<BigInteger>();
		
		do {
			x = new BigInteger(number.bitLength(), rnd);
		}while(x.compareTo(number) > 0);
		
		y = x;
		BigInteger i = new BigInteger("1");

		while (true) {
				i = (i.add(BigInteger.ONE));
				x = ((x.multiply(x)).subtract(BigInteger.ONE)).mod(number);
				d = Solution.gcd(y.subtract(x), number);
				if(!d.equals(BigInteger.ONE) && !d.equals(number))
						if(!map.contains(d))
							map.add(d);
				if (i.equals(k)){
					y = x;
					k = k.multiply(new BigInteger("2"));
				}
			}
		
		}
}
	



