module com.example.book6_chapter5_listing1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.book6_chapter5_listing1 to javafx.fxml;
    exports com.example.book6_chapter5_listing1;
}