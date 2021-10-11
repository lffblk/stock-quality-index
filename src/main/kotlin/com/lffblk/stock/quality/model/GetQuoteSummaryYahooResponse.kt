package com.lffblk.stock.quality.model

data class GetQuoteSummaryYahooResponse(
    val quoteSummary: QuoteSummary
)

data class QuoteSummary(
    val result: List<QuoteSummaryResult>
)

data class QuoteSummaryResult(
    val price: Price,
    val defaultKeyStatistics: DefaultKeyStatistics,
    val financialData: FinancialData,
)

data class Price(
    val currency: String,
    val longName: String,
    val marketCap: NumericValue,
)

data class DefaultKeyStatistics(
    val trailingEps: NumericValue,
)

data class FinancialData(
    val returnOnEquity: NumericValue,
    val debtToEquity: NumericValue,
)

data class NumericValue(
    val raw: Double
)