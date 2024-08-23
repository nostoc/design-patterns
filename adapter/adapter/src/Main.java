public class Main {
    public static void main(String[] args) {
        Iphone6s iphone6s = new Iphone6s(new Iphone4sTo6sAdapter());
        iphone6s.OnCharrge();
    }
}
