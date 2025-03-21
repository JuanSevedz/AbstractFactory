package prueba;


public class VegetarianoMenuFactory implements MenuFactory {
    @Override
    public Entrada crearEntrada() {
        return new Entrada("Vegetariano");
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipal("Vegetariano");
    }

    @Override
    public Bebida crearBebida() {
        return new Bebida("Vegetariano");
    }

    @Override
    public Postre crearPostre() {
        return new Postre("Vegetariano");
    }
}

