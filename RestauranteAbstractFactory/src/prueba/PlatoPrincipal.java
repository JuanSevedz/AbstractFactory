package prueba;
public class PlatoPrincipal {
    private String tipo;

    public PlatoPrincipal(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Plato Principal " + tipo;
    }
}
