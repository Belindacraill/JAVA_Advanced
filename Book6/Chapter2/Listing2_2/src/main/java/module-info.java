module com.example.book6_chapter2_listing2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.book6_chapter2_listing2 to javafx.fxml;
    exports com.example.book6_chapter2_listing2;
}