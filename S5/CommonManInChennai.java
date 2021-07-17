package tamilnadu.chennai;
public class CommonManInChennai implements TrafficRules
{
public static void main(String[] args)
{
CommonManInChennai man = new CommonManInChennai();
man.goByDieselVehicle();
man.goByBicycle();

}
public void goByDieselVehicle()
{
System.out.println("Diesel Vehicle in Chennai");
}
public void goByBicycle()
{
System.out.println("Cycle in Chennai");
}


}