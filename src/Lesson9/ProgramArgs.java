package Lesson9;

public class ProgramArgs {
    public static void main(String[] args) {
        System.out.println("Пронрамме передано " + args.length + " парам.");
        for (String a : args) {
            System.out.println(a);
        }
    }
}
