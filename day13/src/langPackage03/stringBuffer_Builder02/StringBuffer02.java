package langPackage03.stringBuffer_Builder02;

public class StringBuffer02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("010");
		System.out.println("capacity : " + sb.capacity());
		
		// 맨 뒤에 부착
		sb.append("1111");
		System.out.println(sb);
		
		// 원하는 index에 글자 삽입
		sb.insert(3, "-");
		System.out.println(sb);
		
		// 원하는 index의 글자 삭제
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		// 원하는 시작index~끝index직전까지 삭제
		sb.delete(0, 3); // 3직전까지 지움
		System.out.println(sb);
		
		// 원하는 위치의 값을 다른값으로 변경
		sb.replace(2, sb.length(), "23");
		System.out.println(sb);
		
		// 값을 반대서부터 출력
		sb.reverse();
		System.out.println(sb);
	}

}
