import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[3];
        MagicBox <String> magicBoxNames = new MagicBox<String>(names);
        Integer[] years = new Integer[3];
        MagicBox <Integer> magicBoxYears = new MagicBox<Integer>(years);

        //magicBoxNames.add("Вася");
        //magicBoxNames.add("Петя");
        //magicBoxNames.add("Саша");
        System.out.println(magicBoxNames.pick());



    }
}