package structing.adapter.example;

public class TestAdapter {

	public static void main(String[] args) {
		IEnglish english=new Translator();
		english.speakEnglish();
	}

}
