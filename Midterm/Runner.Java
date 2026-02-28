public class Runner{
    public static void main(){
        Animal a1 = new Animal();
        a1.setSpecies("Dog")
        System.out.println(a1.toString())
        Animal a2 = new Animal("Cat");
        System.out.println(a2.toString());
    }
}