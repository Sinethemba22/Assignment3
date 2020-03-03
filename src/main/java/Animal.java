public class Animal {
    private boolean vageterian;
    private String eats;
    private int numberOfLegs;
    private  String animalType;

    public Animal(){

    }

    public Animal(boolean vageterian, String eats, int numberOfLegs, String animalType) {
        this.vageterian = vageterian;
        this.eats = eats;
        this.numberOfLegs = numberOfLegs;
        this.animalType = animalType;
    }

    public boolean isVageterian() {
        return vageterian;
    }

    public void setVageterian(boolean vageterian) {
        this.vageterian = vageterian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
