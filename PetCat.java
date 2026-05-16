
import java.util.Scanner;

public class Pet {
    protected String petName;
    protected int petAge;

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void printInfo() {
        System.out.println("Pet Information: ");
        System.out.println("Name: " + petName);
        System.out.println("Age: " + petAge);
    }
}




public class Cat extends Pet {
    private String catBreed;

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getBreed() {
        return catBreed;
    }

    @Override
    public void printInfo() {
        System.out.println("Cat Information: ");
        System.out.println("Name: " + petName);
        System.out.println("Age: " + petAge);
        System.out.println("Breed: " + getBreed());
    }
}

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
 }
}

//KITTTTYYYYYY