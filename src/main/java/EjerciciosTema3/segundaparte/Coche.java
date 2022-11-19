package EjerciciosTema3.segundaparte;

public class Coche {
    private Integer numPuertas;

    public Coche(Integer numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Integer incrementarPuertas (){
        return numPuertas + 1;
    }
}
