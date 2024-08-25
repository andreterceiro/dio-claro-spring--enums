public class Teste {
    private int a;
    private int b;
    public Teste(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println(this.a + " - " + this.b);
    }

    void setA(int a) {
        this.a = a;
    }
    void setB(int b) {
        this.b = b;
    }
    int getA() {
        return this.a;
    }
    int getB() {
        return this.b;
    }
}