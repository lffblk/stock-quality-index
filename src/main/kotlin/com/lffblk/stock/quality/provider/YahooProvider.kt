package com.lffblk.stock.quality.provider

import com.lffblk.stock.quality.client.YahooClient
import com.lffblk.stock.quality.model.FinindieDetector
import org.springframework.stereotype.Component
import java.util.*

@Component
class YahooProvider(
    private val yahooClient: YahooClient
) {

    fun getFinindieDetector(ticker: String): FinindieDetector {
        val quoteSummary = yahooClient.getQuoteSummary(ticker).quoteSummary.result[0]
        return FinindieDetector(
            ticker = ticker,
            name = quoteSummary.price.longName,
            currency = Currency.getInstance(quoteSummary.price.currency),
            marketCap = quoteSummary.price.marketCap.raw,
            eps = quoteSummary.defaultKeyStatistics.trailingEps.raw,
            roe = quoteSummary.financialData.returnOnEquity.raw,
            leverage = quoteSummary.financialData.debtToEquity.raw
        )
    }
}