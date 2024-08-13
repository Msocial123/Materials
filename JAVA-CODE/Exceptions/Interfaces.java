// Define an interface called StudentActivity
interface StudentActivity {
    void study();      // Method for studying
    void attendClass(); // Method for attending class
    void doHomework();  // Method for doing homework
}

// Implementing the StudentActivity interface in the Student class
class Student implements StudentActivity {
    private String name;
    private String major;

    // Constructor
    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    // Implement the study method
    @Override
    public void study() {
        System.out.println(name + " is studying " + major + ".");
    }

    // Implement the attendClass method
    @Override
    public void attendClass() {
        System.out.println(name + " is attending a " + major + " class.");
    }

    // Implement the doHomework method
    @Override
    public void doHomework() {
        System.out.println(name + " is doing homework for " + major + ".");
    }

    // Additional method to display student information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Major: " + major);
    }
}

// Test class with the main method
public class InterfaceExample {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", "Computer Science");

        // Display student information
        student.displayInfo();

        // Call the methods from the StudentActivity interface
        student.study();
        student.attendClass();
        student.doHomework();
    }
}
