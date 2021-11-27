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

    public void addScore(int Score){
        totalScore+= Score;
        numberOfQuizzes++;
    }

    public double getTotalScore() {
        return TotalScore;}

        public double getAverageScore(){
            return Score;
        }
        public String getStudentName(){
            return studentName;}

        public double getNumberOfQuizzes(){
            return numberOfQuizzes;}
    
       public double calculateQuizAverage(){
           average score = (totalScore / numberOfQuizzes);
           return averageScore;}
            }


