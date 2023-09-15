module com.example.bank_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires com.dlsc.formsfx;

    opens com.example.bank_application to javafx.fxml;
    exports com.example.bank_application;
    exports com.example.bank_application.Controllers;
    exports com.example.bank_application.Controllers.Admin;
    exports com.example.bank_application.Controllers.Client;
    exports com.example.bank_application.Models;
    exports com.example.bank_application.Views;

}