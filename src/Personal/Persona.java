package Personal;

public class Persona {
    //Definición de los atributos de la clase...
    String nombre; //ambito de la clase
    byte edad;
    double estatura;
    static String empresa="Los tres hermanos, S.L."; //parecido a constante...la diferencia es
    // que puede ser cambiado...y para mostrarlo o cambiarlo,
    // se llama a la calse no la instancia de un objeto.
    //Declarar un valor static de id que se incrementa ssgun los objetos sean instanciados a la clase
    static int id=0; //de la clase
    int id0;



    //Metodos constructores
    public Persona(String nombre, byte edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.id0=++id;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.id0=++id;
    }
    public Persona() {
        this.id0=++id;
    }
    //Métodos no estáticos, porque la clase no es estática (static)
    void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
    //Métodos-> comportamientos o acciones de la clase.
    //Métodos Getter
    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }
    //Métodos setter, me permiten asignar o actualizar valores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    //Ejemplo de los ámbitos de los atributos y variables...
    double crecer(double estatura) {
        double aumento=this.estatura+estatura;//variable de metodo
        if(aumento>this.estatura){
            String mensaje="El valor del aumento de estatura no es correcto"; //variable de bloque
            aumento=this.estatura;
        }
        return aumento;
    }

    //Ultimo metodo-> toString-> recomiendo formatearlo..

    @Override
    public String toString() {
        return "ID: " +id0+
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nEstatura: " + estatura;
    }
}
