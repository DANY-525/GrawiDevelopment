package com.example.administrador.wishers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrador on 13/08/2017.
 */
public class Programacion {

    private  String eventoCine,salirComida,irEvento,salirFiesta;


    public Programacion(String eventoCine, String salirComida, String irEvento, String salirFiesta) {
        this.eventoCine = eventoCine;
        this.salirComida = salirComida;
        this.irEvento = irEvento;
        this.salirFiesta = salirFiesta;
    }

    public String getEventoCine() {
        return eventoCine;
    }

    public void setEventoCine(String eventoCine) {
        this.eventoCine = eventoCine;
    }

    public String getSalirComida() {
        return salirComida;
    }

    public void setSalirComida(String salirComida) {
        this.salirComida = salirComida;
    }

    public String getIrEvento() {
        return irEvento;
    }

    public void setIrEvento(String irEvento) {
        this.irEvento = irEvento;
    }

    public String getSalirFiesta() {
        return salirFiesta;
    }

    public void setSalirFiesta(String salirFiesta) {
        this.salirFiesta = salirFiesta;
    }


    public static List<Programacion> crearUnaListaProgramacion(){


        ArrayList<Programacion> listaProgramable = new ArrayList<>();



        Programacion programacion = new Programacion("Ir a cine","Hoy:","http://www.uniminutoradio.com/wp-content/uploads/2015/09/cinema1.jpg","");
        Programacion programacion2 = new Programacion("Salir A comer","Hoy:","https://www.canalnutricion.com/wp-content/uploads/files/article/a/ayudas-para-salir-a-comer-en-un-restaurante_f7gze.jpg","");
        Programacion programacion3 = new Programacion("Ir a Evento","Hoy:","https://static1.squarespace.com/static/54db6b7be4b02e0b9537e6c2/t/5846fb9a197aeac7d8b8e139/1481046939998/bs-is-01.jpg?format=1500w","");
        Programacion programacion4 = new Programacion("Salir A rumbiar","Hoy:","https://media1.s-nbcnews.com/j/newscms/2016_07/1423266/daybreakerparty_1862c8b3897ee26a729ba214c638c3e7.nbcnews-fp-1240-520.jpg","");

        listaProgramable.add(programacion);
        listaProgramable.add(programacion2);
        listaProgramable.add(programacion3);
        listaProgramable.add(programacion4);



        return listaProgramable;





    }



}
