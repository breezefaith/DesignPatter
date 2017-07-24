/**
 * 
 */
package structing.bridge.framework;

/**
 * @author breezefaith
 *
 */
public abstract class Abstraction {
	private Implementor implementor;
	public Abstraction(Implementor implementor) {
		this.implementor=implementor;
	}
	public void operation() {
		implementor.operation();
	}
}
