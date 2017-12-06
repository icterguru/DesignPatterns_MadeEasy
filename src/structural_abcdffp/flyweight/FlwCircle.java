package structural_abcdffp.flyweight;

public class FlwCircle implements IFlwShape{
	private String color;
	   private int x;
	   private int y;
	   private int radius;

	   public FlwCircle(String color){
	      this.color = color;
	   }

	   public void setX(int x) {
	      this.x = x;
	   }

	   public void setY(int y) {
	      this.y = y;
	   }

	   public void setRadius(int radius) {
	      this.radius = radius;
	   }

	   @Override
	   public void draw() {
	      System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	   }
}
