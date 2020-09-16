import java.util.Scanner;

public class TextShapes{

  public static void main(String[] args){
    test();
    drawPrompt();
  }

  private static void drawPrompt(){

    Scanner sc = new Scanner(System.in);

    System.out.print("What shape should I draw? ");
    String input = sc.nextLine();

    System.out.print(input);
  }

  private static void test(){
    System.out.println("Testing TextShape class...\n");
    Triangle triangle = new Triangle(4,8);
    Rectangle rectangle = new Rectangle(11,15);
    Square square = new Square(5);

    triangle.draw(5, "TEST");
    rectangle.draw(5, "TEST");
    square.draw(5, "TEST");

    System.out.println("Testing interface...");
    TextShape textshape = rectangle;
    textshape.draw(7, "TEST");
  }
}

interface TextShape{
  public void draw(int row, String text);
}

class Triangle implements TextShape{
  private int width = 0;
  private int height = 0;
  public Triangle(int initWidth, int initHeight){
    this.width = initWidth;
    this.height = initHeight;
  }

  public void draw(int row,String text){
    System.out.println(this);
    System.out.println("Printing a triangle is not implemented yet");

    System.out.println();
  }

  @Override
  public String toString(){
    return this.getClass().getName() + " -  Width: " + this.getWidth() + " Height: " + this.getHeight();
  }

  public int getWidth(){
    return this.width;
  }

  public int getHeight(){
    return this.height;
  }
}

class Rectangle implements TextShape{
  private int width = 0;
  private int height = 0;
  public Rectangle(int initWidth, int initHeight){
    this.width = initWidth;
    this.height = initHeight;
  }

  public void draw(int row,String text){
    System.out.println(this);

    textMiddle = text.Length()/2
    shapeMiddle = this.getSize()/2

    for(int h = 0; h < this.height; h++){
      for( int w = 0; w < this.width; w++){

        if (h == row){

        }
        else{
          System.out.print("*");
        }
      }
      System.out.println();
    }
    System.out.println();
  }

  @Override
  public String toString(){
    return this.getClass().getName() + " -  Width: " + this.getWidth() + " Height: " + this.getHeight();
  }

  public int getWidth(){
    return this.width;
  }

  public int getHeight(){
    return this.height;
  }
}

class Square extends Rectangle{
  public Square(int initWidth){
    super(initWidth,initWidth);
  }

  @Override
  public void draw(int row,String text){
    System.out.println(this);
    System.out.println("Printing a square is not implemented yet");

    System.out.println();
  }

  @Override
  public String toString(){
    return this.getClass().getName() + " -  Width: " + super.getWidth() + " Height: " + super.getHeight();
  }
}
