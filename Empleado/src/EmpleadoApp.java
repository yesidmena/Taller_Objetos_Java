/*
    Vamos a ver un ejemplo, tenemos una clase empleado que sera una superclase y las clases hijas serán el tipo de
    empleados que puede haber como comerciales o repartidores. La idea es que los empleados sean del tipo que sean
    tienen atributos o métodos comunes y para optimizar las clases creamos una clase padre que contenga
    lo común a todas las hijas y en las hijas, ademas de los atributos del padre pueden tener sus propios
    atributos o métodos.
 */
public class EmpleadoApp {
    public static void main(String[] args) {
        /*
            Asignamos valores a los objetos de la clases hijas
         */
        Comercial comercial1=new Comercial("Antonio", "Lopez", 24, 600, 50);
        Repartidor repartidor1=new Repartidor("Fernando", "Ureña", 43, 400, "Este");
        /*
            Llamamos o invocacmos los metdos de la clase padre
         */
        comercial1.plus(300);
        repartidor1.plus(300);


        System.out.println("El salario actual del comercial es "+comercial1.getSalary());
        System.out.println("El salario actual del repartidor es "+repartidor1.getSalary());
    }
}