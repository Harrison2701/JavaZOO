public class zoo {
     String favoriteFood = "bacon";
    String newLine = System.getProperty("line.separator");

    public static void main(String[] args){
        zoo t = new zoo();
        t.sleep("Tigger");

        zoo x = new zoo();
        x.eat("Tigger", "meat");
        x.eat("Tigger", "bacon");

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        tigger.sleep("Tigger");
    }

    public void sleep(String name){
        System.out.print(name + " sleeps for 8 hours"+newLine);
    }

    public void eat(String name,String food){
        System.out.print( name + " eat " + food+newLine);
        if(food.equals(favoriteFood)){
            System.out.print("Yum!!! " + name + " wants more " + food+newLine);
        }
    }
}


