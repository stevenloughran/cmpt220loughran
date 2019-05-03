// Steven Loughran
// #4 
// May 1, 2019

public class FourTV extends FourAppliance {
   private String brand;
   private String type;
   private boolean isSmart;
   public FourTV(String brand, String type, boolean isSmart, double voltage, String color, String madeIn, double price) {
       super(voltage, color, madeIn, price);
       this.brand = brand;
       this.type = type;
       this.isSmart = isSmart;
   }
   public FourTV() {
       super(0, "None", "None", 0);
   }
   public String getBrand() {
       return brand;
   }
   public void setBrand(String brand) {
       this.brand = brand;
   }
   public String getType() {
       return type;
   }
   public void setType(String type) {
       this.type = type;
   }
   public boolean isSmart() {
       return isSmart;
   }
   public void setSmart(boolean isSmart) {
       this.isSmart = isSmart;
   }
   @Override
   public String toString() {
       return "TV [Brand =" + brand + ", Type =" + type + ", Smart TV =" + isSmart + ", Price =" + getPrice() + "]";
   }
  

}