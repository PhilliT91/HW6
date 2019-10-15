package source;

public class Wild extends Animal{
protected boolean isPredator;

public Wild(){
    super();
    isPredator=false;
}

public Wild(int age, int weight,String color, boolean pred){
    super(age,weight,color);
    this.isPredator=pred;
}

    @Override
    public void voice() {
        System.out.println("hello, i\'m wild animal");
        if(isPredator=true){
            System.out.println("i\'m' hungry");
        }
    }
}
