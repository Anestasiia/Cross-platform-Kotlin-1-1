//import java.io.BufferedReader
//import java.io.InputStreamReader

fun main() {

    println("Task1")

    //ввід сторони а
    print("Enter side a: ")
    val a: Double = readln().toDouble()

    // Перевірка на додатність значення a
    if (a < 0) {
        println("Side a must be positive.")
        return
    }

    //ввід сторони b
    print("Enter side b: ")
    val b: Double = readln().toDouble()


    // Перевірка на додатність значення b
    if (b < 0) {
        println("Side b must be positive.")
        return
    }
    //обрахунок площі та периметра
    val area: Double = a * b
    val perimeter: Double = 2 * a + 2 * b

    println("Area: $area")
    println("Perimeter: $perimeter")
}