package one.digitalinnovation.singleton;

/* Singleton "Lazy Holder" 
 * 
 * https://stackoverflow.com/a/24018148
 * 
 * */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	public SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
