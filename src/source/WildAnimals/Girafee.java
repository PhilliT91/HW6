package source.WildAnimals;

import source.Voiceble;
import source.Wild;

public class Girafee extends Wild implements Voiceble {
    public Girafee(){
        super();
        this.isPredator=false;
    }

    public Girafee(int age, int weight,String color){
        super(age,weight,color,false);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Long neck - it\'s not the bug, but feature");
    }
}
