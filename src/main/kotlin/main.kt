package ru.netology

fun main() {
    val previousPurchaseAmountKopeck = 3_000
    val purchaseAmountKopeck = 1_200_000
    val limitDiscountStartKopeck = 100_000 // коп.
    val limitDiscountMediumKopeck = 1_000_000 // коп.
    val discountStartKopeck = 10_000 // 100 руб.
    val discountMediumPercent = 5 // 5%
    val extraDiscountPercent = 1 // 1
    val customerRegular = true
    println("Покупка: ${purchaseAmountKopeck / 100} руб. ${purchaseAmountKopeck % 100} " +
            "${previousPurchaseAmountKopeck % 10} коп.")

    val priceDiscountStartKopeck = purchaseAmountKopeck - discountStartKopeck
    val priceDiscountMedium: Int = purchaseAmountKopeck - (purchaseAmountKopeck * discountMediumPercent / 100)
    val preResultKopeck = if (previousPurchaseAmountKopeck < limitDiscountStartKopeck) purchaseAmountKopeck else if
            ((previousPurchaseAmountKopeck > limitDiscountStartKopeck) &&
                (previousPurchaseAmountKopeck < limitDiscountMediumKopeck))
                    priceDiscountStartKopeck else priceDiscountMedium
    println("Покупка после применения скидки: ${preResultKopeck / 100} руб. ${preResultKopeck % 100} " +
            "${preResultKopeck % 10} коп.")

    val priceExtraDiscount: Int = preResultKopeck - (preResultKopeck * extraDiscountPercent / 100)
    val result = if (customerRegular) priceExtraDiscount else preResultKopeck
    println("Покупка после применения скидки постоянного покупателя: ${result / 100} руб. ${result % 100} " +
            "${result % 10} коп. ")

}