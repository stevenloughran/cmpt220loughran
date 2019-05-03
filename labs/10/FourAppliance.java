// Steven Loughran
// #4 
// May 1, 2019

public class FourAppliance implements Comparable{
   private double voltage;
   private String color;
   private String madeIn;
   private double price;
   
   public FourAppliance(double voltage, String color, String madeIn, double price) {
       super();
       this.voltage = voltage;
       this.color = color;
       this.madeIn = madeIn;
       this.price = price;
   }
   
   public double getVoltage() {
       return voltage;
   }
   public void setVoltage(double voltage) {
       this.voltage = voltage;
   }
   public String getColor() {
       return color;
   }
   public void setColor(String color) {
       this.color = color;
   }
   public String getMadeIn() {
       return madeIn;
   }
   public void setMadeIn(String madeIn) {
       this.madeIn = madeIn;
   }
   public double getPrice() {
       return price;
   }
   public void setPrice(double price) {
       this.price = price;
   }
   @Override
   public int compareTo(Object arg0) {
       if(arg0 !=null) {
           if(arg0 instanceof FourAppliance) {
               FourAppliance app = (FourAppliance)arg0;
           if(this.price > app.price) {
        	   	return 1;
         } else if (this.price < app.price){
        	 	return -1;
         } else {
        	 	return 0;
               }              
          } else {
               	return 0;
           }

       }
       return 0;
   }
   @Override
   public String toString() {
       return "Appliance [Voltage = " + voltage + ", color = " + color + ", Made in = " + madeIn + ", Price = " + price + "]";
   }
  
  
}
