package source.Pets;

import source.Pet;
import source.Voiceble;

public class Dog extends Pet implements Voiceble {

    public Dog(){
        super();
        isVaccinated=false;
    }

    public Dog(int age, int weight,String color,String name,boolean vax){
        super(age, weight, color, name, vax);
    }




    @Override
   public void voice() {
        super.voice();
        System.out.println("Woof");
    }
}
