package creating.propertype.example;

public class SendMailDemo {
	public static void main(String[] args) {
		/*
		 * 创建一个原型
		 */
		Mail mail=new Mail("会议通知", "请于xxxx年xx月xx日到xx地点开会。", "xx公司xx部门xx小组");
		long time1=System.currentTimeMillis();
		for(int i=0;i<20000;i++) {
			Mail cloneMail=mail.clone();
			cloneMail.setReceiver("receiver "+i);
			cloneMail.setSender("sender");
			//sendMail(i);
		}
		long time2=System.currentTimeMillis();
		System.out.println("Propertype Model cost time:"+(time2-time1));
		
		time1=System.currentTimeMillis();
		for(int i=0;i<20000;i++) {
			Mail normalMail=new Mail("会议通知", "请于xxxx年xx月xx日到xx地点开会。", "xx公司xx部门xx小组");
			normalMail.setReceiver("receiver "+i);
			normalMail.setSender("sender");
			//sendMail(i);
		}
		time2=System.currentTimeMillis();
		System.out.println("Normal Model cost time:"+(time2-time1));
	}
	private static void sendMail(int i) {
		System.out.println("send no."+i+"mail successfully.");
	}
}
