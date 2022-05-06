package com.xworkz.method;

public class StringBufferImp {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("StringBuffer");

		str.append("String");
		System.out.println("appending :  " + str);

		str.append('u');
		System.out.println("append character : " + str);

		str.append(str, 3, 6);
		System.out.println("append charsequence : " + str);

		str.append(true);
		System.out.println("append boolean : " + str);

		str.append(3.4d);
		System.out.println("append double : " + str);

		str.append(3);
		System.out.println("append int : " + str);

		str.append(89l);
		System.out.println("append long : " + str);

		str.append(45f);
		System.out.println("append float : " + str);

		str.appendCodePoint(2);
		System.out.println("append code point :" + str);

		StringBuffer str1 = new StringBuffer("Bangalore is Smart City");

		int code = str1.capacity();
		System.out.println("capacity of string : " + code);

		StringBuffer del = str1.delete(2, 5);
		System.out.println("delition of  string : " + del);

		StringBuffer del1 = str1.deleteCharAt(2);
		System.out.println("delition of character string : " + del1);

		StringBuffer rep = str1.replace(0, 4, "BANGA ");
		System.out.println("replace of the string : " + rep);

		StringBuffer rev = str1.reverse();
		System.out.println("reverse of the string : " + rev);

		char ch = str1.charAt(4);
		System.out.println("char of the string : " + ch);

		int cp = str1.codePointAt(2);
		System.out.println("code of the string : " + cp);

		int cp1 = str1.codePointBefore(2);
		System.out.println("code of the string : " + cp1);

		int cp2 = str1.codePointCount(2, 5);
		System.out.println("code of the string : " + cp2);

		int ind = str1.indexOf("Bang");
		System.out.println("index of string : " + ind);

		StringBuffer ins = str1.insert(4, 'A');
		System.out.println("insert the value : " + ins);

	}
}
