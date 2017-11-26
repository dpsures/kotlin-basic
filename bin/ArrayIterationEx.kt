fun main(args: Array<String>) {
	var arrayObj = ArrayEx().addPerson()
	
	println("size of the array -->"+arrayObj.size)
	
	for(per in arrayObj){
		println(per.name+" ----"+per.mobile+" ---"+per.email)
	}
	
	var list : List<Person> = arrayObj.asList();
	
	for(per in list){
		println(per.name+" ----"+per.mobile+" ---"+per.email)
	}
}