package prueba;


public interface MenuFactory {
    Entrada crearEntrada();
    PlatoPrincipal crearPlatoPrincipal();
    Bebida crearBebida();
    Postre crearPostre();
}
