/**
 * 
 */
package creating.propertype.example;

/**
 * @author breezefaith
 *
 */
public class Mail implements Cloneable {
	private String receiver;
	private String sender;
	private String title;
	private String body;
	private String footer;
	
	public Mail clone() {
		Mail mail=null;
		try {
			mail=(Mail) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mail;
	}
	
	public Mail(String title, String body, String footer) {
		super();
		this.title = title;
		this.body = body;
		this.footer = footer;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	@Override
	public String toString() {
		return "Mail [receiver=" + receiver + ", sender=" + sender + ", title=" + title + ", body=" + body + ", footer="
				+ footer + "]";
	}
}
