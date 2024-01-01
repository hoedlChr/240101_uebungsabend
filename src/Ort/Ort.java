package Ort;

import java.util.ArrayList;

public class Ort {
    public String name;
    public ArrayList<Ort> nachbar = new ArrayList<>();

    public Ort(String name) {
        this.name = name;
    }

    public void addNachbar(Ort ort){
        nachbar.add(ort);
    }

    @Override
    public String toString() {
        return "Ort.Ort{" +
                "Name='" + name + '\'' +
                ", Nachbar=" + nachbar +
                '}';
    }
}
