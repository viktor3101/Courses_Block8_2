package KPI.courses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SimpleArrayList<String> arrayList = new SimpleArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add("string" + i);
            System.out.println(arrayList.get(i));
        }

        System.out.println("\n\n" + arrayList.size());
    }
}
