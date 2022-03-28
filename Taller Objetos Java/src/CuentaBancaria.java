    /*
		Asignamos los diferentes atributos de clase CuentaBancaria
    */
public class CuentaBancaria {
    private int acconuntNumber;
    protected boolean activated;
    /*
        COnstructor
    */
    public CuentaBancaria (int acconuntNumber,boolean activated){
        this.acconuntNumber = acconuntNumber;
        this.activated = activated;
    }

    /*
        Metodos getter y setter (este y permitir el acceso a él desde otras instancias) para el atributo activated
    */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean getActived() {
        return activated;
    }
}
