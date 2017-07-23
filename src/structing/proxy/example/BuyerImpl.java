/**
 * 
 */
package structing.proxy.example;

/**
 * @author breezefaith
 *
 */
public class BuyerImpl implements IBuyer {

	/* (non-Javadoc)
	 * @see structing.proxy.example.IBuyer#login()
	 */
	@Override
	public void login() {
		System.out.println(this.toString()+" logined successfully.");
	}

	/* (non-Javadoc)
	 * @see structing.proxy.example.IBuyer#inputTripInfo(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void inputTripInfo() {
		System.out.println(toString()+" is entering trip information.");
	}

	/* (non-Javadoc)
	 * @see structing.proxy.example.IBuyer#buy()
	 */
	@Override
	public void buy() {
		System.out.println(toString()+" is paying money.");
	}
}
