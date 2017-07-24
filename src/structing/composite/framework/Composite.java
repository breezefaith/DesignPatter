/**
 * 
 */
package structing.composite.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author breezefaith
 *
 */
public class Composite implements IComponent {
	
	private List<IComponent> compoments=new ArrayList<>();
	
	/*
	 * 添加构件
	 */
	public void add(IComponent c) {
		compoments.add(c);
	}
	/*
	 * 删除构件
	 */
	public void remove(IComponent c) {
		compoments.remove(c);
	}
	/*
	 * 获取子结构
	 */
	public List<IComponent> getChild() {
		return compoments;
	}
	/* (non-Javadoc)
	 * @see structing.composite.framework.Component#operation()
	 */
	@Override
	public void operation() {
		//do something...

	}

}
