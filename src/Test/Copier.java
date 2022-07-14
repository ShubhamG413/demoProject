package Test;

public interface Copier {
	public default void print(String msg) {
		System.out.println("Message from Copier: "+msg);
	}
}
