public class TurtleGraphics{
  public static void main(String[] args)
  {
      World world = new World(300,300);
      Turtle yertle = new Turtle(world);

      yertle.forward();
      yertle.turnLeft();
      yertle.forward();

      world.show(true);
  }
}