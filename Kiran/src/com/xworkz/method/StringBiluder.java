package com.xworkz.method;

public class StringBiluder {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		builder.append("java");
		System.out.println("String is=" + builder);

		StringBuilder builder1 = new StringBuilder();
		builder1.append("java");
		int unicode = builder1.codePointAt(1);
		System.out.println("Unicode of charpointat is " + unicode);

		StringBuilder builder2 = new StringBuilder("xworkzodc");
		builder2.append("odc");
		System.out.println("String is=" + builder2);

		StringBuilder builder3 = new StringBuilder(10);
		char ch = builder2.charAt(1);
		System.out.println("StringBuilder object is= " + builder2);
		System.out.println("char at position is= " + ch);

		StringBuilder sbf = new StringBuilder("my life my rules");
		int unicodes = sbf.codePointBefore(2);
		System.out.println("Unicode of character at position =" + unicodes);

		StringBuilder str = new StringBuilder();
		str.capacity();
		System.out.println("String2 capacity= " + str.capacity());

		str.ensureCapacity(4);
		System.out.println("String3 ensurecapacity=" + str.capacity());

		int index = builder2.indexOf("or");
		System.out.println("indexof is = " + index);

		int index1 = builder2.lastIndexOf("rk", 7);
		System.out.println("index of last is=" + index1);

		int length = builder2.length();
		System.out.println("length of string is=" + length);

		StringBuilder bu = builder2.replace(1, 7, "w o z ");
		System.out.println("After Replace() String = " + bu.toString());

		StringBuilder str1 = new StringBuilder("singleinheritance");
		StringBuilder reverseStr = str1.reverse();
		System.out.println("Reverse String = " + reverseStr.toString());

		StringBuilder str2 = new StringBuilder("RcB");
		str2.setCharAt(2, 'C');
		System.out.println("After setCharAt() String = " + str2.toString());

		StringBuilder str3 = new StringBuilder("MultipleInheritance");
		System.out.println("String contains = " + str3);
		System.out.println("SubSequence = " + str3.substring(5));

		StringBuilder sop = new StringBuilder("multilevel");
		System.out.println("String contains = " + sop.toString());

		StringBuilder del = str3.delete(2, 5);
		System.out.println("After removal String =" + del);

		StringBuilder sop1 = new StringBuilder("multilevel");
		sop1.setLength(10);
		System.out.println("After setLength String = " + sop1.toString());

		char[] array = new char[7];
		str3.getChars(0, 7, array, 0);
		System.out.print("Char array contains : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
