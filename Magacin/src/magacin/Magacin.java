package magacin;

import java.util.ArrayList;
import java.util.List;

import magacin.interfejs.MagacinIntefejs;

public class Magacin implements MagacinIntefejs {
List<Artikal> artikli=new ArrayList<>();
	@Override
	public void dodajAtrtikal(Artikal a, int kolicina) {
		artikli.add(a);

	}

	@Override
	public void obrisiArtikal(int kolicina) {
		// TODO Auto-generated method stub

	}

	@Override
	public Artikal vratiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
