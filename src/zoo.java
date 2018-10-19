public class zoo {
     String favoriteFood = "bacon";

    String newLine = System.getProperty("line.separator");

    public static void main(String[] args){
        /*zoo t = new zoo();
        t.sleep("Tigger");

        zoo x = new zoo();
        x.eat("Tigger", "meat");
        x.eat("Tigger", "bacon");
        */

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallow");

        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");

        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        Animal[] animalList = {tigger,pooh,rarity,gemma,stinger};

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animalList,"food");

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


