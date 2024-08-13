import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Define a generic Student class
class Student {
    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}

public class CollectionExample {

    public static void main(String[] args) {
        // Create a List to store student names
        List<String> studentNames = new ArrayList<>();
        studentNames.add("John Doe");
        studentNames.add("Jane Smith");
        studentNames.add("Emily Davis");
        studentNames.add("John Doe"); // Duplicate name

        // Create a Set to store unique student IDs
        Set<Integer> studentIds = new HashSet<>();
        studentIds.add(101);
        studentIds.add(102);
        studentIds.add(103);
        studentIds.add(101); // Duplicate ID, won't be added

        // Create a Map to map student IDs to student names
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "John Doe");
        studentMap.put(102, "Jane Smith");
        studentMap.put(103, "Emily Davis");

        // Print the student names from the List
        System.out.println("Student Names in List:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        // Print the student IDs from the Set
        System.out.println("\nUnique Student IDs in Set:");
        for (Integer id : studentIds) {
            System.out.println(id);
        }

        // Print the student details from the Map
        System.out.println("\nStudent Details from Map:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Using Generics to create a List of Student objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John Doe", 101));
        studentList.add(new Student("Jane Smith", 102));
        studentList.add(new Student("Emily Davis", 103));

        // Print the student objects
        System.out.println("\nStudent Objects in List:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
