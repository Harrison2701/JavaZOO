class Animal {
    // Put your instance variables here
    String name;
    String favoriteFood;
    String newLine = System.getProperty("line.separator");
    static int population = 0;

    public Animal(String name, String favoriteFood) {
        // put your initializer content here
        this.name = name;
        this.favoriteFood = favoriteFood;
        population += 1;
    }

    public void sleep(String name) {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.print(name + " sleeps for 8 hours"+newLine);
    }

    public void eat(String food) {
        // complete your eat function here!
        System.out.print( name + " eats " + food+newLine);
        if(food.equals(favoriteFood)){
            System.out.print("Yum!!! " + name + " wants more " + food+newLine);
        }else {
            sleep(name);
        }
    }


    public int populationCount(){
        return population;
    }
}
