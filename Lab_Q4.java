/*Q.4 Create an interface called "Person" with a method called "speak". 
 * Create two classes called "Student" and "Teacher" that implement the Person interface and implement the "speak" method.
 *  Create objects of both the Student and Teacher classes and call their respective "speak" methods.
 */
package IPA;

interface Person {
    void speak();
}

class Student implements Person {
    public void speak() {
        System.out.println("I am a student.");
    }
}

class Teacher implements Person {
    public void speak() {
        System.out.println("I am a teacher.");
    }
}
public class Lab_Q4{
	public static void main(String[] args) {
        Person person1 = new Student();
        Person person2 = new Teacher();

        person1.speak();
        person2.speak();
    }

}