/**
 * 
 */
package structing.decorator.framework;

/**
 * @author breezefaith
 *
 */
public abstract class AbstractDecorator implements Compoment{
	private Compoment compoment;
	public AbstractDecorator(Compoment compoment) {
		this.compoment=compoment;
	}
	@Override
	public void operation() {
		compoment.operation();
	}
}
