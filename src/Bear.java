public class Bear extends Animal {

    public Bear(String name){
        super(name,"fish");
    }

    public void sleep(String name) {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.print(name + " hibernates for 4 months"+ newLine);
    }
}
