import java.util.Date;
    /*
		Asignamos los diferentes atributos de clase Persona
	*/
public class Persona {
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    

    /*
		Constructor
	*/
    public Persona(String name,String lastName1,String lastName2, Date dateBirth,float height){
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /*
		Metodos getter y setter (este y permitir el acceso a él desde otras instancias) para el atributo name
	*/
    public String setName(String name) {
        return name;
    }

    public void getName(String name) {
        this.name=name;
    }
}
