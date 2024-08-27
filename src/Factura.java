import java.util.Scanner;
public class Factura {
    public static void main(String[] args) {
        String nombreFactura;
        double precio_1, precio_2;
        double resultado_bruto, total, impuesto;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura por favor: ");
        nombreFactura = leer.nextLine();

        System.out.println("Ingrese el primer precio: ");
        precio_1 = leer.nextDouble();
        System.out.println("Ingrese el segundo precio: ");
        precio_2= leer.nextDouble();

        resultado_bruto = precio_1 + precio_2;
        impuesto = resultado_bruto * 0.19;
        total = resultado_bruto + impuesto;

        System.out.println("La factura " + nombreFactura + " de oficina tiene un total bruto de $" + resultado_bruto + ", con un impuesto de $" + impuesto +
                "\ny el monton despues delimpuesto es de $" + total);

    }
}
