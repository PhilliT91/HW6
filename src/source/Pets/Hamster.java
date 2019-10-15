package source.Pets;

import source.Pet;

public class Hamster extends Pet {

    public Hamster(){
        super();
        isVaccinated=false;
    }

    public Hamster(int age, int weight,String color,String name,boolean vax){
        super(age, weight, color, name, vax);
    }


    @Override
    public void voice() {
        super.voice();
        System.out.println("give me few nuts");
    }
}
