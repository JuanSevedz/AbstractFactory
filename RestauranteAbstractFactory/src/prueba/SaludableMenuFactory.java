package prueba;


public class SaludableMenuFactory implements MenuFactory {
    @Override
    public Entrada crearEntrada() {
        return new Entrada("Saludable");
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipal("Saludable");
    }

    @Override
    public Bebida crearBebida() {
        return new Bebida("Saludable");
    }

    @Override
    public Postre crearPostre() {
        return new Postre("Saludable");
    }
}
