public class Recursion {
    public static void main(String[] args) {
        draw(4);
    }

    private static void draw(int h) {
        if (h == 0) return;
        draw(h-1);
        for (int i = 0; i <h; i++){
            System.out.print("#");
        }
        System.out.println();
    }
}
