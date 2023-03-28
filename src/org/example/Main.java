package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> Lista= new ArrayList<>();
        Lista.add(new Person("A", "B"));
        Lista.add(new Person("C", "D"));
        Exporter E1=new Exporter(new ExportConfig("Fisier1.txt","Header1"),Lista);

        Lista.add(new Person("E", "F"));
        Exporter E2=new Exporter(new ExportConfig("Fisier2.txt","Header2"),Lista);
        E1.export();
        E2.export();
    }
}
