package india.newDelhi;
import tamilnadu.chennai.TrafficRules;
public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules
{
public static void main(String[] args)
{
CommonManInDelhi Dman = new CommonManInDelhi();
Dman.dontGoByDieselVehicle();
Dman.dontgoByBicycle();
Dman.goByDieselVehicle();
Dman.goByBicycle();

}
public void dontGoByDieselVehicle()
{
System.out.println("Dont use Diesel Vehicle");
}
public void dontgoByBicycle()
{
System.out.println("don't use bicycle");
}
public void goByDieselVehicle()
{
System.out.println("use diesel vehicle in chennai");
}
public void goByBicycle()
{
System.out.println(" use bicycle in chennai");
}

}
//javac -d . CommonManInDelhi.java for compile
//java india.newDelhi.CommonManInDelhi for run

