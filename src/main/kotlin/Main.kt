fun main() {
    val amount = 1000.0

    val commissionRate = 0.0075
    val minCommission = 35.0
    val commission = amount * commissionRate
    val finalCommission = if (commission < minCommission) minCommission else commission

    println("Сумма перевода: $amount руб.")
    println("Размер комиссии: $finalCommission руб.")
}
