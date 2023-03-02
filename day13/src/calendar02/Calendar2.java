package calendar02;

import java.util.Calendar;

public class Calendar2 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int thisYear = today.get(Calendar.YEAR);
		
		System.out.println(today.get(Calendar.MONTH)+1+"월 " + today.get(Calendar.DATE)+"일");
		int amPM = today.get(Calendar.AM_PM);
		switch(amPM) {
		case 0 :
			System.out.println("오전"+ today.get(Calendar.HOUR)+"시" + today.get(Calendar.MINUTE) + "분");
			break;
		case 1 :
			System.out.println("오후 " + today.get(Calendar.HOUR)+"시 " + today.get(Calendar.MINUTE) + "분");
		}
		
		int week = today.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
		
	}

	}
}
