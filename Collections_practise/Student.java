package Collections_practise;


public class Student implements Comparable<Student>{

	int id;
	String sName;
	int age;
	int marks;

	public Student(int id, String sName, int age, int marks) {
		super();
		this.id = id;
		this.sName = sName;
		this.age = age;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sName=" + sName + ", age=" + age + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {

//		if (this.age > o.age) {
//			return 1;
//		} else if (this.age < o.age) {
//			return -1;
//		} else {
//			return 0;
//		}
		
		
		         //OR
		
//		return Integer.compare(this.age, o.age);
		
		return this.sName.compareTo(o.sName);
	}

}
