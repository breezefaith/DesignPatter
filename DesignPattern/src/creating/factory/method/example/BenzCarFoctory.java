/**
 * 
 */
package creating.factory.method.example;

/**
 * @author breezefaith
 *
 */
public class BenzCarFoctory implements CarFactory {

	/* （非 Javadoc）
	 * @see factory.method.example.CarFactory#createCar()
	 */
	@Override
	public Benz createCar() {
		// TODO 自动生成的方法存根
		return new Benz();
	}

}
