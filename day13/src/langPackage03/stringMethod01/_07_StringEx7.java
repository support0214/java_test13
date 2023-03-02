package langPackage03.stringMethod01;

public class _07_StringEx7 {

	public static void main(String[] args) {
		// contains(문자열) : 문자열이 포함되어 있는지 반환값은 true false
		String str = "java program.png";
		boolean bool = str.contains("va"); // 자바가 포함되어있는지
		System.out.println(bool);
		
		// endsWith(문자열) : 문자열로 끝나는지 검색
		
		bool = str.endsWith(".txt"); 
		System.out.println(bool);
		
		if(bool)
			System.out.println("그림파일 입니다");
		else
			System.out.println("그림파일이 아닙니다");
			
		
		

	}

}
