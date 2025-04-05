package Cw_04_05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Test1");
        lista.add("Test2");

        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        lista.remove(0);
        lista.remove("Test2");
        System.out.println(lista);

        ArrayList<Integer> lista1 = new ArrayList<>();

        Playlista playlista = new Playlista("Playlista1");
        playlista.dodajUtwor("Test1");
        playlista.dodajUtwor("Test2");
        playlista.dodajUtwor("Utwor1");
        playlista.dodajUtwor("Utwor2");
        playlista.dodajUtwor("Utwor3");

        playlista.dodajUtwor("Test1");
        playlista.dodajUtwor(null);
        playlista.dodajUtwor("");

        playlista.wyswietlUtwory();

        playlista.usunUtwor("Test1");
        playlista.usunUtwor(null);
        playlista.usunUtwor("");
        playlista.usunUtwor("Test5");
        playlista.wyswietlUtwory();

        playlista.wyszukajUtwory("Test");
        playlista.wyszukajUtwory("t");
        playlista.wyszukajUtwory(null);
        playlista.wyszukajUtwory("");

    }
}
