// Steven Loughran
// Lab 7 - Circle
// April 3, 2019

class Circle {
   double x;
   double y;
   double radius;

   Circle()		{
       x = 0;
       y = 0;
       radius = 1;
   }

   Circle(double x, double y, double radius)	{
       this.x = x;
       this.y = y;
       this.radius = radius;
   }

   double getX()	{
       return x;
   }

   double getY()	{
       return y;
   }

   double getRadius()	{
       return radius;
   }

   double getArea()	{
       return Math.PI * radius * radius;
   }

   double getPerimeter()	{
       return 2 * Math.PI * radius;
   }

   boolean contains(double x, double y)	{
       double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
       if (distance < radius)
           return true;
       else
           return false;
   }

   boolean contains(Circle circle)	{
       double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
       if (distance <= Math.abs(radius - circle.getRadius()))
               return true;
       else {
           return false;
   }
   }
   boolean overlaps(Circle circle) {
       double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
       if(distance <= radius + circle.getRadius())
           return true;
       else
           return false;
   }
}
