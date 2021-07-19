package SeleniumBasics;

public class Outer 
{ 
    public void someOuterMethod() 
    {
	        //Line 5 
    } 
    public  class Inner {
    	static final int x = 5;
    } 
    int y=10;
    
    
    
    public static void main(String[] argv) 
    {
        Outer ot = new Outer(); 
        //Outer.Inner obj = ot.new Inner();
        System.out.println(Inner.x);
        int z = 0;
        System.out.println(z);
    } 
} 
