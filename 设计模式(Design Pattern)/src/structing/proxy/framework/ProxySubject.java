/**
 * 
 */
package structing.proxy.framework;

/**
 * @author breezefaith
 *
 */
public class ProxySubject implements Subject {
	
	private Subject subject;
	
	public ProxySubject(Subject subject) {
		this.subject=subject;
	}
	
	private void beforeRequest() {
		
	}
	/* (non-Javadoc)
	 * @see structing.proxy.framework.Subject#request()
	 */
	@Override
	public void request() {
		beforeRequest();
		subject.request();
		afterRequest();
	}
	private void afterRequest() {
		
	}

}
