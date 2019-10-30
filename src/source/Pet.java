package source;

public class Pet extends Animal   {

    String name;
    protected boolean isVaccinated;

    public Pet(){
        super();
        name="Swist";
        isVaccinated=false;
    }

    public Pet(int age, int weight,String color,String name,boolean vax){
        super(age,weight,color);
        this.name=name;
        this.isVaccinated=vax;
    }

    @Override
    public void voice() {
        System.out.println("Hello, i\'m pet");
        System.out.println("My name is "+name);
    }
}
