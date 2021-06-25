package tostringexample;

import java.util.Arrays;

class Course{
	String name;
	int courseId;
	
	public Course(String name, int courseId) {
		this.name = name;
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", courseId=" + courseId + "]";
	}
	
	
	
	
}

class Student {
	String name;
	int stdId;
	Course[] course;
	
	public Student(String name, int stdId, Course[] course) {
		this.name = name;
		this.stdId = stdId;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", stdId=" + stdId + ", "
				+ "course=" + Arrays.toString(course) + "]";
	}

	
	
	
	
}

public class App{
	
	public static void main(String[] args) {
		Course[] courses = new Course[] {new Course("Physics", 1), new Course("Math", 2)};
		Student std= new Student("Jack", 11111, courses);
		System.out.println(std);
	}
}
