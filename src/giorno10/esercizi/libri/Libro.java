package giorno10.esercizi.libri;

import java.util.Objects;

public class Libro {
    private String titolo;
    private String isbn;
    private String autore;

    public Libro(String titolo, String isbn, String autore){
        this.titolo = titolo;
        this.isbn = isbn;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(titolo, libro.titolo) && Objects.equals(autore, libro.autore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titolo, autore);
    }
}
