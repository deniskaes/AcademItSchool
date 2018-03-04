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
        System.out.println("byte занимает " + getTypeSize((byte) 20) + " байт");
        short number = 12304;
        System.out.println("short занимает " + getTypeSize(number) + " байт");
        long number2 = 234234l;
        System.out.println("long занимает " + getTypeSize(number2) + " байт");
        float number3 = 456435f;
        System.out.println("float занимает " + getTypeSize(number3) + " байт");
        System.out.println("int занимает " + getTypeSize(23423) + " байт");
        System.out.println("double занимает " + getTypeSize(34897535d) + " байт");

    }
}
