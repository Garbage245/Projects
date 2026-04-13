public class Exam extends Assessment{
    // Declares variables for points each question is worth
    private int pointsEach;
    
    // calculates points each and sets score
    public Exam(int NOQ, int MQ){
        pointsEach = 1/NQs;
        super.setScore(((NOQ-MQ)/NOQ)*100);
    }

    // returns the amount of points each question is worth
    public float getPointsEach(){
        return pointsEach;
    }
}