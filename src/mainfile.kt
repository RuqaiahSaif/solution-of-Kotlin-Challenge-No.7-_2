data class Person(val name: String, val age: Int){

fun task6(): List<Person> {
    var a=listOf(Person("Alice", 29), Person("Bob", 31))
    return a
}}
class Person1(val name: String, val age: Int){

fun task7(): List<Person1> {
    return listOf(Person1("Alice", 29), Person1("Bob", 31))
}}
fun main(){

  println("date class" +listOf(Person("Alice", 29), Person("Bob", 31)))
    println("normal class" +listOf(Person1("Alice", 29), Person1("Bob", 31)))



}