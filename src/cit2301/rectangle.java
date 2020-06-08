package cit2301;

public class rectangle {
    /**
     *UML
     * class: Rectangle
     * data:
     *      height:double
     *      width:double
     * constructors:
     *               rectangle()
     *               rectangle(width:double height:double)
     * methods:
     *          setHeight(height:double): void
     *          setWidth(width:double): void
     *          getHieght(): double
     *          getWidth(): double
     *          getArea(): double
     *          getPerimeter(): double
     * objects:
     *          rect object 1       rect object 2
     *          height:4            height:3.5
     *          width:40            width:5
     * @param args output the height,width,area and perimeter of the giving withs and heights
     */
    public static void main(String[] args) {
//objects
        rectangle rect1= new rectangle(4,40);
        rectangle rect2= new rectangle(3.5,5);
        //program info
        System.out.println("This program creates two rectangle objects and displays" +
                " their width, height, area and perimeter.");
        //object 1 output
        System.out.println("Rectangle 1:");
        System.out.printf("height = " +"%.2f%n",rect1.getHeight());
        System.out.printf("width = " +"%.2f%n",rect1.getWidth());
        System.out.printf("area = " +"%.2f%n",rect1.getArea());
        System.out.printf("perimeter = " +"%.2f%n%n",rect1.getPerimeter());
        //object 2 ouput
        System.out.println("Rectangle 2:");
        System.out.printf("height = " +"%.2f%n",rect2.getHeight());
        System.out.printf("width = " +"%.2f%n",rect2.getWidth());
        System.out.printf("area = " +"%.2f%n",rect2.getArea());
        System.out.printf("perimeter = " +"%.2f%n%n",rect2.getPerimeter());

        System.out.print("Goodbye");
    }
    //variable
         double width;
         double height;

         //constructors
    /**
     * default constructor
     */
        rectangle(){
            width=1;
            height=1;
        }

    /**
     *constructor for the objects
     * @param height giving by objects(rect1,rect2)
     * @param width giving by objects(rect1,rect2)
     */
        public rectangle(double height, double width){
            this.height= height;
            this.width= width;
        }

        //methods
    /**
     * calculate the area
     * @return the area
     */
    public double getArea () {
            return width * height;
        }

    /**
     *calculate the perimeter
     * @return Perimeter
     */
        public double getPerimeter () {
            return (width + height) * 2;
        }

    /**
     * retrieve width
     * @return width
     */
        public double getWidth () {
            return width;
        }

    /**
     * find width
     * @param width giving by objects(rect1,rect2)
     */
        public void setWidth ( double width){
            this.width = width;
        }

    /**
     *retrieve height
     * @return height
     */
        public double getHeight () {
            return height;
        }

    /**
     * find height
     * @param height giving by objects(rect1,rect2)
     */
        public void setHeight ( double height){
            this.height = height;

    }
}