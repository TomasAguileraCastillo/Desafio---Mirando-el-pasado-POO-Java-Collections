package cl.FiestaOnline;

import java.util.Set;
import java.util.TreeSet;

/**
 * Nombre del Package :cl.FiestaOnline.MarcasAntiguas
 * Creado por : Tomás Aguilera.
 * Creacion del Archivo : jueves 13 de junio de 2024
 * 13-06-2024 22:53
 * Nombre del Proyecto Desafio - Mirando el pasado
 */
public class CompañerosColegio {
    //Atributos
    Set<String> invitados = new TreeSet<>();

    //Constructor Vacio

    public CompañerosColegio() {
    }


    //Constructor Completo

    public CompañerosColegio(Set<String> invitados) {
        this.invitados = invitados;
    }


    //Metodos

    public void agregarcompañeros(){

        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        System.out.println("quedan agregados los Siguiente Nombres : " + invitados);

        Set<String> posiblesInvitados =new TreeSet<>();
        System.out.println("se agregan ex compañeros en un listado aparte, ya que no les caía muy bien." +
                        "Jorge, Francisco y Marcos");
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);
        System.out.println("Ambos Listado quedan asi :" + invitados);
        invitados.remove("Jorge");
        System.out.println("se decide sacar a Jorge del listado");
        System.out.println("Listado Final "+invitados);
        System.out.println("Total " + invitados.size());

    }



    //Getters y Setters

    public Set<String> getInvitados() {
        return invitados;
    }

    public void setInvitados(Set<String> invitados) {
        this.invitados = invitados;
    }
}
