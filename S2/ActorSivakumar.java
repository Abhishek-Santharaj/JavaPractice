public class ActorSivakumar implements Actor
{
static String  address = "Coimbatore";
public static void main(String[] args)
{

ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
System.out.println(as.address); //prints local address

//Actor ac = new Sivakumar(); // Can't initaite object in interface.

Actor ac = new ActorSivakumar();
System.out.println(ac.address); //prints interface address
}
public ActorSivakumar()
{
act();
dance();
sing();
speaking();
}
public ActorSivakumar(int age, String car)
{
act();
dance();
sing();
speaking();
}
public void act()
{
System.out.println("Acting");
}
public void dance()
{
System.out.println("Dancing");
}
public void sing()
{
System.out.println("Singing");
}
public void speaking()
{
System.out.println("Speaking");
}


}