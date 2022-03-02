package myapp;

import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;

import mylib.SampleLib;
import testbase.SampleBaseLib;
import testbase.SampleBaseTest;

public class ExtendedAppTest extends AppBaseTest {

	@Test
	public void appTest() {
		System.out.println("AppTest: " + SampleLib.value);
	}

	@Test
	public void appSampleLibNameTest() {
		System.out.println("AppSampleLibNameTest: " + new SampleBaseLib().getName());
	}

	@Test
	public void appBaseTest() {
		System.out.println("AppBaseTest: " + super.getBase());
	}

	@Test
	public void appFakeAddressTest() {
		Faker faker = new Faker();
		String streetName = faker.address().streetName();
		String number = faker.address().buildingNumber();
		String city = faker.address().city();
		String zip = faker.address().zipCode();
		String country = faker.address().country();

		System.out.println(String.format("AppFakeAddressTest\n%s %s\n%s, %s\n%s", number, streetName, city, zip, country));

	}
}
