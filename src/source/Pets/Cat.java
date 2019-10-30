package source.Pets;

import source.Pet;
import source.Voiceble;

public class Cat extends Pet implements Voiceble {

    public Cat(){
        super();
        isVaccinated=false;
    }

    public Cat(int age, int weight,String color,String name,boolean vax){
        super(age, weight, color, name, vax);
    }



    @Override
    public void voice() {
        super.voice();
        System.out.println("Meow");
    }
}
