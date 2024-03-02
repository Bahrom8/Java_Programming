package day17_customClass;

public class frequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //a
            int count = 0;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {
                    count++;
                }

            }
            if(result.contains("" + ch)){ // if the character is already included in the result
                continue; //skip that character
            }
            result += ch + "" + count;

        }

        System.out.println(result);



    }
}
