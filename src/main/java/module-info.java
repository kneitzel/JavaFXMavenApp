module FXAppModule {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.web;
    requires org.apache.logging.log4j;
//    requires org.apache.logging.log4j.core;

    exports de.kneitzel;
    opens de.kneitzel;
}
