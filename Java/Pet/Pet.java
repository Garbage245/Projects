// Myron Sago II
// 2/2/2026
public class Pet{
    // Pet name, type, and age
    private String petName;
    private String petType;
    private int petAge;

    // Default pet information if called with no arguments
    public Pet(){
        petName = "Animal";
        petType = "Dog";
        petAge = 1;
    }

    // Sets pet private variables to user inputs
    public Pet(String name, String type, int age){
        setName(name);
        setType(type);
        setAge(age);

    }

    // Returns petName
    public String getName(){
        return petName;
    }

    // Sets petName as user input
    public void setName(String input){
        petName = input;
    }

     // Returns petType
    public String getType(){
        return petType;
    }

    // Sets petType as user input
    public void setType(String input){
        petType = input;
    }
    // Returns petAge
    public int getAge(){
        return petAge;
    }

    // Sets petAge as user input
    public void setAge(int input){
        petAge = input;
    }

    // Creates a String with pet information
    public String ToString(){
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
}