package magacin;

import java.util.Objects;

public abstract class Artikal {
	private String naziv;
	private int sifra;
	private int kolicina;
	private String opis;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null)
			throw new NullPointerException("Naziv ne sme biti null");

		if (naziv.isEmpty()) {
			throw new IllegalArgumentException("Naziv ne sme biti prazan");
		}
		this.naziv = naziv;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if (sifra < 0)
			throw new IllegalArgumentException("Sifra ne sme biti manja od nule");
		this.sifra = sifra;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		if (kolicina < 0)
			throw new IllegalArgumentException("Kolicina ne sme biti manja od nule");
		this.kolicina = kolicina;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if (opis == null)
			throw new NullPointerException("Opis ne sme biti null");

		if (opis.isEmpty()) {
			throw new IllegalArgumentException("Opis ne sme biti prazan");
		}
		this.opis = opis;
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", kolicina=" + kolicina + ", opis=" + opis + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}

}
