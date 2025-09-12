package ActividadEnGrupo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        Ticket reserva = new Ticket(
            "TK12345",
            "Business",
            "Juan Pérez",
            "RES-9876",
            "Confirmed"
        );

        System.out.println("=== Reserva inicial ===");
        reserva.showInfo();

        System.out.println("\n=== Actualizar datos de la reserva ===");

       
        reserva.setPassengerName(pedirString(sc, "Nuevo nombre del pasajero: "));
        reserva.setSeatClass(pedirOpcion(sc, "Nueva clase de asiento (Economy/Business/VIP): ",
                                         new String[]{"Economy","Business","VIP"}));
        reserva.setTicketNumber(pedirString(sc, "Nuevo número de tiquete: "));
        reserva.setReservationCode(pedirString(sc,"Nuevo código de reserva: "));
        reserva.setReservationStatus(pedirOpcion(sc,"Nuevo estado de la reserva (Confirmed/Pending/Cancelled): ",
                                                 new String[]{"Confirmed","Pending","Cancelled"}));

        System.out.println("\n=== Reserva actualizada ===");
        reserva.showInfo();

        sc.close();
    }

   
    public static String pedirString(Scanner sc, String mensaje) {
        String input;
        do {
            System.out.print(mensaje);
            input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Debe ingresar un valor válido.");
            }
        } while (input.isEmpty());
        return input;
    }

   
    public static String pedirOpcion(Scanner sc, String mensaje, String[] opciones) {
        String input;
        boolean valido;
        do {
            System.out.print(mensaje);
            input = sc.nextLine();
            valido = false;
            for (String opcion : opciones) {
                if (input.equalsIgnoreCase(opcion)) {
                    valido = true;
                    input = opcion; 
                    break;
                }
            }
            if (!valido) {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (!valido);
        return input;
    }
}
