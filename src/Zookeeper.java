public class Zookeeper {
    String name;
    String line = System.getProperty("line.separator");

    public Zookeeper(String name){
        this.name = name;

    }

    public void feedAnimals(Animal[] animalList, String food) {
        int count = animalList.length;
        System.out.print(name + " is feeding " + food + " to " + count + " of " + Animal.population + " animals" + line);
        for (int i = 0; i < animalList.length; i++) {
            animalList[i].eat(food);
        }
    }

}
