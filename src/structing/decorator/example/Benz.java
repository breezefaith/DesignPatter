/**
 * 
 */
package structing.decorator.example;

/**
 * @author breezefaith
 *
 */
public class Benz implements ICar {

	/* (non-Javadoc)
	 * @see structing.decorator.example.ICar#show()
	 */
	@Override
	public void show() {
		System.out.println("this is a benz without other compoments");
	}

}
