package day17_customClass;

public class uniqueCharacters2 {
    public static void main(String[] args) {

        String str = "aabcccd";
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // a
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) { // check how many times te ch has appeared is str
                if (str.charAt(i) == ch) {
                    frequency++; // increase the frequency by 1
                }
            }
            if (frequency == 1) { // if the frequency is one, then it's unique
                unique += ch;
            }
        }
        System.out.println(unique);

    }
}
