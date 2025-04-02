module org.medicamentos.sysmedicamentos {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.medicamentos.sysmedicamentos to javafx.fxml;
    opens org.medicamentos.sysmedicamentos.controller to javafx.fxml;
    exports org.medicamentos.sysmedicamentos.controller to javafx.fxml;
    exports org.medicamentos.sysmedicamentos;

}