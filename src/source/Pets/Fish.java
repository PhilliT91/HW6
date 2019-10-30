package source.Pets;

import source.Pet;
import source.Voiceble;

public class Fish extends Pet implements Voiceble {

    public Fish(){
        super();
        this.isVaccinated=false;
    }
    public Fish(int age, int weight,String color,String name,boolean vax){
        super(age,weight,color,name,vax);

    }

  @Override
   public void voice() {
        super.voice();
        System.out.println("........");
    }
}
