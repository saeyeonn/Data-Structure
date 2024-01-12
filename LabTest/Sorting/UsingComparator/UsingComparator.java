package Sorting.UsingComparator;

public class UsingComparator implements Comparable<Player>{
    public int compare(Player a, Player b) {
        if (a.score < b.score) {
            return 1;
        } else if (a.score > b.score) {
            return -1;
        } else {
            return a.name.compareTo(b.name);
        }
    }

    @Override
    public int compareTo(Player o) {
        return 0;
    }
}
