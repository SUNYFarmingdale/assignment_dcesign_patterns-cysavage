/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewDrawingSys;

/**
 *Driver File - Edited - cyril
 * @author MoaathAlrajab
 */
public class ModifiedSystem {
    public static void main(String[] args) {
        //Add created shapes to existing code 
        Shape[] shapes = {new RectAdapter(new NewDrawingSys.Rectangle()), new CAdapter(new NewDrawingSys.Circle())};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        
        
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
