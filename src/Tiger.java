public class Tiger {
    // put your instance variables here!
    String name;
    String favoriteFood;
    String newLine = System.getProperty("line.separator");

    public Tiger(String name) {
        // put your constructor content here
        this.name = name;
        this.favoriteFood = "meat";
    }

    public void sleep(String name) {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.print(name + " sleeps for 8 hours"+newLine);
    }



    public void eat(String food) {
        // complete your eat function here!
        System.out.print( name + " eat " + food+newLine);
        if(food.equals(favoriteFood)){
            System.out.print("Yum!!! " + name + " wants more " + food+newLine);
        }
    }
}