public class Names {
    public static void main(String[] args) {
        String[] names = {"Dee", "Pee", "Mee"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Dee")) System.out.println(names[i]);
        }
        System.out.println("Not found");
    }

}
