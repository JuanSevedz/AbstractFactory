package prueba;
public class Entrada {
    private String tipo;

    public Entrada(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Entrada " + tipo;
    }
}
