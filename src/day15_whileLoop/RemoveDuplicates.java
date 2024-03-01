package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "xxxxzzzzyyyyyyxxxxzzzzzzffffggggeeeexxxxx";

        String result = ""; //"abc"

        for (int i = 0; i < str.length(); i++) { // i: index number of str

            char each = str.charAt(i); //each character of the String str

            if(!result.contains( "" + each)){  // if string result does not contain the character of String str yer
                result +=each; // thn we will add the character to string result
            }
            // if the character is not contained yet in the new string, the nwe will add it to the new string

        }
        System.out.println(result);





    }
}
