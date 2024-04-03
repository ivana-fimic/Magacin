package magacin.interfejs;

import magacin.Artikal;

public interface MagacinIntefejs {
	public void dodajAtrtikal(Artikal a, int kolicina);

	public void obrisiArtikal(Artikal a,int kolicina);

	public Artikal vratiArtikal(int sifra);
	
	

}
