package chapter11;

/**
 *  Driver Class.
 */
public class MainStudentApp {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "0.");

        System.out.println(Student.getStudentsCount());

        // Set
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(3);

        // Get
        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());
    }
}
