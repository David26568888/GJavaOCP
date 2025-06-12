package day25.case2;

import java.util.Arrays;

public class PhilippineTourDemo {
	public static void main(String[] args) {
		PhilippineTour tour  = new PhilippineTour(3);//3個名額
		
		//模擬5個學生去搶
		Student[] students = {
				new Student(tour,"小明"), 
				new Student(tour,"小美"), 
				new Student(tour,"小廖"), 
				new Student(tour,"小陳"), 
				new Student(tour,"小段"), 
		};
		
		Arrays.stream(students)
		//.forEach(student->student.start());
		.forEach(Student::start);
	}
}
