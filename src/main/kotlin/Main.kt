import kotlin.math.roundToInt

fun main() {
    val itemPrice = 100
    val itemCount = 121
    val discount = 100
    val discountStart = 1_000
    val regularCustomer: Boolean = true
    val totalPrice = itemPrice * itemCount
    var result = 0

    if (totalPrice > discountStart && totalPrice < 10_001) {
        result = totalPrice - discount
    } else if (totalPrice > 10_000) {
        result = (totalPrice * 0.95).toInt()
    } else if (totalPrice < 1001) {
        result = totalPrice
    }
    if (regularCustomer == true) result = (result * 0.99).toInt()


    println("Total Price: $result")
}