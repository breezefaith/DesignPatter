/**
 * 
 */
package structing.bridge.framework;

/**
 * @author breezefaith
 *
 */
public class RefineAbstraction extends Abstraction {

	/**
	 * @param implementor
	 */
	public RefineAbstraction(Implementor implementor) {
		super(implementor);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 修正父类方法
	 * (non-Javadoc)
	 * @see structing.bridge.framework.Abstraction#operation()
	 */
	public void operation() {
		super.operation();
	}
}
