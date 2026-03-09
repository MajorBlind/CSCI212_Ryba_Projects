public class Main{
    public static void main(String[] args){
        // Create hw and exam grades for student 1 and initialize student 1
        double[] hw1 = {90, 85, 88, 92};
        double[] ex1 = {80, 85, 90};
        Student s1 = new Student("Alice Smith", 101, hw1, ex1);

        // Create hw and exam grades for student 2 and initialize student 2
        double[] hw2 = {70, 75, 80, 85};
        double[] ex2 = {65, 70, 75};
        Student s2 = new Student("Bob Lee", 102, hw2, ex2);

        // Create hw and exam grades for student 3 and initialize student 3
        double[] hw3 = {68, 90, 89, 84};
        double[] ex3 = {80, 95, 85};
        Student s3 = new Student("John Doe", 103, hw3, ex3);

        // Create hw and exam grades for student 4 and initialize student 4
        double[] hw4 = {95, 83, 78, 85};
        double[] ex4 = {97, 89, 93};
        Student s4 = new Student("Jane Doe", 104, hw4, ex4);

        // Create CS101 class of type ClassRoom to hold students
        ClassRoom CS101 = new ClassRoom("CS101");

        // Add initialized students to ClassRoom CS101
        CS101.addStudent(s1);
        CS101.addStudent(s2);
        CS101.addStudent(s3);
        CS101.addStudent(s4);

        // Print summary of CS101 and info of every student on list
        CS101.printSummary();
        CS101.printAllStudentInfo();
    }
}
