import java.util.Objects;

public class Cuento {

    private String titulo;
    private int numpaginas;
    private Autor autor;


    public Cuento(String titulo, int numpaginas){

        if(minPaginas(numpaginas)){
            this.numpaginas = numpaginas;
            this.titulo = titulo;
            this.autor = new Autor();

        }

    }

    public Cuento(Autor autor, String titulo, int numpaginas){

        if(minPaginas(numpaginas)){
            this.numpaginas = numpaginas;
            this.titulo = titulo;
            this.autor = autor;

        }
    }

    private boolean minPaginas(int numpaginas){
        return numpaginas >= 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuento cuento = (Cuento) o;
        return numpaginas == cuento.numpaginas && Objects.equals(titulo, cuento.titulo) && Objects.equals(autor, cuento.autor);
    }

    @Override
    public String toString() {
        return "Cuento{" +
                "titulo='" + titulo + '\'' +
                ", numpaginas=" + numpaginas +
                autor.toString() +
                '}';
    }
}
