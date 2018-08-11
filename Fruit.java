import com.sun.javafx.css.FontUnits;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Fruit {

    public static void main(String[] args) {
 Box<Fruit> box = new Box<Fruit>();
 Box<Apple> box1 = new Box<Apple>();
 Box<Orange> box2 = new Box<Orange>();
 box1.addFruit(new Apple());
 box2.addFruit(new Orange());
 box1.transport(box);
 box2.transport(box);

    }
    protected float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}




class Orange extends Fruit{

    public Orange() {
        super(1.5f);
    }
}




class Apple extends Fruit{

    public Apple() {
        super(1.0f);
    }
}






class Box<T extends Fruit> {
    private ArrayList<T> list;

    public Box(T... arr) {
        list = new ArrayList<T>(Arrays.asList(arr));
    }

    public float getWeight() {
        if (list.size() == 0) return 0.0f;
        return list.get(0).getWeight() * list.size();
    }
    public boolean compare(Box another){
       return Math.abs(this.getWeight()- another.getWeight()) < 0.1;
    }
    public void addFruit(T fruit) {
        list.add(fruit);
    }
    public void transport(Box<? super T> another){
        another.list.addAll(this.list);
        this.list.clear();

    }
}
