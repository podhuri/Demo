package SeleniumBasics;

import java.math.BigDecimal;

public class WrapperExample {

	public static void main(String[] args) {
		
		
		/*Integer i1 = Integer.parseInt("11100010000",2); 
		System.out.println(i1);
		
		BigInteger  a= new BigInteger("1233462619861804786374634563546562723565627382382888888737");
		System.out.println(a.add(new BigInteger("1")));
		//System.out.println(a+ new BigInteger("1"));*/
		
		double a = 0.02;
		double b = 0.03;
		double c = b-a;
		System.out.println(c);
		
		BigDecimal a1 = new BigDecimal("1");
		//BigDecimal b1 = new BigDecimal("0.03");
		//BigDecimal c1 = b1.subtract(a1);
		
		//System.out.println(BigDecimal.TEN);
		
		//System.out.println(a1.toString());
		//System.out.println(a1.movePointLeft(2));
		System.out.println(a1.remainder(a1, null));
		
		
	}

}
