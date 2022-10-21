module FXAppModule {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.web;
    requires org.slf4j;

    exports de.kneitzel;
    opens de.kneitzel;
}
