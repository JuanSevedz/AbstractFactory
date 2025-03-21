package prueba;


public class GourmetMenuFactory implements MenuFactory {
    @Override
    public Entrada crearEntrada() {
        return new Entrada("Gourmet");
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipal("Gourmet");
    }

    @Override
    public Bebida crearBebida() {
        return new Bebida("Gourmet");
    }

    @Override
    public Postre crearPostre() {
        return new Postre("Gourmet");
    }
}
