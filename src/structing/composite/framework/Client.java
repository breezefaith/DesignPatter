/**
 * 
 */
package structing.composite.framework;

/**
 * @author breezefaith
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Composite composite=new Composite();//组合体
		Leaf leaf1=new Leaf();
		Leaf leaf2=new Leaf();
		composite.add(leaf1);
		composite.add(leaf2);
		
		Composite branch=new Composite();//组合体中的组合体分支
		Leaf leaf3=new Leaf();
		branch.add(leaf3);
		
		//将branch添加至组合体中
		composite.add(branch);
		
		display(composite);
	}
	
	public static void display(Composite composite) {
		for(IComponent c:composite.getChild()) {
			if(c instanceof Leaf) {
				//是叶子节点
				System.out.println(c.getClass().getName());
				c.operation();
			}else {
				//是分支
				System.out.println(c.getClass().getName());
				c.operation();
				display((Composite)c);
			}
		}
	}
	
}
