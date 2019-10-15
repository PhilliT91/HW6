package source.Pets;

import source.Pet;

public class Cat extends Pet {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Meow");
    }
}
