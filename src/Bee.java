public class Bee extends Animal{

    public Bee(String name){
        super(name,"pollen");
    }

    public void eat(String food){
        if(food.equals(favoriteFood)){
            System.out.print(name + " eats " + food+newLine);
            System.out.print("Yum!!! " + name + " wants more " + food +newLine);
            sleep(name);
        }else{
            System.out.print("Yuck!!! " + name + " will not eat " + food+newLine);
        }
    }

    public void sleep(String name){
        System.out.print(name + " never sleeps");
    }
}
