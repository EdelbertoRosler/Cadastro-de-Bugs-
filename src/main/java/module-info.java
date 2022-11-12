module aplication.cadastrobugs {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
//    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens aplication.cadastrobugs to javafx.fxml;
    exports aplication.cadastrobugs;
}