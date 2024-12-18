package com.gestor.juegopiedrapapeltijera;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblResultado;

    @FXML
    protected void Prueba()
    {
        lblResultado.setText("Esto es una prueba");
    }
}