package Unidad03.Actividadencasa.models;

public class Moto extends Vehiculo {
    private boolean haciendoWheelie;

    public Moto(String marca, String modelo, String color) {
        super(marca, modelo, color);
        this.haciendoWheelie = false;
        setVelocidadMaxima(300); 
    }

    public boolean isHaciendoWheelie() {
        return haciendoWheelie;
    }

    public void wheelie() {
        if (getVelocidad() > 30) {
            haciendoWheelie = true;
            System.out.println("La moto hace un wheelie impresionante!");
        } else {
            System.out.println("Necesitas más velocidad o arrancar para hacer un wheelie");
        }
    }

    public void stopWheelie() {
        if (haciendoWheelie) {
            haciendoWheelie = false;
            System.out.println("La moto vuelve a estar sobre sus dos ruedas");
        }
    }
}


