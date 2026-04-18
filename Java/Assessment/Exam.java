public class Exam extends Assessment{
    // Declares variables for points each question is worth
    private int pointsEach;
    
    // calculates points each and sets score
    public Exam(int NOQ, int MQ){
        pointsEach = 100/NOQ;
        setScore(pointsEach*(NOQ-MQ));
    }

    // returns the amount of points each question is worth
    public int getPointsEach(){
        return pointsEach;
    }
}

// will this junk work?