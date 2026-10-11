// Student class
class Student {

    String name;
    int mark;
    String grade;

    // Constructor (optional but good practice)
    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
        this.grade = Grade(mark); // compute grade on creation
    }

    // Instance method to compute grade (could be static too)
    public String Grade(int mark) {
        if (mark > 60) {
            return "First";
        } else if (mark > 50) {
            return "Second";
        } else {
            return "Third"; // covers mark <= 50
        }
    }
}

// Main class
public class StudentDetail {

    public static void main(String[] args) {
        // Create students using constructor
        Student s1 = new Student("Ronaldo", 76);
        Student s2 = new Student("Lily", 64);

        // Output data
        System.out.println("Name : " + s1.name + " Grade : " + s1.grade);
        System.out.println("Name : " + s2.name + " Grade : " + s2.grade);
    }
}
