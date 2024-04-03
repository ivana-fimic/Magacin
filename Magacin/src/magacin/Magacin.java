package magacin;

import java.util.ArrayList;
import java.util.List;

import magacin.interfejs.MagacinIntefejs;

public class Magacin implements MagacinIntefejs {
    List<Artikal> artikli=new ArrayList<>();
	@Override
	public void dodajAtrtikal(Artikal a, int kolicina) {
		if(a!=null) {
			artikli.add(a);
			a.setKolicina(a.getKolicina()+kolicina);
		}
		

	}

	@Override
	public void obrisiArtikal(Artikal a,int kolicina) {
		 a.setKolicina(a.getKolicina()-kolicina);

	}

	@Override
	public Artikal vratiArtikal(int sifra) {
		for(Artikal a: artikli) {
			if(a.getSifra()==sifra)
				return a;
		}
		return null;
	}

}
