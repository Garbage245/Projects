// Myron Sago II
// 2/2/2026

import java.util.Scanner;
public class Pet{
    // Pet name, type, and age
    private String petName;
    private String petType;
    private int petAge;

    public Pet(){
        petName = "Animal";
        petType = "Dog";
        petAge = 1; 
    }
    public Pet(String name, String type, int age){
    // Sets pet name to an empty string
        setName(name);
        setType(type);
        setAge(age);

    }
    // Returns name variable
    public String getName(){
        return petName;
    }
    // Sets petName as user input
    public void setName(String input){
        petName = input;
    }
    // Sets petName as user input
    public String getType(){
        return petType;
    }
    // Sets petName as user input
    public void setType(String input){
        petType = input;
    }
    public int getAge(){
        return petAge;
    }
    public void setAge(int input){
        petAge = input;
    }
    
    public String ToString(){
    // Creates a String with pet information
        String output = "Pet Information:";
        output += "\nType: ";
        output += getType();
        output += "\nName: ";
        output += getName();
        output += "\nSound: ";
        if (petType.toLowerCase().equals("dog")) {
            output += "Woof";
        }
        else if (petType.toLowerCase().equals("cat")) {
            output += "Meow";
        }
        else {
            output += "Yowl";
        }
        output += "\nAge: ";
        output += getAge();
        output += "\n";
        return output;
    }

    public static void main(String[] args){
    // Creates 2 pets and a scanner
    // Sets pet names to user input and prints out pet information
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        Scanner helpy = new Scanner(System.in);
        pet1.setName(helpy.nextLine());
        pet2.setName(helpy.nextLine());
        System.out.println(pet1.ToString());
        System.out.println("\n" + pet2.ToString());
    }
}