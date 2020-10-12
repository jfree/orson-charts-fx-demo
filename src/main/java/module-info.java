/**
 * Demo programs that showcase JavaFX libraries from JFree.
 */
module org.jfree.chart3d.fx.demos {
    requires java.logging;
    requires java.desktop;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires org.jfree.chart3d;
    requires org.jfree.chart3d.fx;
    requires org.jfree.pdf;
    requires org.jfree.svg;
    exports org.jfree.chart3d.fx.demo;
}
