import java.util.ArrayList;

public class ClassRoom{
    private String className;
    private ArrayList<Student> studentList;

    // Constructor initializes instance variables
    public ClassRoom(String subjectName){
        className = subjectName;
        studentList = new ArrayList<Student>();
    }

    // Getter methods for instance variables
    public String getClassName(){
        return className;
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    // Add a student to the classroom list 
    public void addStudent(Student student){
        studentList.add(student);
    }

    // Print class name and the overall average
    public void printSummary(){
        double classAvg = ClassRoomTools.computeAverageFinalGrade(this);

        System.out.println("Class: " + className);
        System.out.println("Class Average Final Grade: " + classAvg + "\n");
    }

    // Print information of every student in the class
    // Info given: name, ID, HW average, number final grade, letter final grade
    public void printAllStudentInfo(){
        for(Student s : studentList){
            System.out.println("Name: " + s.getName());
            System.out.println("ID: " + s.getID());
            System.out.println("HW Average: " + ClassRoomTools.computeStudentHWavg(s));
            System.out.println("Numerical Final Grade: " + ClassRoomTools.computeStudentFinalGrade(s));
            System.out.println("Final Letter Grade: " + ClassRoomTools.letterGrade(ClassRoomTools.computeStudentFinalGrade(s)));
            System.out.println("\n -------------------------- \n");
        }
    }
}
