public class ClassRoomTools{
    // Computes a students hw grades avg
    public static double computeStudentHWavg(Student student){
        double[] homeworkGrades = student.getHWGrades();
        
        int hwLength = 0; // Counts the elements in homeworkGrades
        double gradeSum = 0; // Keeps the sum of all the grades in homeworkGrades

        // Loops through every element in homeworkGrades
        // Addds the value of each hw grade to gradeSum
        // heLength increments to keep track of how many elements in homeworkGrades
        for(double grade : homeworkGrades){
            gradeSum +=  grade;
            hwLength ++;
        }

        // Calculate avg hw score
        double hwAvg = gradeSum/hwLength;

        return hwAvg;
    }

    // Calculates weighted avg of student's scores
    public static double computeStudentFinalGrade(Student student){
        double[] examGrades = student.getExamGrades();

        // Calculates the weight of each exam grade
        // Midterms worth 25% and final worth 35%
        double midtermOne = examGrades[0] * .25; 
        double midtermTwo = examGrades[1] * .25;
        double finalExam = examGrades[2] * .35;

        double weightedExams = midtermOne + midtermTwo + finalExam; // Sum of the weighted exam grades

        // Calculate weight of students hw avg
        // All homeworks worth 15%
        double weightedHW = computeStudentHWavg(student) * .15;

        // Add all weighted grades together to get total weighted avg
        double weightedAvg = weightedExams + weightedHW;

        return weightedAvg;
    }

    // Return letter grade for a students weighted avg
    public static String letterGrade(double grade){
        if(grade >= 90){
            return "A";
        }else if(grade >= 80){
            return "B";
        }else if(grade >= 70){
            return "C";
        }else if(grade >= 60){
            return "D";
        }else{
            return "F";
        }
    }

    public static double computeAverageFinalGrade(ClassRoom c){
        // Counter variables for scores and amount of kids in a class
        double total = 0;
        int classSize = 0;

        // Loop through each student and adds their score to total and increments classSize for each student
        for(Student s : c.getStudentList()){
            total += computeStudentFinalGrade(s);
            classSize++;
        }

        // Checks classSize so you avoid division by zero
        // Calculate class average
        if(classSize == 0){
            return 0;
        }
        double classAvg = total/classSize;

        return classAvg;
    }
}
