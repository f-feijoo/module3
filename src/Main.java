public class Main {
    public static void main(String[] args) {
        double unPrecio = 100;
        System.out.println("El precio con IVA es: "+calcularIva(unPrecio));
    }

    public static double calcularIva(double precio) {
        double precioConIva = precio * 1.21;
        return precioConIva;
    }
}