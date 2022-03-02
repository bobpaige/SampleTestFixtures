package sample;

import org.xml.sax.SAXException;

import mylib.SampleLib;

public class SampleApp {
	public Exception sax = new SAXException();
	public Exception foo = new SAXException();

	public static void main(String[] args) {
		System.out.println(SampleLib.value);
	}

}
