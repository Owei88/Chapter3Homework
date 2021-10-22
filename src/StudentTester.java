public class StudentTester {



        public static void main(String[] args) {
            String StudentName = "Dave";
            Student student1 = new Student(StudentName, 81);
            student1.addScore(99);
            student1.addScore(69);
            System.out.println("The Current score is:" + student1.getTotalScore());
            System.out.println("The Average score is:"+ student1.getTotalScore() / student1.getNumberOfQuizzes());



        }
    }

