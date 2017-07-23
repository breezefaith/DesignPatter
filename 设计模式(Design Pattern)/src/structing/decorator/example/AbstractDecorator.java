/**
 * 
 */
package structing.decorator.example;

/**
 * @author breezefaith
 *
 */
public abstract class AbstractDecorator implements ICar {
	private ICar car=null;
	/* (non-Javadoc)
	 * @see structing.decorator.example.ICar#show()
	 */
	public AbstractDecorator(ICar car) {
		this.car=car;
	}
	@Override
	public void show() {
		car.show();
	}

}
