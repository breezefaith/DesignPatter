/**
 * 
 */
package structing.decorator.framework;

/**
 * @author breezefaith
 *
 */
public class ConcreteDecorator extends AbstractDecorator {

	public ConcreteDecorator(Compoment compoment) {
		super(compoment);
	}
	private void method() {
		System.out.println("装饰其他功能...");
	}
	@Override
	public void operation() {
		this.method();
		super.operation();
	}
}
