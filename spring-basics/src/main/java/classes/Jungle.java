package classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jungle {
    
    private Animal largest;
    private List<Animal> animals;
    private Map<String, String> foods = new HashMap<String, String>();
    private Map<String, Animal> animalsMap = new HashMap<String, Animal>();

    public Animal getLargest() {
        return largest;
    }
    
    public void setLargest(Animal largest) {
        this.largest = largest;
    }
    
    public List<Animal> getAnimals() {
        return animals;
    }
    
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Map<String, String> getFoods() {
        return foods;
    }

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    public Map<String, Animal> getAnimalsMap() {
        return animalsMap;
    }

    public void setAnimalsMap(Map<String, Animal> animalsMap) {
        this.animalsMap = animalsMap;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> entry : foods.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }

        sb.append("\n");
        
        for (Map.Entry<String, Animal> entry : animalsMap.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        
        return sb.toString();
    }

}
