fun main() {
    var amount = 10
    var comission = amount / 100 * 75
    if (comission < 35) {
        comission = 35
    }
    println(comission)
}