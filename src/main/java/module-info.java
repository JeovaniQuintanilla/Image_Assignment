module com.mycompany.week7_fxml_gui_lab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.week7_fxml_gui_lab to javafx.fxml;
    exports com.mycompany.week7_fxml_gui_lab;
}
