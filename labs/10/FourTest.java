// Steven Loughran
// #4 
// May 1, 2019

import java.util.Arrays;

public class FourTest {

   public static void main(String[] args) {
       FourAppliance appliances[] = new FourAppliance[41];

       appliances[0] = new FourTV("Samsung", "Curved", true, 300, "Black", "Korea", 3500);
       appliances[1] = new FourTV("LG", "Flat", false, 250, "Black", "Korea", 800);
       appliances[2] = new FourTV("Samsung", "OLED", true, 200, "Black", "Korea", 600);
       appliances[3] = new FourTV("Samsung", "LCD", false, 150, "Black", "Korea", 320);
       appliances[4] = new FourTV("Panasonic", "OLED", true, 275, "Black", "Korea", 999);
       appliances[5] = new FourTV("Insignia", "Flat", false, 150, "Black", "Korea", 200);
       appliances[6] = new FourTV("Sceptre", "OLED", true, 200, "Black", "Korea", 500);
       appliances[7] = new FourTV("Panasonic", "Curved", true, 275, "Black", "Korea", 700);
       appliances[8] = new FourTV("Sceptre", "Curved", false, 300, "Black", "Korea", 1000);
       appliances[9] = new FourTV("LG", "Curved", true, 300, "Black", "Korea", 2500);
       
       appliances[10] = new FourTelephone("IPhone", false, false, 3.7, "Black", "China", 800);
       appliances[11] = new FourTelephone("IPhone 3GS", false, false, 3.7, "Black", "China", 550);
       appliances[12] = new FourTelephone("IPhone 4", false, false, 3.7, "Black", "China", 625);
       appliances[13] = new FourTelephone("IPhone 4s", false, false, 3.7, "White", "China", 625);
       appliances[14] = new FourTelephone("IPhone 5", false, false, 3.7, "Space Grey", "China", 650);
       appliances[15] = new FourTelephone("IPhone 5s", false, true, 3.7, "Space Grey", "Korea", 695);
       appliances[16] = new FourTelephone("IPhone 6", false, true, 3.7, "White", "China", 600);
       appliances[17] = new FourTelephone("IPhone 6s", false, true, 3.7, "Rose Gold", "China", 750);
       appliances[18] = new FourTelephone("IPhone 7 Plus", false, true, 3.7, "Matte Black", "China", 800);
       appliances[19] = new FourTelephone("IPhone 8", true, true, 3.7, "Space Grey", "China", 1100);
       appliances[20] = new FourTelephone("IPhone 8 Plus", true, true, 3.7, "White", "China", 900);
       appliances[21] = new FourTelephone("IPhone X", true, false, 3.7, "Black", "China", 800);
       appliances[22] = new FourTelephone("IPhone XS", true, false, 3.7, "Rose Gold", "China", 999);
       appliances[23] = new FourTelephone("IPhone XR", true, false, 3.7, "Red", "China", 1100);
       appliances[24] = new FourTelephone("IPhone XS Max", true, false, 3.7, "White", "China", 1200);
       appliances[25] = new FourTelephone("Samsung 10e", true, false, 4.34, "Black", "Vietnam", 1220);
       appliances[26] = new FourTelephone("Samsung Galaxy 3", false, false, 4.34, "Blue", "Vietnam", 720);
       appliances[27] = new FourTelephone("Samsung Galaxy 4", false, false, 4.34, "Blue", "Vietnam", 999);
       appliances[28] = new FourTelephone("Samsung Galaxy Note", false, true, 4.34, "Black", "Vietnam", 400);
       appliances[29] = new FourTelephone("Samsung Galaxy 8", true, true, 4.34, "White", "Vietnam", 900);
       
       appliances[30] = new FourToaster("Kitchen Aid", "A5", true,  220, "Black", "Korea", 200);
       appliances[31] = new FourToaster("Kenmore", "X1", false, 220, "Red", "China", 20);
       appliances[32] = new FourToaster("Kenmore", "X2", false, 220, "Grey", "China", 75);
       appliances[33] = new FourToaster("Kitchen Smith", "T45", false, 220, "Black", "Korea", 65);
       appliances[34] = new FourToaster("Kenmore", "X", false, 220, "Red", "China", 45);
       appliances[35] = new FourToaster("Kitchen Smith", "W550", true, 220, "Green", "Korea", 95);
       appliances[36] = new FourToaster("Kitchen Aid", "A3", true, 220, "Gold", "Korea", 150);
       appliances[37] = new FourToaster("Kenmore", "Carbon", true, 220, "Matte Black", "China", 115);
       appliances[38] = new FourToaster("Kitchen Smith", "W550s", true, 220, "Silver", "Korea", 80);
       appliances[39] = new FourToaster("Kitchen Aid", "A2", false, 220, "Black", "Korea", 25);

       Arrays.sort(appliances);
       for(FourAppliance app:appliances) {
           System.out.println(app);
       }

   }

}
