import cosas.Aula;

public class Main {
  public static void main(String[] args) {
//    //Hemos creado nuestro primer objeto...instanciamos la clase Persona...
//    //Objeto es una instancia de una clase
//    Persona p1=new Persona("Mery",(byte) 45,1.69);
//    //Valores de tipo objeto..."Referencia" un espacio en memoria
//    System.out.println(p1);
//    //p2 ocupa el mismo espacio de memoria y la misma referencia de memoria...
//    Persona p2=p1;
//    System.out.println(p2); //utilizan la misma referencia de memoria.
//    Persona p3=new Persona();//id=2
//    System.out.println(p3);
//    p3=null; //Este objeto se queda sin referencia en memoria y el recolector de basura lo elimina...
//    System.out.println(p3);
//    Persona p4; //new es quien crea el objeto... y su referencia en memoria.
//    //Otra forma que actua el recolector de basura
//    p4=new Persona();//id=3
//    p4=new Persona(); //anula la referencia de la línea anterior. //id=4
//    //Llamada a métodos getter...solicitar información o mostrar
//    System.out.println("Nombre: " + p1.getNombre()); //Mary
//    System.out.println("Edad: " + p1.getEdad());
//    System.out.println("Estatura: " + p1.getEstatura());
//    Persona p5=new Persona("Juan",(byte) 22,1.80);
//    System.out.println("Nombre: " + p5.getNombre()); //Juan
//    p4.setNombre("Alba");
//    p4.setEdad((byte)23);
//    p4.setEstatura(1.60);
//    System.out.println(p4.toString());
//    System.out.println(p5.toString());
// /***Llamada a un atributo static***/
//        System.out.println("Nombre de la Empresa: "+Persona.empresa);
//        System.out.println("Nombre " +p2.getNombre()+ " Empresa: "+Persona.empresa);
//        //camiar el valor de un atributo static
//        Persona.empresa="Los cinco hermanos, S.L."; //
//        System.out.println("Nombre " +p2.getNombre()+ " Empresa: "+Persona.empresa);
Aula aula= new Aula();
aula.setId("AT01"); //encapsulando su valor...solo se accede a sus valores mediante los métodos getter y setter
    }
}
