public class PhoneBook {
    public static void main(String[] args) {
        String[] names = {"Dee", "Pee", "Mee", "Cee"};
        String [] numbers ={"070", "6790", "675", "435"};

        for (int i = 0; i < 4; i++) {
            if (names[i].equals("Pee")){
                System.out.println(numbers[i]);
                return;
            }
        }

    }
}
