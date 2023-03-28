package org.example;

import java.util.ArrayList;
import java.util.List;

public class Exporter {
    ExportConfig config;
    List<Person> Lista;

    public Exporter(ExportConfig config, List<Person> Lista) {
        this.config = config;
        this.Lista = new ArrayList<>(Lista);
    }
    void export(){
        System.out.println("Deschid fisier "+ config.path());
        System.out.println("Scriu "+ config.header());
        for(Person p: Lista){
            System.out.println("Scriu "+p.getFirstName()+ " "+ p.getLastName());
        }
    }
}