public class GenericEx {
    public static void main(String[] args) {
        GenericTwo<Integer, String> g = new GenericTwo<>();
        g.setData(Integer.valueOf(3), new String("Hello"));
        System.out.println(g.StringtoString());
    }
}
