import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    Pet cat = new Pet(true, "Milk", 4, "Dog", "Black");
    Pet dog  = new Pet(true, "Maize", 4, "Dog", "Grey");

    Animal animal = new Pet(false, "Meat", 2, "Bird", "Red");

    @Test
    public void isVageterian() {

       dog.setVageterian(true);
       Assert.assertTrue("Dog is a vegeterian", false);

    }

    @Test
    public void getEats() {
        dog.setEats("Fish");
        Assert.assertEquals("Fish","Milk");


    }

    @Test
    public void setNumberOfLegs() {
        dog.setNumberOfLegs(3);
        Assert.assertEquals(4,dog.getNumberOfLegs());


    }

    @Test
    public void setAnimalType() {
     dog.setAnimalType("Pig");
     Assert.assertEquals("Pig", "Dog");

    }


}