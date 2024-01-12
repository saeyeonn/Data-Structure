import java.util.SortedMap;

abstract class ADog {
    boolean isHungry;
    public void eat(String feed) {isHungry = false;}
    public void run() {isHungry = true;}
    public abstract Sound bark();
}

class Dog extends ADog {

    public void eat(String feed) {}
    public void run() {}
    public Sound bark() {
        return null;
    }
}

