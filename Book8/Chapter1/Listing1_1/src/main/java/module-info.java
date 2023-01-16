module com.example.book8_chapter1_listing1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.book8_chapter1_listing1 to javafx.fxml;
    exports com.example.book8_chapter1_listing1;
}