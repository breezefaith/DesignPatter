package structing.adapter.framework;

public class TestAdapter {

	public static void main(String[] args) {
		ITarget target=new Adapter();
		target.request();
	}

}
