/**
 * 
 */
package structing.adapter.framework;

/**
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements ITarget {

	/* (non-Javadoc)
	 * @see structing.adapter.framework.Target#request()
	 */
	@Override
	public void request() {
		super.specificRequest();
	}

}
