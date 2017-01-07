package edu.peronade;

import edu.peronade.entity.Beer;
import edu.peronade.entity.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class BeerRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeerRegistryServiceApplication.class, args);
	}
}

@Component
class ExampleData implements CommandLineRunner
{
	private DrinkRepository drinkRepository;

	@Autowired
	public ExampleData(DrinkRepository drinkRepository) {
		this.drinkRepository = drinkRepository;
	}

	@Override
	public void run(String... strings) throws Exception {
		List<Beer> beers= new ArrayList<>();
		beers.add(new Beer("Lilith", "Russian Imperial Stout", "Golem", 10.0, 22.5, 80,330, 8 ));
		beers.add(new Beer("Piwonauta", "Russian Imperial Stout", "Haust", 10.0, 22.0, 80,500, 7 ));
		beers.add(new Beer("Lublin to Dublin", "Oatmeal Stout", "Pinta & Ohara's", 7.0, 15.0, 40, 500, 5 ));
		beers.add(new Beer("27,5 RIS", "Russian Imperial Stout", "Dr Brew", 12.0, 27.5,75, 500, 7 ));
		beers.add(new Beer("Punk IPA", "India Pale Ale", "BrewDog", 5.6, 22.5, 45,330, 8 ));

		beers.stream().forEach(beer -> drinkRepository.save( beer));
		System.out.println("dupa - XDDDDDDDDDDDDD");
		drinkRepository.findAllByOrderByScoreDesc().forEach(System.out::println);
	}
}
