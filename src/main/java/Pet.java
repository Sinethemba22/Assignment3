public class Pet extends Animal {
    private  String color;

    public Pet(String color) {
        this.color = color;
    }

    public Pet(boolean vageterian, String eats, int numberOfLegs, String animalType, String color) {
        super(vageterian, eats, numberOfLegs, animalType);
        this.color = color;
    }

    public Pet() {
        super();
    }

    public Pet(boolean vageterian, String eats, int numberOfLegs, String animalType) {
        super(vageterian, eats, numberOfLegs, animalType);
    }

    @Override
    public boolean isVageterian() {
        return super.isVageterian();
    }

    @Override
    public void setVageterian(boolean vageterian) {
        super.setVageterian(vageterian);
    }

    @Override
    public String getEats() {
        return super.getEats();
    }

    @Override
    public void setEats(String eats) {
        super.setEats(eats);
    }

    @Override
    public int getNumberOfLegs() {
        return super.getNumberOfLegs();
    }

    @Override
    public void setNumberOfLegs(int numberOfLegs) {
        super.setNumberOfLegs(numberOfLegs);
    }

    @Override
    public String getAnimalType() {
        return super.getAnimalType();
    }

    @Override
    public void setAnimalType(String animalType) {
        super.setAnimalType(animalType);
    }
}
