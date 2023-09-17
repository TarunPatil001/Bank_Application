package com.example.bank_application;

import com.example.bank_application.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
