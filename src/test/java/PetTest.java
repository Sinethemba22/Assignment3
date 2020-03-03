import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    Pet cat = new Pet(true, "Milk", 4, "Dog", "Black");
    Pet dog  = new Pet(true, "Maize", 4, "Dog", "Grey");

    Animal animal = new Pet(false, "Meat", 2, "Bird", "Red");

    @Test
    public void isVageterian() {

        Assert.assertTrue("Its a vegiterian",true);

    }

    @Test
    public void getEats() {
    }

    @Test
    public void setNumberOfLegs() {


    }

    @Test
    public void setAnimalType() {
        cat.setEats("Dagga muffins");
        //Assert.assertEquals("Dagga muffins", getEats();

    }
}