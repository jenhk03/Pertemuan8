fun main()
{
    val even = arrayOf(2, 4, 6, 8)
    val fiveNumbers5 = Array(5, {5})
    val vocal = arrayOf('a', 'i', 'u', 'e', 'o')
    val odd = intArrayOf(1, 3, 5, 7)
    val decimal = floatArrayOf(1.2f, 1.3f)
    val zeros = DoubleArray(4)
    val odd2 = arrayOf(1, 3, 5, 7).toIntArray()
    for (number in even)
    {
        print("$number ")
    }
    println()
    odd.forEach { number -> print("$number ") }
    println()

//    List
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    val innerPlanets2 = arrayListOf("Mercury", "Venus", "Earth", "Mars")
    val x: List<String> = listOf()
    val outerPlanets = mutableListOf("Jupiter MX", "Saturn", "Uranus", "Neptune")
    val outerPlanets2 = mutableListOf<String>()
    println(outerPlanets)
    for (planet in outerPlanets)
    {
        println(planet)
    }
    if (outerPlanets.size < 2)
    {
        println("Outer Planet < 2")
    }
    else
    {
        println("Outer Planet >= 2")
    }
    println(outerPlanets.first())
    println(outerPlanets.last())
    val containsPlanet = outerPlanets.let { println("${outerPlanets.contains("Uranus")}") }
    println("Planet 1 : ${outerPlanets[0]}")
    println("Planet 1 : ${outerPlanets.get(0)}")
    val filterPlanet = innerPlanets.slice(1..2)
    println(filterPlanet.joinToString(" | "))
    fun isEliminated(planet: String): Boolean
    {
        return planet !in outerPlanets
    }
    println(isEliminated("Pluto"))
    println(isEliminated("Uranus"))
    println(outerPlanets.slice(1..3).contains("Saturn"))

//    Adding elements by using add()
    outerPlanets.add("Pluto")
    outerPlanets += "Pluto 2"
    println(outerPlanets.joinToString(" || "))

//    Removing elements by using remove()
    outerPlanets.remove("Pluto")
    outerPlanets -= "Pluto 2"
    println(outerPlanets.joinToString(" || "))

//    Replace
    outerPlanets[3] = "New Pluto"
    println(outerPlanets.joinToString(" || "))

//    sort()
    outerPlanets.sort()
    println(outerPlanets.joinToString(" || "))

//    removeAt()
    outerPlanets.removeAt(1)
    println(outerPlanets.joinToString(" || "))
}