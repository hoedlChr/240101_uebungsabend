package Ort;

import java.util.ArrayList;

public class TestOrt {
    public static void main(String[] args) {
        Ort graz = new Ort("Graz");
        Ort wagna = new Ort("Wagna");
        Ort linz = new Ort("Linz");
        Ort wien = new Ort("Wien");

//        System.out.println("graz.toString() = " + graz.toString());
        System.out.println("graz = " + graz);
        graz.addNachbar(wagna);
        graz.addNachbar(linz);
        graz.addNachbar(wien);
//        graz.addNachbar(wagna);
        System.out.println("graz = " + graz);

        System.out.println("---------");
        System.out.println(hasCircle(graz));
    }

    public static boolean hasCircle(Ort o){
        String firstElement = o.nachbar.get(0).name;
        String lastElement = "";

        ArrayList<Ort> nachbar = new ArrayList<>();
        nachbar = o.nachbar;

        for (Ort ort : nachbar) {
            lastElement = ort.name;
        }
        return firstElement == lastElement;
    }
}


