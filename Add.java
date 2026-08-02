class Add {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class Main {
    public static void main(String[] args) {
        Add obj = new Add();
        obj.sum(10, 20);
        obj.sum(10, 20, 30);
    }
}
