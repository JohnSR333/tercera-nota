package Unidad03.Actividadencasa.models;

public class Carro extends Vehiculo {
    private int puertas;
    private boolean puertaAbierta;

    public Carro(String marca, String modelo, String color, int puertas) {
        super(marca, modelo, color);
        this.puertas = puertas;
        this.puertaAbierta = false;
        setVelocidadMaxima(185);
    }

    public int getPuertas() {
        return puertas;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void abrirPuerta() {
        if (getVelocidad() > 0) {
            System.out.println("No se puede abrir la puerta mientras el carro está en movimiento");
        } else if (!puertaAbierta) {
            puertaAbierta = true;
            System.out.println("El carro abre una de sus " + puertas + " puertas");
        } else {
            System.out.println("La puerta ya está abierta");
        }
    }

    public void cerrarPuerta() {
        if (puertaAbierta) {
            puertaAbierta = false;
            System.out.println("El carro cierra la puerta");
        } else {
            System.out.println("La puerta ya está cerrada");
        }
    }

    @Override
    public void acelerar(double incremento) {
        if (puertaAbierta) {
            System.out.println("No se puede acelerar con las puertas abiertas");
        } else {
            super.acelerar(incremento);
        }
    }
}





