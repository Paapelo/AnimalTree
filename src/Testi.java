
public class Testi {

	public static void main(String[] args) {

		System.out.println("Cat:");
		System.out.println("_______________");
		Cat cat = new Cat(4, 2, false, false, "Misse");
		cat.tulosta();

		System.out.println("");

		System.out.println("Human:");
		System.out.println("_______________");
		Human human = new Human(2, 45, false, true, "Mies");
		human.tulostaHuman();

		System.out.println("");
		System.out.println("Student:");
		System.out.println("_______________");
		Student student = new Student(2, 20, false, false, "Nainen", 70, "Tarja");
		student.tulostaStudent();

		System.out.println("");
		System.out.println("Teacher: ");
		System.out.println("_______________");
		Teacher teacher = new Teacher(2, 50, true, false, "Mies", "Martti", "TRTKP17A3");
		teacher.tulostaTeacher();
	}

}
