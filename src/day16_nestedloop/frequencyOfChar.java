package day16_nestedloop;

public class frequencyOfChar {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) { // i: index number of str
            if(str.charAt(i) == ch)  { // if character of string is equal to given character the nit means the given character has appeared
                count++;
            }
        }
        System.out.println(count);
    }

}
