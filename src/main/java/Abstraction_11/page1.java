package Abstraction_11;

public abstract class page1
{///abstract class is not final
     public page1() {
    	 System.out.println("fghj");
     }

public abstract void title();//abstract method
public abstract void url();
public abstract void footerLinks();
public void logo() ////non abstract method
{
	System.out.println("page.....logo");
}
public final void privacyPolicy() //non abstract final method
{
	System.out.println("privacy");
}

}