class PersonInfo {

	fun getPerson() : Person {
		var person = Person();
		person.name = "Suresh Kumar Devaraj"
				person.mobile = "9874563210"
				person.email = "suresh@gmail.com"
				return person;
	}
}


fun main(args : Array<String>){
	var personInfo = PersonInfo();
	var person = personInfo.getPerson();
	println(person.name)
	println(person.mobile)
	println(person.email)
}