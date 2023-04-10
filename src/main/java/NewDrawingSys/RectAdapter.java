/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

/**
 * Class implements Shape interface to create Rectangles
 * @author cyril
 */
public class RectAdapter implements Shape {
    
//Instance of Rectangle object
private Rectangle rectangle;



//Instance of RectAdapter class using Rectangle object rectangle
public RectAdapter(Rectangle rectangle){
    this.rectangle = rectangle;
}



//Overides draw method
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        rectangle.draw(x1, y1, x2, y2);
    }
}
  
