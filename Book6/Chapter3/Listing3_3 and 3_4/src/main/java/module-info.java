module com.example.book6_chapter3_listing3and4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.book6_chapter3_listing3and4 to javafx.fxml;
    exports com.example.book6_chapter3_listing3and4;
}