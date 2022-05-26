public class Wrappers {
    public static void main(String[] args){

        short num1 =1;
        byte num2 =10;
        int num3 =100;
        long num4 =1000l;
        float num5 =3.5f;
        double num6 = 3.5555;
        boolean flag = true;

        Short num7 = num1;
        Byte num8 = new Byte((byte)10);
        Integer num9 = 100;
        Long num10 = new Long(1000l);
        Float num11 = new Float(num5);

        Byte byteN = 120;
        Short shortN = 1;
        Integer intN = 1000;
        Long longN = 10L;
        Float floatN = 10F;
        Double doubleN = 10D;
        Character charN = 'C';

        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(num10);
        System.out.println(num11);
        System.out.println(byteN);
        System.out.println(shortN);
        System.out.println(intN);
        System.out.println(longN);
        System.out.println(floatN);
        System.out.println(doubleN);


    }
}
