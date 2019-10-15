package source.Pets;

import source.Pet;

public class Dog extends Pet {

    @Override
   public void voice() {
        super.voice();
        System.out.println("Woof");
    }
}
