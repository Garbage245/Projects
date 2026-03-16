import java.util.Scanner;
public class Calc{
    private double num1 = 0.0;
    private double num2 = 0.0;

    
    public double add(){
        return num1 + num2;
    }
    public double subtract(){
        return num1 - num2;
    }
    public double multiply(){
        return num1 * num2;
    }
    public double divide(){
        return num1/num2;
    }
    
    public void setNum1(double num){
        num1 = num;
    }
    public double getNum1(){
        return num1;
    }
    public void setNum2(double num){
        num2 = num;
    }
    public double getNum2(){
        return num2;
    }

    public double validation(){
        Scanner helpy = new Scanner(System.in);
        String input = helpy.nextLine();
        boolean condition = true;
        while (condition == true){
            for (int x = 0; x < input.length(); x++){
                char check = input.charAt(x);
                if (check == '0' || check == '1' || check == '2' || check == '3' || check ==  '4' || check == '5' || check == '6' || check == '7' || check == '8' || check == '9'){
                    if (x == input.length() - 1){
                        condition = false;
                    }
                    else {
                        continue;
                    }
                }
                else {
                    System.out.println("Your input is invalid. Please try again.");
                    input = helpy.nextLine();
                    break;
                }
            }
        }
        return Integer.parseInt(input);
    }

    public String toString(){
        String output = "";
        output += "Num1: ";
        output += num1;
        output += "\nNum2: ";
        output += num2;
        return output;
    }
}