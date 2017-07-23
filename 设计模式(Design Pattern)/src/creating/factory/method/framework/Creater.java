package creating.factory.method.framework;

public interface Creater {
	/*
	 * 工厂方法：创建一个产品对象，其输入参数类型可以自行设置
	 */
	public <T extends Product> T factory(Class<T> c);
}
