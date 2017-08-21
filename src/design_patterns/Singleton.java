package design_patterns;

public class Singleton {
	
	private static Singleton instance = null;
	private Singleton() { }
	   static public Singleton instance() {
	    if (instance == null) {
	      instance = new Singleton();
	    }
	    return instance;
	  }
	  public void finalize() {
	    instance = null;
	  }
	  
	  Singleton one = Singleton.instance();
	  
//	  Singleton two = Singleton.instance();
	  

}
