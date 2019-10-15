package source.Pets;

import source.Pet;

public class Hamster extends Pet {
    @Override
    public void voice() {
        super.voice();
        System.out.println("give me few nuts");
    }
}
