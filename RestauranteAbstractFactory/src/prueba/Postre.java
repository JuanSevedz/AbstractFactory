package prueba;
public class Postre {
    private String tipo;

    public Postre(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Postre " + tipo;
    }
}
