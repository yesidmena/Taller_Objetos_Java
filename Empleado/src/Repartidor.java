
public class Repartidor extends Empleado{
    /*
        Zona del repartidor
    */
    private String zone;

    /*
        Constructores
     */
    public Repartidor(){
        this.zone ="";
    }

    /*
        Constructor con cad uno de sus parametros
     */
    public Repartidor(String name, String lastName, int age, double salary, String zone) {
        super(name, lastName, age, salary);
        this.zone =zone;
    }
}