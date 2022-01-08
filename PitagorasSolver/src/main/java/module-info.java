module my.math.pitagorassolver {
    requires javafx.controls;
    requires javafx.fxml;


    opens my.math.pitagorassolver to javafx.fxml;
    exports my.math.pitagorassolver;
}