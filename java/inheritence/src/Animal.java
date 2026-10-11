
import java.util.Map;
class Animal{

    public static final float initialHunger = 2.0f;
    public static final float fullAppetite = 5.0f;
    public static final float starvingPoint = 1.0f;
    private float hunger;

    Animal(){
        this.hunger = initialHunger;
    }


    void eat(String item){
        Float value = EDIBLE.get(item);
        
        if(value == null){
            System.out.println(item + "not on edible list");
            System.out.print("Edible item: " + EDIBLE.keySet() + "\n"); //want to print item here
            return;
        }

        hunger = Math.min(hunger + value, fullAppetite);
        System.out.println("Animal ate " + item);
        }
    


    void hungerStatus(){
        System.out.println("Hunger is: " + hunger);
    }

    public static final Map<String, Float> EDIBLE = Map.of(
    "meat", 3.7f,
    "grass", 1.0f,
    "fish", 2.5f
);
}