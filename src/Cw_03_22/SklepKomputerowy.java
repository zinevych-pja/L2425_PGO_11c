package Cw_03_22;

import java.time.LocalDate;

public class SklepKomputerowy {

    private Produkt[] produkty = new Produkt[10];
    private Klient[] klienci = new Klient[10];
    private Zamowienie[] zamowienia = new Zamowienie[10];
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;

    public void dodajProdukt(Produkt produkt1) {
        //TODO
    }

    public void dodajKlienta(Klient klient1) {
        //TODO
    }

    public Zamowienie utworzZamowienie(
            Klient klient1,
            Produkt[] produktyZamowienia1,
            int[] ilosciZamowienia1) {

        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setId(0);
        zamowienie.setKlient(klient1);
        zamowienie.setProdukty(produktyZamowienia1);
        zamowienie.setIlosci(ilosciZamowienia1);
        zamowienie.setStatus("Nowe");
        zamowienie.setDataZamowienia(LocalDate.now().toString());

        return zamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie1) {
        //TODO
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        //TODO
    }

    public void zmienStatusZamowienia(int id, String zrealizowane) {
        //TODO
    }

    public void wyswietlZamowieniaKlienta(int i) {
        //TODO
    }

    //TODO metody z zadania
}
