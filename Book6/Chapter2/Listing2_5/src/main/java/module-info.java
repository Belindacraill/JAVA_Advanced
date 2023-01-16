module com.example.book6_chapter2_listing5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.book6_chapter2_listing5 to javafx.fxml;
    exports com.example.book6_chapter2_listing5;
}