import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (String el : nameSet) {
            System.out.println(el);
        }
    }
}