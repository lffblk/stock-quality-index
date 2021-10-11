package com.lffblk.stock.quality.model

import java.util.*

data class FinindieDetector(
    val ticker: String,
    val name: String,
    val currency: Currency,
    val marketCap: Double,
    val eps: Double,
    val roe: Double,
    val leverage: Double,
)