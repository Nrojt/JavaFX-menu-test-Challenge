module com.example.scenecontrollers {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires MaterialFX;
    requires com.fazecast.jSerialComm;
    requires usbdrivedetector;
    requires org.apache.commons.io;
    requires java.sql;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires com.google.gson;
    requires com.maxmind.geoip2;
    requires javafx.web;
    opens aguabit.scenecontrollers to javafx.fxml;
    exports aguabit.scenecontrollers;
    exports location;
    opens location to javafx.fxml;
}