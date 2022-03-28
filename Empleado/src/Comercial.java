
public class Comercial extends Empleado {
    /*
         Comision por venta del comercial
    */
    private double commission;
    /*
         Constructores
     */
    public Comercial() {
        this.commission = 0;
    }

    /*
        Constructor con cad uno de sus parametros
    */
    public Comercial(String name, String lastName, int age, double salary, double commission) {
        super(name, lastName, age, salary);
        this.commission = commission;
    }
}