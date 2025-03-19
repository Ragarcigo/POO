package cosas;

/**
 * Tanto los atributos como métodos de una clase se llaman miembros de la clase.
 * Moificadores de acceso...
 * por defecto...no se pone nada, visible en su propia clase y clases vecinas.
 * private...visible solo en la misma clase.
 * public...visible en clases vecinas y externas.
 * Atributos...protected...que solo es visible en las clases vecinas y sus herencias.
 */

public class Aula {
    //por convención los argumentos deben ser privados y acceder a sus valores mediante los metodos
    String id;
    private String nombre;
    private int nAlumnos;

// si no creo un constructor, automáticamente se crea uno vacío....

    public Aula(String id, String nombre, int nAlumnos) {
        this.id = id;
        this.nombre = nombre;
        this.nAlumnos = nAlumnos;
    }
    public Aula(){
    }

    //metodos getter y setter
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getnAlumnos() {
        return nAlumnos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnAlumnos(int nAlumnos) {
        this.nAlumnos = nAlumnos;
    }
}
