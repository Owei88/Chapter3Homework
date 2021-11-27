import java.io.PrintStream;
public class StudentTester {



        public static void main(String[] args) {
            String StudentName = "Dave";
            Student student1 = new Student(StudentName);
            student1.addScore(99);
            student1.addScore(69);
            System.out.println("The Current score is: %.2f \n", student1.getTotalScore());
            System.out.println("The Average score is: %.2f"+ student1.calculateQuizAverage());



        }
    }

