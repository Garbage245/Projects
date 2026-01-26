public class Tests{
    public static void main(String[] args){
        double score1 = (Math.random()*100);
        double score2 = (Math.random()*100);
        double score3 = (Math.random()*100);
        double average = ((score1 + score2 + score3)/3);
        System.out.println("Test Score 1: " + score1);
        System.out.println("Test Score 2: " + score2);
        System.out.println("Test Score 3: " + score3);
        System.out.print("The average of the 3 test scores is: " + average);
    }
}