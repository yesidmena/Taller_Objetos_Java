import java.util.ArrayList;
    /*
		Asignamos los diferentes atributos de clase Fruta
    */
    public class Fruta {
        public String name;
        private float averageWeight;
        public ArrayList<String> colors;
   /*
        Ćonstructor
   */
    public Fruta (String name,Float averageWeight,ArrayList colors){
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    /*
		Metodos getter y setter (este y permitir el acceso a él desde otras instancias) del atributo colors
	*/
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}