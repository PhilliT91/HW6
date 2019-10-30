package source;

public class Animal {

    protected static int id=0;
    protected int age;
    protected int weight;
    protected String color;
    public void voice (){


    }
    public Animal(int age, int weight,String color ){
        this.age=age;
        this.weight=weight;
        this.color=color;
        id++;
    }
    public Animal (){

        id++;
    }



}
