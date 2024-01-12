public class GenericTwo <T1, T2> {
    private T1 d1;
    private T2 d2;

    public GenericTwo() {
        d1 = null; d2 = null;
    }
    public void setData(T1 d1, T2 d2) {
        this.d1 = d1; this.d2 = d2;
    }
    public T1 getD1() {return d1;}
    public T2 getD2() {return d2;}
    public String StringtoString() {return d1 + ", " +d2;}
}
