public class Main {
    public static void main(String[] args) {
        Navig navigator = new Navig(1000);

        new Thread(navigator).start();
    }
}