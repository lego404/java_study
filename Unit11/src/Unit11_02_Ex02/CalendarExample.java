package Unit11_02_Ex02;
import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;
		String strMonth = (month <10)? ("0"+month) : ("" +month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		String strDay = (day<10)? ("0" +day) : ("" + day);
		
		/*
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		*/
		
		String[] dayArray = {"월", "화", "수", "목", "금", "토", "일" };
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		String strDayOfWeek = dayArray[dayOfWeek] + "요일";
		
		int hour = now.get(Calendar.HOUR);
		String strHour = (hour < 10) ? ("0" + hour) : ("" + hour);
		int minute = now.get(Calendar.MINUTE);
		String strMinute = (minute < 10)? ("0" + minute) : ("" + minute);
		
		System.out.println(year + "년 " + strMonth + "월 " + strDay + "일 " + strDayOfWeek +" "+ strHour + "시 " + strMinute + "분 ");
		
	}
}
