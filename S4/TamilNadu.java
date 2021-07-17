public class TamilNadu extends SouthIndia
{

static String capital = "Chennai";

public static void main(String[] args)
{
SouthIndia si = new TamilNadu();
System.out.println(India.capital);
System.out.println(TamilNadu.capital);

}
public  void speakLanguage()
{
System.out.println("Speak your language");
}

public  void eat()
{
System.out.println("Eat your food");
}

public  void dress()
{
System.out.println("Dress up");
}
public void cultivate()
{
System.out.println("Rice and Sugar cane cultivation");
}

public void livingStyle()
{
System.out.println("Above Average development");
}

}
// Observe which methods and variables can be accessed using ‘si’ and note down.