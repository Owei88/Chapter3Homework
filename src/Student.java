public class Student {
    private double Score;
    private int totalScore;
    public int numberOfQuizzes = 1;
    private int averageScore;
    private String studentName;

    //public Student(){
    //}

    /**
     * @param StudentName the Student name
     * @param FirstScore  the first score
     */


    public Student(String StudentName) {
        this.StudentName = StudentName;
    }
    /**
     * Adds scores to the total score and increases number of quizzes taken
     * @param QuizScore the score of quizzes being added
     */
    public void addScore(int Score){
        totalScore+= Score;
        numberOfQuizzes++;
    }
     /**
     * Gets various variables
     * @return getTotalScore - returns the total score
     * @return getNumberOfQuizzes - returns number of quizzes taken
     * @return getStudentName - returns the student name
     * @return getAverageScore - returns the average score
     */
    public double getTotalScore() {
        return TotalScore;}

        public double getAverageScore(){
            return Score;
        }
        public String getStudentName(){
            return studentName;}

        public double getNumberOfQuizzes(){
            return numberOfQuizzes;}
     /**
     * Calculates the quiz average by dividing total score by number of quizzes
     * @return returns the average score
     */
    
       public double calculateQuizAverage(){
           average score = (totalScore / numberOfQuizzes);
           return averageScore;}
            }


