package Unidad03.Actividadencasa.models;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private double velocidad;
    private double velocidadMaxima;

    public Vehiculo(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
        this.velocidadMaxima = 120; 
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    protected void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(double incremento) {
        double nuevaVelocidad = this.velocidad + incremento;
        if (nuevaVelocidad <= velocidadMaxima) {
            this.velocidad = nuevaVelocidad;
            System.out.println("El vehículo acelera a " + this.velocidad + " km/h");
        } else {
            this.velocidad = velocidadMaxima;
            System.out.println("El vehículo alcanzó su velocidad máxima de " + velocidadMaxima + " km/h");
        }
    }

    public void frenar(double decremento) {
        if (velocidad - decremento < 0) {
            velocidad = 0;
            System.out.println("El vehículo se ha detenido");
        } else {
            velocidad -= decremento;
            System.out.println("Frenando... Velocidad actual: " + velocidad + " km/h");
        }
    }
}


