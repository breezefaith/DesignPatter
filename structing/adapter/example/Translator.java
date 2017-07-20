/**
 * 
 */
package structing.adapter.example;

/**
 * @author Administrator
 *
 */
public class Translator extends Chinese implements IEnglish {

	/* (non-Javadoc)
	 * @see structing.adapter.example.IEnglish#speakEnglish()
	 */
	@Override
	public void speakEnglish() {
		super.speakChinese();
		System.out.println("翻译中...");
		System.out.println("hello world");
	}

}
