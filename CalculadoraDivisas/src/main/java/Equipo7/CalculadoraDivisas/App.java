package Equipo7.CalculadoraDivisas;

import Equipo7.Funcionalidad.GestorEventos;
import Equipo7.Funcionalidad.Methods;
import Equipo7.Interfaz.InterfazGrafica;

public class App 
{
    public static void main( String[] args )
    {
		//GRAPHIC APPLICATION INVOCATION
		InterfazGrafica window = new InterfazGrafica();
		Methods methods = new Methods();
		GestorEventos gestorEventos = new GestorEventos(window,methods);
    }
}
