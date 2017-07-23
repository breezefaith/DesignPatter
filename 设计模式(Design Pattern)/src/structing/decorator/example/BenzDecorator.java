/**
 * 
 */
package structing.decorator.example;

/**
 * @author breezefaith
 *
 */
public class BenzDecorator extends AbstractDecorator {

	/**
	 * @param car
	 */
	public BenzDecorator(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	private void setGrapher() {
		System.out.println("set grapher...");
	}
	private void setGPS() {
		System.out.println("set GPS...");
	}
	@Override
	public void show() {
		super.show();
		setGrapher();
		setGPS();
	}
}
