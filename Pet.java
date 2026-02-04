// Myron Sago II
// 2/2/2026

import java.util.Scanner;
public class Pet{
    // Pet name
    private String name;
    public Pet(){
    // Sets pet name to an empty string
        this.setName("");
    }
    // Returns name variable
    public String getName(){
        return this.name;
    }
    public void setName(String input){
    // Takes a name input and assigns it to the name variable
        this.name = input;
    }
    public String ToString(){
    // Creates a String with pet information
        String output = "Pet Information:\nPet Name: ";
        output += this.name;
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