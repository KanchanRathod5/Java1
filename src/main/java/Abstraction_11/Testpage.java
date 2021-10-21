package Abstraction_11;

public class Testpage 
{  
	public static void main(String[] args) 
	{
		System.out.println("..................");
		Loginpage lp = new Loginpage();
		lp.title();//Overridden method from abstract class
		lp.url();
		lp.footerLinks();
		lp.doLogin();
		lp.logo();
		lp.privacyPolicy();
		System.out.println(".........");
		page1 p = new Loginpage();
		p.title();
		p.logo();
		p.privacyPolicy();
		System.out.println("........");
	}

}
