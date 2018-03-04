package Lesson6;

public class TypeSize {
    public static int getTypeSize(byte a) {
        return 1;
    }

    public static int getTypeSize(short a) {
        return 2;
    }

    public static int getTypeSize(int a) {
        return 4;
    }

    public static int getTypeSize(long a) {
        return 8;
    }

    public static int getTypeSize(float a) {
        return 4;
    }

    public static int getTypeSize(double a) {
        return 8;
    }

    public static void main(String[] args) {
        System.out.println(getTypeSize((byte) 20));
        short number = 12304;
        System.out.println(getTypeSize(number));
        long number2 = 234234l;
        System.out.println(getTypeSize(number2));
        float number3 = 456435f;
        System.out.println(getTypeSize(number3));
        System.out.println(getTypeSize(23423));
        System.out.println(getTypeSize(34897535d));

    }
}
