public class Student {
    private double Score;
    private int TotalScore;
    public int NumberOfQuizzes = 1;
    private int AverageScore;
    private String StudentName;

    //public Student(){
    //}

    /**
     * @param StudentName the Student name
     * @param FirstScore  the first score
     */


    public Student(String StudentName, int FirstScore) {
        this.StudentName = StudentName;
        TotalScore = FirstScore;
    }

    public void addScore(int Score){
        TotalScore+= Score;
        NumberOfQuizzes++;
    }

    public double getTotalScore() {
        return TotalScore;}

        public double getAverageScore(){
            return Score;
        }
        public String getStudentName(){
            return StudentName;}

        public double getNumberOfQuizzes(){
            return NumberOfQuizzes;}
            }


