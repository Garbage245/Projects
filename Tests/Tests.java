import java.util.Scanner;

public class Tests{
    // Counter for number of test scores
    public static int numberOfScores;
    public static float average;

    // Asks user to input test scores and calculates the average
    public static void GetAverage(){
        Scanner helpy = new Scanner(System.in);
        float scores = 0;
        numberOfScores = 0;
        System.out.println("Please enter the test scores one by one. Enter '-1' to finish.");
        while (true){
            System.out.print("Enter score: ");
            float check = helpy.nextFloat();
            if (check == -1){
                break;
            }
            else{
                scores += check;
                numberOfScores += 1;
            }
        }
        average = scores/numberOfScores;
    }
    // Compiles average and number of test scores in a string
    public static String ToString(){
        String output = "";
        output += "The class average is: ";
        output += String.format("%.2f", average);
        output += "\nNumber of test scores: ";
        output += numberOfScores;
        return output;
    }
}