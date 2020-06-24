package cit2301;

/**
 * UML
 * variables:
 *          color: String
 *          filled: boolean
 *          dateCreated: java.util.Date
 * constructors:
 *          GeometricObject()
 *          GeometricObject(color: String,filled: boolean)
 * setup methods:
 *          getColor(): String
 *          setColor(color: String): void
 *          isFilled(): boolean
 *          setFilled(filled: boolean): void
 *          getDateCreated(): java.util.Date
 *          toString(): String
 */
public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;


    //default geometric object
    public GeometricObject(){
        dateCreated= new java.util.Date();
    }
    //parameterized geometric object
    public GeometricObject(String color, boolean filled){
        dateCreated= new java.util.Date();
        this.color= color;
        this.filled= filled;
    }

    public double getArea(){
        return 0;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled= filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated +"\ncolor: " + getColor() +" and filled: " + isFilled();
    }
}
