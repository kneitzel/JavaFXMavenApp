module FXAppModule {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.web;

    exports de.kneitzel;
    opens de.kneitzel;
}
