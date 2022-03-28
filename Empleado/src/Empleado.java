
public class Empleado {
    /*
        Atributos
    */
    protected String name;

    protected String lastName;

    protected int age;

    protected double salary;
    /*
        Getter y Setter
    */
    public String getName() {
        return name;
    }
    /*
        Modifica el nombre de un empleado
    */
    public void setName(String name) {
        this.name = name;
    }

    /*
        Retorna la edad de un empleado
    */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getSalary() {
        return salary;
    }

    /*
        Se ejecuta una validacion hacia el salario del empleado
     */
    public boolean plus (double extraSalary){
        boolean increase=false;
        if (age >40 && compruebaNombre()){
            salary +=extraSalary;
            increase=true;
        }
        return increase;
    }

    //Metodos privados
    /*
        Valida si hay datos en la casilla name
     */
    private boolean compruebaNombre(){
        if(name.equals("")){
            return false;
        }
        return true;
    }

    /*
         Constructores
    */
    public Empleado(){
        this ("", "", 0, 0);
    }

    /*
        Constructor con cad uno de sus parametros
     */
    public Empleado(String name, String lastName, int age, double salary){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
}
