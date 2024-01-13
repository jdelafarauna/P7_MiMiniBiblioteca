import java.util.ArrayList;

public class MiniBiblioteca {

    private ArrayList<Cuento> biblioteca;

    public MiniBiblioteca(){

        biblioteca = new ArrayList<>();

    }

    public void añadir(Cuento cuento){

        if (!(biblioteca.contains(cuento))){
            biblioteca.add(cuento);
        }

    }

    public void añadir(Autor autor, String titulo, int numpaginas){

        Cuento cuento = new Cuento(autor, titulo, numpaginas);
        if (!(biblioteca.contains(cuento))){
            biblioteca.add(cuento);
        }

    }
    public void añadir(String titulo, int numpaginas){

        Cuento cuento = new Cuento(titulo, numpaginas);
        if (!(biblioteca.contains(cuento))){
            biblioteca.add(cuento);
        }

    }

    @Override
    public String toString() {
        return "MiniBiblioteca{" +
                "biblioteca=" + biblioteca +
                '}';
    }
}
