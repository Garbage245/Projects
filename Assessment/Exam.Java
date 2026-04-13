public class Exam extends Assessment{
    // Declares variables for number of questions and missed questions
    private int pointsEach;
    private int numOfQuestions;
    
    // sets numOfQuestions to input, calculates points each, and sets score
    public Exam(int NOQ, int MQ){
        numOfQuestions = NOQ;
        pointsEach = 1/numOfQuestions;
        super.setScore(MQ/NOQ);
    }

    // returns the amount of points each question is worth
    public float getPointsEach(){
        return pointsEach;
    }
}