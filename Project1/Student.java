public class Student{
    private String name;
    private int id;
    private double[] hwGrades = new double[4];
    private double[] testGrades = new double[3];

    // Constructor initializes instance variables
    public Student(String studentName, int studentID, double[] homeworkGrades, double[] examGrades){
        name = studentName;
        id = studentID;
        hwGrades = homeworkGrades;
        testGrades = examGrades;
    }

    // Getter methods for the instance variables
    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public double[] getHWGrades(){
        return hwGrades;
    }

    public double[] getExamGrades(){
        return testGrades;
    }
}