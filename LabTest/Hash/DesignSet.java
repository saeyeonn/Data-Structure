package Hash;

import java.util.Arrays;

public class DesignSet {
    boolean set[];
    public DesignSet() {
        set = new boolean[1000001];
        Arrays.fill(set, false);
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}
