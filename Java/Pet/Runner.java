// Myron Sago II
// 2/13/2026

import java.util.Scanner;
public class Runner{
    public static void main() {
        Scanner helpy = new Scanner(System.in);
        Pet pet1 = new Pet();
        Pet pet2 = new Pet("Kris", "Dog", 8);
        System.out.println(pet1.ToString());
        System.out.println(pet2.ToString());
        System.out.println("Please enter the pet's name:");
        String name = helpy.nextLine();
        System.out.println("Please enter what animal the pet is:");
        String type = helpy.nextLine();
        System.out.println("Please enter the age of the pet:");
        int age = helpy.nextInt();
        Pet pet3 = new Pet(name, type, age);
        System.out.println(pet3.ToString());

    }
}
