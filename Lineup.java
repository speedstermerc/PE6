import java.util.ArrayList;

public class Lineup<T extends Comparable<T>> {
    ArrayList<T> lineup;
    boolean isAscending; //if this value is false, it must be in descending order
    public Lineup(T first, T second, T third, T fourth) {
        isAscending = true;
        if (first == null || second == null || third == null || fourth == null) {
            return;
        }
        lineup = new ArrayList<T>(4);
        lineup.add(first);
        lineup.add(second);
        lineup.add(third);
        lineup.add(fourth);
    }
    @Override
    public String toString() {
        return String.format("%s -> %s -> %s -> %s", lineup.get(0), lineup.get(1), lineup.get(2), lineup.get(3));
    }
    public boolean add(T element) {
        if (lineup.size() >= 4 || element == null) {
            return false;
        }

    }
    public ArrayList<T> getLineup() {
        return lineup;
    }
    
}
