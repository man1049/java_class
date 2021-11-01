package a211101;

public class Main1 {

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu);
		
		Student stu2 = new Student();
		System.out.println(stu2);
		
		Student stu3 =stu2;
		System.out.println(stu3);
		
		stu.score = 1;
		stu2.score = 2;
		Student.school = "신진";
		stu.school = "명지";
		System.out.println(stu.score);
		System.out.println(stu2.score);
		System.out.println(Student.school);
		
	}

}
