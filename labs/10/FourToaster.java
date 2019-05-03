// Steven Loughran
// #4 
// May 1, 2019

public class FourToaster extends FourAppliance {
   private String brand;
   private String model;
   private boolean burnProof;

   public FourToaster(String brand, String model, boolean burnProof, double voltage, String color, String madeIn,
           double price) {
       super(voltage, color, madeIn, price);
       this.brand = brand;
       this.model = model;
       this.burnProof = burnProof;
   }

   public FourToaster() {
       super(0, "None", "None", 0);
   }
   
   public String getBrand() {
       return brand;
   }

   public void setBrand(String brand) {
       this.brand = brand;
   }

   public String getModel() {
       return model;
   }

   public void setModel(String model) {
       this.model = model;
   }

   public boolean burnProof() {
       return burnProof;
   }

   public void setburnProof(boolean burnProof) {
       this.burnProof = burnProof;
   }

   @Override
   public String toString() {
       return "Toaster [Brand=" + brand + ", Model=" + model + ", Burn Proof =" + burnProof + ", Price ="
               + getPrice() + "]";
   }
  
  
}