

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