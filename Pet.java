

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