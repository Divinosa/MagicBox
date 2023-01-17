import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[3];
        MagicBox <String> magicBoxNames = new MagicBox<String>(names);


        magicBoxNames.add("Вася");
        magicBoxNames.add("Петя");
        System.out.println(magicBoxNames.pick());


    }
}