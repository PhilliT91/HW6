package source.WildAnimals;

import source.Wild;

public class Crocodile extends Wild {


    public Crocodile(){
        super();
        this.isPredator=true;
    }

    public Crocodile(int age, int weight,String color){
        super(age,weight,color,true);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("I have a friend Cheburashka");
    }
}
