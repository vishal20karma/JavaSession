package overrding;

public class child extends parent{

@Override   //This "@Override" keyword is not required, when same method is in both parent/child class, then it will execute what is there in child method
public void car() {   //Here parent class method has been overridden by child class method
System.out.println("KIA Sonet color is Grey");
}
public void cycle() {
System.out.println("I have Ranger Cycle");	
}
	
public static void main(String [] args)   {
child c = new child();
c.car();
c.bike();
c.cycle();
}

}
