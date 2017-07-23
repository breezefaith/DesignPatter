/**
 * 
 */
package structing.proxy.example;

/**
 * @author breezefaith
 *
 */
public class ProxyBuyer implements IBuyer {

	IBuyer buyer=new BuyerImpl();
	
	public ProxyBuyer(IBuyer buyer) {
		this.buyer=buyer;
	}
	
	/* (non-Javadoc)
	 * @see structing.proxy.example.IBuyer#login()
	 */
	@Override
	public void login() {
		buyer.login();
	}

	/* (non-Javadoc)
	 * @see structing.proxy.example.IBuyer#inputTripInfo()
	 */
	@Override
	public void inputTripInfo() {
		buyer.inputTripInfo();
	}

	/* (non-Javadoc)
	 * @see structing.proxy.example.IBuyer#buy()
	 */
	@Override
	public void buy() {
		buyer.buy();
	}
	
	public void autoBuying() {
		for(int i=0;i<5;i++) {
			System.out.println("Buying no."+(i+1)+" item...");
			login();
			inputTripInfo();
			buy();
		}
	}
}
