public class Giraffe extends Animal {

    public Giraffe(String name){
        super(name,"leaves");
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
}
