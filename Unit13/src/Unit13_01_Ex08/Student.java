package Unit13_01_Ex08;
/*
 * hashCode()와 equals() 재정의 
 */
public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student student = (Student) obj;
		if(studentNum != student.studentNum) return false;//학번 같으면 저장안함 
		return true;
	}
}
