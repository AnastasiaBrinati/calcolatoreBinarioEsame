module com.example.calcolatorebinario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calcolatorebinario to javafx.fxml;
    exports com.example.calcolatorebinario;
}