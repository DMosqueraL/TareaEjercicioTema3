package EjerciciosTema3.segundaparte;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche miCoche = new Coche(4);
        Integer totalPuertas;

        totalPuertas = miCoche.incrementarPuertas();
        System.out.println("Número de puestas del coche: " + totalPuertas);

    }
}
