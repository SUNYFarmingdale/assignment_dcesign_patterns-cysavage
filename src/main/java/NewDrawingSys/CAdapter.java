/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

/**
 *Circle Adapter Class implements Shape interface
 * @author cyril
 */
public class CAdapter implements Shape {
    
//instance of circle object
    
private Circle circle;

//instance of CAdapter using circle object
public CAdapter(Circle circle){
    this.circle = circle;
    
}
//Overrides draw method from Shape
    public void draw(int x1, int y1, int x2, int y2) {
        int radius = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        circle.draw(x1, y1, radius);
    }
}

