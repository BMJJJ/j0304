package t2_array;

import java.util.Arrays;

public class Test6_1 {
	public static void main(String[] args) {
		char[] strArray = {'k','o','r','e','a'};
		//char의 배열은 문자의 결합이므로 문자열이 된다
		for(int i =0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		System.out.println();
		
		System.out.println(strArray);
		System.out.println("===========");
		
		System.out.println("strArray의 길이 : " + strArray.length);
		System.out.println();
		
		System.out.println("strArray을 문자로변환 : " + Arrays.toString(strArray));
		System.out.println();
		
		for(int i =0; i<strArray.length; i++) {
			System.out.println("strArray["+i+"] = " + strArray[i]);
		}
		System.out.println();
		
		String str = "korea";
		//현재 문자열중에서 특정 인덱스에 위치한 문자를 반환? charAt()
		//st
		for(int i =0; i<str.length(); i++) {
			System.out.println("str("+i+") = " +str.charAt(i));
		}				
	}
}
