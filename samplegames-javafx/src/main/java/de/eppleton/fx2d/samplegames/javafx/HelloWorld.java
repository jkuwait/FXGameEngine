/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.eppleton.fx2d.samplegames.javafx;

import de.eppleton.fx2d.Layer;
import de.eppleton.fx2d.Level;
import de.eppleton.fx2d.javafx.app.JavaFXGame;
import static javafx.application.Application.launch;
import net.java.html.canvas.GraphicsContext2D;
import net.java.html.canvas.Style;

/**
 *
 * @author antonepple
 */
public class HelloWorld extends JavaFXGame {

    @Override
    protected Level getLevel(GraphicsContext2D context) {
        Level level = new Level(context, 800,600,800,600);
        level.addLayer(new Layer() {

            @Override
            public void draw(GraphicsContext2D graphicsContext, double x, double y, double width, double height) {
                graphicsContext.setFillStyle(new Style.Color("#ff0000"));
                graphicsContext.fillText("Hello World!", 100,100);
            }
        });
        return level;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
