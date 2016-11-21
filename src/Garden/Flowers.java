package Garden;

import java.util.ArrayList;

/**
 * Created by Rita on 2016.11.21..
 */
public class Flowers extends Garden {
//    ArrayList<String> color = new ArrayList<String>();
//    color.add("yellow");
//    color.add("blue")
//    public ArrayList<String> getColor() {
//        return color;
//    }
//    public Flowers(){
//        System.out.printf("The %s Flower needs water\n", getColor());
//    }

    String color1 = "yellow";
    String color2 = "blue";

    public Flowers() {
        System.out.printf("The %s Flower needs water\n", color1);
        System.out.printf("The %s Flower needs water\n", color2);
    }

    public void water(int liter) {


    }
}
