// Steven Loughran
// #4 
// May 1, 2019

public class FourTelephone extends FourAppliance {
	
   private String brand;
   private boolean wirelessCharging;
   private boolean touchID;

   public FourTelephone(String brand, boolean wirelessCharging, boolean touchID, double voltage, String color, String madeIn,
           double price) {
       super(voltage, color, madeIn, price);
       this.brand = brand;
       this.wirelessCharging = wirelessCharging;
       this.touchID = touchID;
   }

   public String getBrand() {
       return brand;
   }

   public void setBrand(String brand) {
       this.brand = brand;
   }

   public boolean wirelessCharging() {
       return wirelessCharging;
   }

   public void setwirelessCharging(boolean wirelessCharging) {
       this.wirelessCharging = wirelessCharging;
   }

   public boolean touchID() {
       return touchID;
   }

   public void settouchID(boolean touchID) {
       this.touchID = touchID;
   }

   @Override
   public String toString() {
       return "Telephone [Brand = " + brand + ", Wireless Charging = " + wirelessCharging + ", Touch ID = " + touchID + ", Price = "
               + getPrice() + "]";
   }
  
  
}
