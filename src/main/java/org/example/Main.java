package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //NECESITO HACER UN LISTADO DE LOS PAISES SURAMERICANOS

        //PARA CADA PAIS NECESITO ALMACENAR EL NUMERO DE:
        //MEDALLAS DE ORO
        //MEDALLAS DE PLATA
        //MEDALLAS DE BRONCE

        //SUMAR EL NUMERO DE MEDALLAS DE CADA PAIS

        //INFORMAR CUAL ES EL PAIS CON MAS MEDALLAS

        //NECESITO INFORMAR CUAL ES EL PAIS CON MENOS MEDALLAS


        //TERMINAR SUMANDO EL TOTAL DE MEDALLAS DE LOS PAISES SURAMERICANOS


        ///////////////////////////////////////

        ArrayList<String> paises = new ArrayList<>();
        ArrayList<Integer> medallas = new ArrayList<>();
        Scanner lea = new Scanner(System.in);
        System.out.println("******OLIMPICOS 2024******");

        for (int i = 0; i < 2; i++){
            String pais;
            int sumatoriaMedallas = 0;
            System.out.print("\nIngrese un pais: ");
            pais=lea.nextLine();
            paises.add(pais);

            //PIDIENDO LOS DATOS DE MEDALLAS DE CADA PAIS
            System.out.println("Digita el numero de medallas de oro de: "+pais+": ");
            int medallasOro = lea.nextInt();
            System.out.println("Digita el numero de medallas de plata de: "+pais+": ");
            int medallasPlata = lea.nextInt();
            System.out.println("Digita el numero de medallas de bronce de: "+pais+": ");
            int medallasBronce = lea.nextInt();
            sumatoriaMedallas = medallasOro+medallasPlata+medallasBronce;
            System.out.print(pais+ "\nObtuvo en total: " + sumatoriaMedallas);

            lea.nextLine();

            medallas.add(sumatoriaMedallas);

        }
        //RECORRIEDO UN ARREGLO
        int paisMayor = medallas.get(0);
        System.out.println("\nEl pais con mas medallas obtuvo un total de: "+ paisMayor);
        for (Integer medalla:medallas){
            System.out.println(medalla);
            if (medalla>paisMayor){
                paisMayor=medalla;
            }

        }
        System.out.println("El pais con mas medallas obtuvo un total de: "+paisMayor);

        //QUIERO PREGUNTAR CUAL ES EL CAJON (INDICE) DONDE SE GUARDO
        //LA CANTIDAD DE MEDALLAS MAYOR

        int indiceGanador = medallas.indexOf(paisMayor);
        System.out.println("El indice ganador es el: "+ indiceGanador);

        //QUIERO OBTENER EL VALOR QUE HAY DENTRO DE UN CAJON
        System.out.println("Asi pues, el pais ganador fue: "+paises.get(indiceGanador));

        //CUAL ES EL PAIS QUE QUEDO DE ULTIMO
        int paisMenor = medallas.get(0);
        System.out.println("El pais con menos medllas obtuvo un total de: "+paisMenor);
        for (Integer medalla:medallas){
            System.out.println(medalla);
            if (medalla>paisMenor);
            paisMenor=medalla;
        }
        System.out.println("El pais con menos medayas obtuvo es: "+ paisMenor);



    }
}