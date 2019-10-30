package source.Pets;

import source.Voiceble;

public class GuideDog extends Dog implements Voiceble {
    boolean isTrained;
public GuideDog(){
    super();
    this.isTrained=false;
}
public GuideDog(int age, int weight,String color,String name,boolean vax, boolean istrnd){
    super( age, weight, color, name, vax);
    this.isTrained=istrnd;
}

    @Override
    public void voice() {
        super.voice();
        if(isTrained=true){
            System.out.println("I can take you home");
        }
    }
}
