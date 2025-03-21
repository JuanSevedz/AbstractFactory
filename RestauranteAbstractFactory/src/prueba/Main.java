package prueba;

public class Main {
    public static void main(String[] args) {
        PruebaMenu.probarMenu("Vegetariano", new VegetarianoMenuFactory());
        PruebaMenu.probarMenu("Gourmet", new GourmetMenuFactory());
        PruebaMenu.probarMenu("Saludable", new SaludableMenuFactory());
    }
}
