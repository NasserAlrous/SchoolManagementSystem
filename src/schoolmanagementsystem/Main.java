package schoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher jane = new Teacher(1, "Jane", 700);
		Teacher john = new Teacher(2, "John", 800);
		Teacher doe = new Teacher(3, "Doe", 750);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(jane);
		teacherList.add(john);
		teacherList.add(doe);
		
		
		Student student1 = new Student(1, "Stu1", 3);
		Student student2 = new Student(2, "Stu2", 6);
		Student student3 = new Student(3, "Stu3", 10);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		School school1 = new School(teacherList, studentList);
		
		student1.payFees(4000);
		System.out.println("School has earned: " + school1.getTotalMoneyEarned());
		
		System.out.println("-------Making Teacher Salary Payment-------");
		jane.receiveSalary(jane.getSalary());
		System.out.println("School has paid salary to: " + jane.getName() + 
				" and school revenue is now " + school1.getTotalMoneyEarned());
		
		System.out.println(student1);
		System.out.println(jane);
	}

}
