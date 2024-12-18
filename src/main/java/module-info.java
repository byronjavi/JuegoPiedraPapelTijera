module com.gestor.juegopiedrapapeltijera {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.gestor.juegopiedrapapeltijera to javafx.fxml;
    exports com.gestor.juegopiedrapapeltijera;
}