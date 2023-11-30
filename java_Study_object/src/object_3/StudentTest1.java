package object_3;

public class StudentTest1 {
	public static void main(String[]args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.SrialNUm);
		studentLee.SrialNUm++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.SrialNUm);
		System.out.println(studentLee.SrialNUm);
	}

}
