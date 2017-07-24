/**
 * 
 */
package structing.bridge.framework;

/**
 * @author breezefaith
 *
 */
public class ConcreteImplementor implements Implementor {

	/* (non-Javadoc)
	 * @see structing.bridge.framework.Implementor#operation()
	 */
	@Override
	public void operation() {
		//do something
		System.out.println(this.getClass().getSimpleName());
	}

}
