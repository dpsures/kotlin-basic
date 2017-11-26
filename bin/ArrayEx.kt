class ArrayEx {
	
	fun addPerson() : Array<Person>{
			
		var person = Person();
		person.name = "Suresh Kumar Devaraj"
		person.mobile = "1230456987"
		person.email = "suresh@gmail.com"
		
		var person1 = Person();
		person.name = "Lokesh"
		person.mobile = "1478523690"
		person.email = "logesh@gmail.com"
		
		var personArray = arrayOf(person,person1);
		
		return personArray
	}
}