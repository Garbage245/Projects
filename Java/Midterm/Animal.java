public class Animal{
    // species variable
    private String species;

    public Animal(){
        species = "";
    }

    // constructor that sets species to an input
    public Animal(String newSpecies){
        setSpecies(newSpecies);
    }

    // sets species to a new string
    public void setSpecies(String newSpecies){
        species = newSpecies;
    }

    // returns species variable
    public String getSpecies(){
        return species;
    }

    // returns animal information
    public String toString(){
        String output = "Animal Information:\n Species: " + species;
        return output;
    }
}
