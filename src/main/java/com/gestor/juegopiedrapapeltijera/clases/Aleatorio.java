package com.gestor.juegopiedrapapeltijera.clases;

import javafx.scene.control.TextField;

public class Aleatorio
{
    int numero; //la utilizo para la función random y de esta manera obtener la imagen aleatoria
    String resultado; //La utilizo para retornar una cadena indicando si gana, pierde o empata el jugador
    int contadorYo = 0; //Se utilíza para contar las veces que gana el usuario
    int contadorMaquina = 0; //Se utiliza para contar las veces que gana la maquina

    public void Aleatorio(){}


    /*********************************************************************************************/
    /**** metodo generarImagen()                                                              ****/
    /*********************************************************************************************/
    //Esta función sirve para obtener la imagen aleatoria con la ayuda de la función random
    public String generarImagen()
    {
        numero = (int)(Math.random()*3+1); //obtengo un valor entre 1 y 3

        if(numero == 1) //Si el valor obtenido es 1, devuelvo la ruta de la imagen piedra
            resultado = "piedra.png";
        else if (numero == 2) //Si el valor obtenido es 2, devuelvo la ruta de la imagen papel
            resultado = "papel.png";
        else  //Si el valor obtenido es 3, devuelvo la ruta de la imagen tijera
            resultado = "tijera.png";

        return resultado;
    }


    /*********************************************************************************************/
    /**** metodo generarResultado(String s1, String s2, TextField txts1, TextField txts2)     ****/
    /*********************************************************************************************/
    //Esta función sirve para saber cual de los dos usuarios gano
    public String generarResultado(String s1, String s2, TextField txts1, TextField txts2) //s1 es el jugador y s2 es la maquina
    {
        if (s1.equals("piedra.png"))
        {
            if (s2.equals("piedra.png"))
                resultado = "Empate";
            else if (s2.equals("papel.png")) {
                resultado = "Perdiste";
                contadorMaquina++; //incremento el contador de la maquina cada vez que esta gana
            }
            else{
                resultado = "Ganaste";
                contadorYo++; //incremento el contador del usuario cada vez que este gana
            }
        }
        else if (s1.equals("papel.png"))
        {
            if (s2.equals("piedra.png"))
            {
                resultado = "Ganaste";
                contadorYo++;
            }
            else if (s2.equals("papel.png"))
                resultado = "Empate";
            else {
                resultado = "Perdiste";
                contadorMaquina++;
            }
        }
        else
        {
            if (s2.equals("piedra.png")) {
                resultado = "Perdiste";
                contadorMaquina++;
            }
            else if (s2.equals("papel.png")) {
                resultado = "Ganaste";
                contadorYo++;
            }
            else
                resultado = "Empate";
        }

        txts1.setText(""+contadorYo);  //en el TestField coloco el valor del contador para que se incremente
        txts2.setText(""+contadorMaquina); //en el TestField coloco el valor del contador para que se incremente
        return resultado; //Retorno una cadena de texto indicando si gano, perdio o empato
    }
}
