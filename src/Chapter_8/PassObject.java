package Chapter_8;

import Chapter_6_Classes.Rectangle;

public class PassObject {
    public static void main(String[] args){

        //Create a Rectangle object
        Rectangle box = new Rectangle(12.0, 5.0);


        //Pass reference to the object to
        //the displayRectangle method
        displayRectangle(box);

    }

    /**
     * The displayRectangle method displays the
     * length and width of a rectangle.
     * @param r A reference to a Rectangle object.
     */

    public static void displayRectangle(Rectangle r){

        //Display the length and width
        System.out.println("Length : " + r.getLength() +
                " Width : " + r.getWidth());
    }
}
