package langPackage03.stringMethod01;

public class _06_StringEx6 {

	public static void main(String[] args) {
		// substring(시작index, 끝index) : 시작index ~ 끝index 직전까지
		// substring(시작index) : 시작index부터 끝까지 모두 다 가
		String str = "공공데이터 융합 웹 애플리케이션 개발자 양성과정2";
		String subStr = str.substring(6,8);
		System.out.println(subStr);
		
		System.out.println(str.substring(9));
		
		String sn = "041121-3789760";
		
		String bir = sn.substring(2,4);
		String bir2 = sn.substring(4,6);
		System.out.println("생일 : " + bir +"월 " + bir2 + "일 입니다");
		
		String age = sn.substring(0,2);
		int age1 = Integer.parseInt(age);	
		int age11 = 23 - age1;
		System.out.println(age11 + "살 입니다");
						
		char ch1 = sn.charAt(7);
		switch(ch1) {
		case '1' : case '3':
			System.out.println("남자 입니다");
			break;
		case '2' : case '4':
			System.out.println("여자 입니다");
		
			
		}
	
}
}

