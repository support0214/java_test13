package langPackage03.stringMethod01;

import java.util.Arrays;

public class _11_StringEx11 {

	public static void main(String[] args) {
		// 문자열 분리
		// 1. String클래스의 split()메서드
		// 2. StringTokenizer클래스
		
		String text = "홍길동-아무개-이순신-강감찬";
		String[] name = text.split("-");
		System.out.println(Arrays.toString(name));
		
		for(String i : name)
			System.out.print(i + ", ");
		System.out.println();
		
		for(int i =0; i < name.length; i++) {
			String str = "";
			str += (i==0) ? "" + name[i] : ", " + name[i];
			System.out.print(str);
//			if(i < name.length-1)
//				System.out.print(name[i]+", ");
//			else
//				System.out.print(name[i]);
		}
		System.out.println();
		
		text = "홍길동,아무개&이순신-강감찬";
		String[] names = text.split(",|&|-");
		System.out.println(Arrays.toString(name));
		
		
	}

}
