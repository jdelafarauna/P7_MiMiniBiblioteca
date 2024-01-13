public class Autor {

    private String nombre;


    public Autor(String Nombre){
        this.nombre = nombre;
    }

    public Autor(){
        this.nombre = "Anonimo";
    }

    @Override
    public String toString() {
        return "Autor " + nombre;
    }
}
