package prueba;
public class Restaurante {
    private MenuFactory factory;
    
    public Restaurante(MenuFactory factory) {
        this.factory = factory;
    }

    public void mostrarMenu() {
        System.out.println(factory.crearEntrada());
        System.out.println(factory.crearPlatoPrincipal());
        System.out.println(factory.crearBebida());
        System.out.println(factory.crearPostre());
    }

    public static void main(String[] args) {
        Restaurante restauranteGourmet = new Restaurante(new GourmetMenuFactory());
        Restaurante restauranteVegetariano = new Restaurante(new VegetarianoMenuFactory());
        Restaurante restauranteSaludable = new Restaurante(new SaludableMenuFactory());

        System.out.println("\nMenú Gourmet:");
        restauranteGourmet.mostrarMenu();

        System.out.println("\nMenú Vegetariano:");
        restauranteVegetariano.mostrarMenu();

        System.out.println("\nMenú Saludable:");
        restauranteSaludable.mostrarMenu();
    }
}
