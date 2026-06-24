package dev.kaldiroglu.fpj.ch06.source;

import dev.kaldiroglu.fpj.ch06.domain.Person;
import dev.kaldiroglu.fpj.ch06.domain.PersonFactory;

import java.util.function.Supplier;


public class MyPersonSupplier implements Supplier<Person> {

	static int count;
	
	@Override
	public Person get() {
		count++;
		System.out.println("in get() of MyPersonSupplier");
		return PersonFactory.createPerson();
	}

}
