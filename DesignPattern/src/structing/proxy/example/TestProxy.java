package structing.proxy.example;

public class TestProxy {

	public static void main(String[] args) {
		IBuyer buyer1=new BuyerImpl();
		IBuyer buyer2=new BuyerImpl();
		ProxyBuyer proxy=new ProxyBuyer(buyer1);
		proxy.autoBuying();
		
		proxy=new ProxyBuyer(buyer2);
		proxy.autoBuying();
	}

}
