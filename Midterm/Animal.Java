public class Animal{
    // species variable
    private String species;
    
    // constructor that immediately sets the species
    public Animal(String newSpecies){
        setSpecies(newSpecies);
    }

    // sets species to a new string
    public void setSpecies(String newSpecies){
        species = newSpecies;
    }

    // returns species variable
    public String getSpecies(){
        rerturn species
    }

    // returns animal information
    public String toString(){
        String output = "Animal Information:\n Species: " + species;
    }
}