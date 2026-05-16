
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String name = scnr.nextLine();
        int age = scnr.nextInt();
        String breed = scnr.nextLine();

        Cat pet = new Cat();
        pet.setPetName(name);
        pet.setPetAge(age);
        pet.setCatBreed(breed);

        pet.printInfo();

        scnr.close();
 }
}

//KITTTTYYYYYY