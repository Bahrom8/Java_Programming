package day26_statics;

public class Test_iPhoneObjects {

    public static void main(String[] args) {

        iPhone iphone = new iPhone("iPhone 12 Pro", "Space Grey",1000);

        System.out.println(iphone.model);
        System.out.println(iphone.color);
        System.out.println(iphone.price);

        iphone.printPhoneInfo();

        /*
        System.out.println(iphone.brand);
        System.out.println(iphone.OS);
        iphone.printOperatingSystem();
         */

        System.out.println(iPhone.brand);
        System.out.println(iPhone.OS);
        iPhone.printOperatingSystem();

    }

}
