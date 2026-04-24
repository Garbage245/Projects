import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Payrate{
    public static void main(){
        try{
            // intializes reader file and a file for output
            // throws IOException if output.csv does not exist
            String input = "Java" + "\\" + "Payrate" + "\\" + "pay.csv";
            BufferedReader helpy = new BufferedReader(new FileReader(input));
            String outputCSV = "output.csv";
            File output = new File(outputCSV);
            FileWriter helpy2 = new FileWriter(output);
            if (!output.exists()){
                throw new IOException();
            }
            
            
            /* reads first line of pay.csv and stores the headers as a string. reads the rest
            of the file and uses the payrate and hours worked to calculate weekly pay.
            stores weekly pay and each line from the csv into an arraylist*/
            String title = helpy.readLine() + ",WeeklyPay\n";
            String check = "";
            int i = 0;
            int rowNumber = 0;
            String[] currentData = new String[3];
            ArrayList<Double> weeklyPay = new ArrayList<Double>();
            ArrayList<String> lines = new ArrayList<String>();
            while (i < 1){
                check = helpy.readLine();
                if (check == null){
                    i++;
                }
                else{
                    lines.add(check);
                    currentData = check.split(",");
                    if (Double.parseDouble(currentData[2]) > 40){
                        weeklyPay.add(Double.parseDouble(currentData[1])*40 + Double.parseDouble(currentData[1])*1.5*(Double.parseDouble(currentData[2])-40));
                    }
                    else{
                        weeklyPay.add(Double.parseDouble(currentData[1])*Double.parseDouble(currentData[2]));
                    }


                }

            }
            
            // decimal format writes values in weekly pay with a $ and commas
            DecimalFormat df = new DecimalFormat("$#,###.00");
            // writes title then each line in output.csv
            helpy2.write(title);
            for (int x = 0; x < lines.size(); x++){
                helpy2.write(lines.get(x) + "," + "\""+df.format(weeklyPay.get(x))+"\"" + "\n"); 
            }
            helpy2.close();
            




            
        }
        catch(IOException file){
            System.out.println("IOException: File not found");
        }
    }
}