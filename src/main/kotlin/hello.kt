import com.rsk.Person
fun main(args: Array<String>){
    println("Hello Stephan")
    val kevin = Person("Kevin")
    println ("Name is ${kevin.Name} ")
    kevin.display()
    kevin.Name = "Steve"
    kevin.displayWithLambda(::printName)
}


fun printName (name: String){
	println(name)
}