package page.utilites;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class GeneratorFakeData {

	//Generator fake data and with output txt file 
	
	public static void main(String[] args) throws IOException {
		// new fake object
		Faker faker1 = new Faker(new Random());
		//fakename
		faker1.name().firstName();
		//fake fullname
		faker1.name().fullName();
	

		// from here array of strings
		ArrayList<String> aL = new ArrayList<String>();
		String data = "";
		// add strings
		for (int i = 0; i < 5; i++) {

			aL.add("firstName`" + i + faker1.name().firstName());
			data = "firstName`" + i + faker1.name().firstName();
			System.out.println(data);
			aL.add("fullName`" + faker1.name().fullName());
			aL.add("HurryPoter`" + faker1.harryPotter().character());

		}
		System.out.println(aL);

		// write txt

		FileWriter writer = new FileWriter("output.txt");
		for (String str : aL) {
			writer.write(str + System.lineSeparator());
		}
		writer.close();

		FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-GB"), new RandomService());

		String email = fakeValuesService.bothify("????##@gmail.com");
		Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);

		System.out.println(faker1.name().firstName());
		System.out.println(faker1.commerce().material());
		System.out.println(faker1.commerce().productName());
		System.out.println(email);

	}
}
