package com.lffblk.stock.quality.client

import com.lffblk.stock.quality.model.GetQuoteSummaryYahooResponse
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.lang.IllegalStateException

private const val YAHOO_FINANCE_URL = "https://query1.finance.yahoo.com/v10/finance"

@Component
class YahooClient(
    private val restTemplate: RestTemplate
) {

    fun getQuoteSummary(ticker: String): GetQuoteSummaryYahooResponse {
        val url = "$YAHOO_FINANCE_URL/quoteSummary/{ticker}?modules={modules}"
        val params = mapOf(
            "ticker" to ticker,
            "modules" to "price,defaultKeyStatistics,financialData,earningsTrend"
        )
        return restTemplate.getForObject(url, GetQuoteSummaryYahooResponse::class.java, params)
            ?: throw IllegalStateException("quoteSummary request returned null")
    }
}