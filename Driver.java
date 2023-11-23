public class Driver {
    public static void main(String[] args) {
        Lineup<String> lineup = new Lineup<>("Hello", null, "fart", "EEEE");
        System.out.println(lineup);
        System.out.println(lineup.getLineup().size());
    }
}
