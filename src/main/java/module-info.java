module com.gestor.juegopiedrapapeltijera {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    exports com.gestor.juegopiedrapapeltijera;
    opens com.gestor.juegopiedrapapeltijera to javafx.fxml;
    exports com.gestor.juegopiedrapapeltijera.clases;
    opens com.gestor.juegopiedrapapeltijera.clases to javafx.fxml;
}