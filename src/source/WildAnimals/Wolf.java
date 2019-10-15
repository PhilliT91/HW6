package source.WildAnimals;

import source.Wild;

public class Wolf extends Wild {

    public Wolf(){
        super();
this.isPredator=true;
    }


    public Wolf(int age, int weight,String color){
        super(age,weight,color,true);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Awooooooooo");
    }
}
