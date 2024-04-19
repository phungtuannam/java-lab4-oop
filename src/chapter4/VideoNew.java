package chapter4;

public class VideoNew {
	public static void main(String[] args) {
		System.out.println("run new video");
		
		Student st2 = new Student();
		
		st2.setName("Nam  set name");
		st2.setAge(21);
		
		System.out.println(">>> check obj:" + st2.getName() + " and has age: " + st2.getAge());
		
	}
}
