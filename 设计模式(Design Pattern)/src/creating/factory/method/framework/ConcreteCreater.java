/**
 * 
 */
package creating.factory.method.framework;

/**
 * @author breezefaith
 *
 */
public class ConcreteCreater implements Creater {

	/* （非 Javadoc）
	 * @see factory.method.framework.Creater#factory(java.lang.Class)
	 */
	@Override
	public <T extends Product> T factory(Class<T> c) {
		Product product=null;
		try{
			product=(Product)Class.forName(c.getName()).newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		return (T)product;
	}

}
