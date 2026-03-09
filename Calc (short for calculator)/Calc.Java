import java.util.scanner;
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
    public String toString(){
        String output = "";
        output += "Num1: ";
        output += num1;
        output += "\nNum2: ";
        output += num2;
        return output;
    }
}