package prueba;

public class PruebaMenu {
    public static void probarMenu(String tipo, MenuFactory factory) {
        System.out.println("\n=== Menú " + tipo + " ===");
        Restaurante restaurante = new Restaurante(factory);
        restaurante.mostrarMenu();
    }
}
