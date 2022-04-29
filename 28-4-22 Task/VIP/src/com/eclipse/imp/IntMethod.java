package com.eclipse.imp;

public class IntMethod {

	public static void main(String[] args) {
		
		int r=62;
		
		int pri=Integer.bitCount(r);
		System.out.println("running bit count = "+pri);
		
		Integer a=180;
		
		byte pri1=a.byteValue();
		System.out.println("running byte value = "+pri1);
		
		int pri2=Integer.compare(r,a);
		System.out.println("running compare = "+pri2);
		
		Integer s=524; 
		
		int pri3=a.compareTo(s);
		System.out.println("running compare to = "+pri3);
		
		String b="2210";
		Integer pri4=Integer.decode(b);
		System.out.println("running decode = "+pri4);
		
		
		double pri5=s.doubleValue();
		System.out.println("running double value = "+pri5);
		
		float pri6=s.floatValue();
		System.out.println("running float value = "+pri6);
		
		int pri7=s.hashCode();
		System.out.println("running hash code = "+pri7);
		
		int pri8=Integer.highestOneBit(130);
		System.out.println("running highest one bit = "+pri8);
		
		long pri9=a.longValue();
		System.out.println("running long value = "+pri9);
		
		int pri10=Integer.lowestOneBit(r);
		System.out.println("running lowest one bit = "+pri10);
		
		
		
		int t1=87;
		System.out.println(Integer.toBinaryString(t1));
		System.out.println(Integer.bitCount(t1));
		
		Integer t2=33;
		byte y= t2.byteValue();
		System.out.println(y);
		
		int firstValue = 120;
        int secondValue = 100;
 
        int result = Integer.compare(firstValue, secondValue);
 
        if (result == 0) 
        {
            System.out.println("firstValue is equal to secondValue");
        }
        else if (result > 0)
        {
            System.out.println("firstValue is greater than the secondValue");
        } 
        else if (result < 0) 
        {
            System.out.println("firstValue is lesser than the secondValue");
        }
        
        int t5=8;
        int y3=10;
        
        int val=Integer.compareUnsigned(t5, y3);
        System.out.println("comparaednsigned mehod will return" + val);
        
        int t7=40;
        int u1=8;
        int u3=Integer.divideUnsigned(t7, u1);
        System.out.println("Remainder: " + u3);
        
        
        Integer t9=11;
        boolean l2=t9.equals(12);
        System.out.println("equals if both integer are same: " + l2);
        
        int g9=Integer.sum(18, 9);
		System.out.println("sum = " + g9);
		
		Integer g10=12;
		String m1=Integer.toHexString(g10);
		System.out.println("Hexodecimal no " + m1);
		
		int g8=Integer.reverse(t7);
		System.out.println("reverse int " + g8);
		
		Integer g5=7;
		int h9=Integer.numberOfTrailingZeros(g5);
		System.out.println("no of tailing zeros " + h9);
        
	}

}
