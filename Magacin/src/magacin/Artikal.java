package magacin;

public abstract class Artikal {
private String naziv;
private int sifra;
private int kolicina;
private String opis;
public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
	this.naziv = naziv;
}
public int getSifra() {
	return sifra;
}
public void setSifra(int sifra) {
	this.sifra = sifra;
}
public int getKolicina() {
	return kolicina;
}
public void setKolicina(int kolicina) {
	this.kolicina = kolicina;
}
public String getOpis() {
	return opis;
}
public void setOpis(String opis) {
	this.opis = opis;
}



}