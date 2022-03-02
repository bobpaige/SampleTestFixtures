package myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Locale;

import org.apache.commons.lang3.exception.ContextedException;
import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;

import mylib.SampleLib;
import testbase.SampleBaseLib;

public class AppBaseTest {
	public static String base = "testbase";

	public String getBase() {
		return base;
	}

	@Test
	public void baseLibNameTest() {
		System.out.println("SampleBaseLibNameTest: " + new SampleBaseLib().getName());
	}

	@Test
	public void baseLibTest() {
		System.out.println("SampleLibTest: " + SampleLib.value);
	}

	/**
	 * Test that should throw an exception.
	 * 
	 * In junit 4 we use this approach:
	 * 
	 * @Test(expected = NullPointerException.class)
	 * 
	 * @throws ContextedException
	 */
	@Test
	public void baseExceptionTest() throws ContextedException {
		System.out.println("SampleExceptionTest");
		Exception exception = assertThrows(ContextedException.class, () -> {
			throw new ContextedException("contexted");
		});

		assertEquals("contexted", exception.getMessage());
	}

	@Test
	public void baseFakeAddressTest() {
		Faker faker = new Faker(Locale.US);
		String streetName = faker.address().streetName();
		String number = faker.address().buildingNumber();
		String city = faker.address().city();
		String zip = faker.address().zipCode();
		String country = faker.address().country();

		System.out.println(String.format("BaseFakeAddressTest:\n%s %s\n%s,%s\n%s", number, streetName, city, zip, country));

	}
}
