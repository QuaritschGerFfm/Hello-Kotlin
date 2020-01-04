package com.rsk

class Person (var Name: String){
	fun display(){
		println("Display: $Name")
	}
	
	fun displayWithLambda(func: (s:String) -> Unit){
		// Unit = void! kein Returnvalue
		func(Name)
	}
}
