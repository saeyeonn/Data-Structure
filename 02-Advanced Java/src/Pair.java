public class Pair <T extends Comparable> {
    private T first, second;

    public T max() {
        if (first.compareTo(second) <= 0) return first;
        else return second;
    }

    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>();
        pair.first = Integer.valueOf(5);
        pair.second = Integer.valueOf(22);
        System.out.println(pair.max());
    }
}
