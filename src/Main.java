public class Main {
    public static void main(String[] args) {
        int v = 12345;
        while (v > 0){
            System.out.println(v % 10);
            v /= 10;
        }
    }
}