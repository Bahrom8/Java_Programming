package day16_nestedloop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("what if this loop neds to be repeated 5x - 10x - or many more times");
            
        }

        System.out.println("--------------------------------");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.println("Nested Loop1");
            }

        }
    }
}
