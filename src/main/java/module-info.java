module com.example.bank_application {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.bank_application to javafx.fxml;
    exports com.example.bank_application;
}