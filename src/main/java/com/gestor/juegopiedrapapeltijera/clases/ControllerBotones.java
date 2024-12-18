package com.gestor.juegopiedrapapeltijera.clases;

import com.gestor.juegopiedrapapeltijera.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

public class ControllerBotones
{
    /*************************************************************************************/
    //Declaro estas variables para poder acceder a los campos de TextField, Label y ImageView
    @FXML private TextField txtContadorYo;
    @FXML private TextField txtContadorMaquina;
    @FXML private Label lblResultado;
    @FXML private ImageView imgYo;
    @FXML private ImageView imgMaquina;
    String url = "";
    Aleatorio nuevo = new Aleatorio();


    /*********************************************************************************************/
    /**** @FXML protected void mostrarPiedra()                                                ****/
    /*********************************************************************************************/
    //Este metodo permite mostrar la imagen piedra.png si se presiona ese boton

    @FXML protected void mostrarPiedra()
    {
        try
        {
            Image imagen = new Image("piedra.png");
            url = nuevo.generarImagen();
            Image imagenMaquina = new Image(url);
            imgYo.setImage(imagen);
            imgMaquina.setImage(imagenMaquina);

            lblResultado.setText(nuevo.generarResultado("piedra.png",url,txtContadorYo,txtContadorMaquina));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /*********************************************************************************************/
    /**** @FXML protected void mostrarPapel()                                                 ****/
    /*********************************************************************************************/
    //Este metodo permite mostrar la imagen papel.png si se presiona ese boton


    @FXML protected void mostrarPapel()
    {
        try
        {
            Image imagen = new Image("papel.png");
            url = nuevo.generarImagen();
            Image imagenMaquina = new Image(url);
            imgYo.setImage(imagen);
            imgMaquina.setImage(imagenMaquina);

            lblResultado.setText(nuevo.generarResultado("papel.png",url,txtContadorYo,txtContadorMaquina));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /*********************************************************************************************/
    /**** @FXML protected void mostrarTijera()                                                ****/
    /*********************************************************************************************/
    //Este metodo permite mostrar la imagen tijera.png si se presiona ese boton

    @FXML
    protected void mostrarTijera()
    {
        try
        {
            Image imagen = new Image("tijera1.png");
            url = nuevo.generarImagen();
            Image imagenMaquina = new Image(url);
            imgYo.setImage(imagen);
            imgMaquina.setImage(imagenMaquina);

            lblResultado.setText(nuevo.generarResultado("tijera.png",url,txtContadorYo,txtContadorMaquina));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
