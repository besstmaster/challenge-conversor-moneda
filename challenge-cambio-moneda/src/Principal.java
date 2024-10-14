import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaMonedas buscar = new ConsultaMonedas();
        Monedas moneda = buscar.buscarMonedas();
        while (true){
            System.out.println("""
                Sea Bienvenido/a al Conversor de Moneda =)
                1- Dólar a peso argentino
                2- Peso argentino a Dólar
                3- Dólar a Real brasileño
                4- Real brasileño a Dólar
                5- Dólar a Peso colombiano
                6- Peso colombiano a Dólar
                7- Salir
                Elija una opción valida
                ******************************************
                    """);
            Scanner lectura = new Scanner(System.in);
            var busqueda = lectura.nextInt();

            if(busqueda==1){
                System.out.println("Digite el valor en dólares para convertirlo a peso Argentino");
                Scanner lectura2 = new Scanner(System.in);
                float dolar = lectura2.nextFloat();
                float pesoArgentino = moneda.ARS()*dolar;
                System.out.println("Dolares: "+"$"+dolar+" son: " + "$"+pesoArgentino + "Pesos Argentinos");
            } else if (busqueda==2) {
                    System.out.println("Digite el valor en pesos argentinos para convertirlo a dólares");
                    Scanner lectura2 = new Scanner(System.in);
                    float pesoArgentino = lectura2.nextFloat();
                    float dolar = pesoArgentino/ moneda.ARS();
                    System.out.println("Pesos argentinos: "+"$"+pesoArgentino+" son: " + "$"+dolar + "Dolares");
            } else if (busqueda==3) {
                System.out.println("Digite el valor en dólares para convertirlo a Reales Brazileños");
                Scanner lectura2 = new Scanner(System.in);
                float dolar = lectura2.nextFloat();
                float realBrazil = moneda.BRL()*dolar;
                System.out.println("Dolares: "+"$"+dolar+" son: " + "$"+realBrazil +" " + "Reales Brazileños");

            }else if (busqueda==4) {
                System.out.println("Digite el valor en Reales Brazileños para convertirlo a Dólares");
                Scanner lectura2 = new Scanner(System.in);
                float realBrazil = lectura2.nextFloat();
                float dolar = realBrazil/moneda.BRL();
                System.out.println("Reales Brazileños: "+"$"+dolar+" son: " + "$"+realBrazil +" " + "Dólares");

            }else if (busqueda==5) {
                System.out.println("Digite el valor en dólares para convertirlo a Pesos Colombianos");
                Scanner lectura2 = new Scanner(System.in);
                float dolar = lectura2.nextFloat();
                float pesoColombiano = moneda.COP()*dolar;
                System.out.println("Dolares: "+"$"+dolar+" son: " + "$"+pesoColombiano +" " + "Pesos Colombianos");

            }else if (busqueda==6) {
                System.out.println("Digite el valor en pesos Colombianos para convertirlo a Dólares");
                Scanner lectura2 = new Scanner(System.in);
                float pesoColombiano = lectura2.nextFloat();
                float dolar = pesoColombiano/moneda.COP();
                System.out.println("Pesos Colombianos: "+"$"+pesoColombiano+" son: " + "$"+dolar +" " + "Dólares");

            }else{
                break;
            }
        }

    }
}
