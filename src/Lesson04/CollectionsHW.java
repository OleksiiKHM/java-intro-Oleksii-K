package Lesson04;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsHW {

    public static void printArrayContents(ArrayList arrayName){
        for (Object element: arrayName) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Joe");
        names.add("Bill");
        names.add("Valera");
        names.add("Innokentiy");
        names.add("Fabricio");
        names.add("Tom");

        System.out.println("Initial state of array:");
        printArrayContents(names);

        names.remove("Valera");

        System.out.println("");
        if (!names.contains("Valera")) {
            System.out.println("Object has been removed");
        } else {
            System.out.println("Object is still present in array list");
        }

        System.out.println("");
        System.out.println("Array after removing and object(sorting to be applied):");
        printArrayContents(names);

        Collections.sort(names);
        System.out.println("");

        System.out.println("Array after sorting:");
        printArrayContents(names);
        //
     }


}


