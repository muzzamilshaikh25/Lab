/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak". 
 * Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study".
 * Create an object of the Student class and call both the "speak" and "study" methods.*/
package Lab;
//parent class person
class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //method speak
    public void speak() {
        System.out.println("Hello, My name is " + name + " and I am " + age + " years old.");
        
    }
}

class Student extends Person {
    private int grade;
    
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    
    public void study() {
        System.out.println("I am currently studying in grade " + grade + ".");
    }
}
//main class
class marks {
    public static void main(String[] args) {
        Student s = new Student("Md Muzzamil Shaikh", 19, 12);
        s.speak();
        s.study();
    }
}
