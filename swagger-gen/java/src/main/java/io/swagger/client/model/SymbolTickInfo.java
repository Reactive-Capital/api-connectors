/*
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Get the orderbook response
 */
@ApiModel(description = "Get the orderbook response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-06T18:07:36.892+08:00")
public class SymbolTickInfo {
  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("bid_price")
  private String bidPrice = null;

  @SerializedName("ask_price")
  private String askPrice = null;

  @SerializedName("last_price")
  private String lastPrice = null;

  @SerializedName("last_tick_direction")
  private String lastTickDirection = null;

  @SerializedName("prev_price_24h")
  private String prevPrice24h = null;

  @SerializedName("price_24h_pcnt")
  private String price24hPcnt = null;

  @SerializedName("high_price_24h")
  private String highPrice24h = null;

  @SerializedName("low_price_24h")
  private String lowPrice24h = null;

  @SerializedName("prev_price_1h")
  private String prevPrice1h = null;

  @SerializedName("price_1h_pcnt")
  private String price1hPcnt = null;

  @SerializedName("mark_price")
  private String markPrice = null;

  @SerializedName("index_price")
  private String indexPrice = null;

  @SerializedName("open_interest")
  private BigDecimal openInterest = null;

  @SerializedName("open_value")
  private String openValue = null;

  @SerializedName("total_turnover")
  private String totalTurnover = null;

  @SerializedName("turnover_24h")
  private String turnover24h = null;

  @SerializedName("total_volume")
  private BigDecimal totalVolume = null;

  @SerializedName("volume_24h")
  private BigDecimal volume24h = null;

  @SerializedName("funding_rate")
  private String fundingRate = null;

  @SerializedName("predicted_funding_rate")
  private String predictedFundingRate = null;

  @SerializedName("next_funding_time")
  private String nextFundingTime = null;

  @SerializedName("countdown_hour")
  private BigDecimal countdownHour = null;

  public SymbolTickInfo symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public SymbolTickInfo bidPrice(String bidPrice) {
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * Get bidPrice
   * @return bidPrice
  **/
  @ApiModelProperty(value = "")
  public String getBidPrice() {
    return bidPrice;
  }

  public void setBidPrice(String bidPrice) {
    this.bidPrice = bidPrice;
  }

  public SymbolTickInfo askPrice(String askPrice) {
    this.askPrice = askPrice;
    return this;
  }

   /**
   * Get askPrice
   * @return askPrice
  **/
  @ApiModelProperty(value = "")
  public String getAskPrice() {
    return askPrice;
  }

  public void setAskPrice(String askPrice) {
    this.askPrice = askPrice;
  }

  public SymbolTickInfo lastPrice(String lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }

   /**
   * Get lastPrice
   * @return lastPrice
  **/
  @ApiModelProperty(value = "")
  public String getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(String lastPrice) {
    this.lastPrice = lastPrice;
  }

  public SymbolTickInfo lastTickDirection(String lastTickDirection) {
    this.lastTickDirection = lastTickDirection;
    return this;
  }

   /**
   * Get lastTickDirection
   * @return lastTickDirection
  **/
  @ApiModelProperty(value = "")
  public String getLastTickDirection() {
    return lastTickDirection;
  }

  public void setLastTickDirection(String lastTickDirection) {
    this.lastTickDirection = lastTickDirection;
  }

  public SymbolTickInfo prevPrice24h(String prevPrice24h) {
    this.prevPrice24h = prevPrice24h;
    return this;
  }

   /**
   * Get prevPrice24h
   * @return prevPrice24h
  **/
  @ApiModelProperty(value = "")
  public String getPrevPrice24h() {
    return prevPrice24h;
  }

  public void setPrevPrice24h(String prevPrice24h) {
    this.prevPrice24h = prevPrice24h;
  }

  public SymbolTickInfo price24hPcnt(String price24hPcnt) {
    this.price24hPcnt = price24hPcnt;
    return this;
  }

   /**
   * Get price24hPcnt
   * @return price24hPcnt
  **/
  @ApiModelProperty(value = "")
  public String getPrice24hPcnt() {
    return price24hPcnt;
  }

  public void setPrice24hPcnt(String price24hPcnt) {
    this.price24hPcnt = price24hPcnt;
  }

  public SymbolTickInfo highPrice24h(String highPrice24h) {
    this.highPrice24h = highPrice24h;
    return this;
  }

   /**
   * Get highPrice24h
   * @return highPrice24h
  **/
  @ApiModelProperty(value = "")
  public String getHighPrice24h() {
    return highPrice24h;
  }

  public void setHighPrice24h(String highPrice24h) {
    this.highPrice24h = highPrice24h;
  }

  public SymbolTickInfo lowPrice24h(String lowPrice24h) {
    this.lowPrice24h = lowPrice24h;
    return this;
  }

   /**
   * Get lowPrice24h
   * @return lowPrice24h
  **/
  @ApiModelProperty(value = "")
  public String getLowPrice24h() {
    return lowPrice24h;
  }

  public void setLowPrice24h(String lowPrice24h) {
    this.lowPrice24h = lowPrice24h;
  }

  public SymbolTickInfo prevPrice1h(String prevPrice1h) {
    this.prevPrice1h = prevPrice1h;
    return this;
  }

   /**
   * Get prevPrice1h
   * @return prevPrice1h
  **/
  @ApiModelProperty(value = "")
  public String getPrevPrice1h() {
    return prevPrice1h;
  }

  public void setPrevPrice1h(String prevPrice1h) {
    this.prevPrice1h = prevPrice1h;
  }

  public SymbolTickInfo price1hPcnt(String price1hPcnt) {
    this.price1hPcnt = price1hPcnt;
    return this;
  }

   /**
   * Get price1hPcnt
   * @return price1hPcnt
  **/
  @ApiModelProperty(value = "")
  public String getPrice1hPcnt() {
    return price1hPcnt;
  }

  public void setPrice1hPcnt(String price1hPcnt) {
    this.price1hPcnt = price1hPcnt;
  }

  public SymbolTickInfo markPrice(String markPrice) {
    this.markPrice = markPrice;
    return this;
  }

   /**
   * Get markPrice
   * @return markPrice
  **/
  @ApiModelProperty(value = "")
  public String getMarkPrice() {
    return markPrice;
  }

  public void setMarkPrice(String markPrice) {
    this.markPrice = markPrice;
  }

  public SymbolTickInfo indexPrice(String indexPrice) {
    this.indexPrice = indexPrice;
    return this;
  }

   /**
   * Get indexPrice
   * @return indexPrice
  **/
  @ApiModelProperty(value = "")
  public String getIndexPrice() {
    return indexPrice;
  }

  public void setIndexPrice(String indexPrice) {
    this.indexPrice = indexPrice;
  }

  public SymbolTickInfo openInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
    return this;
  }

   /**
   * Get openInterest
   * @return openInterest
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOpenInterest() {
    return openInterest;
  }

  public void setOpenInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
  }

  public SymbolTickInfo openValue(String openValue) {
    this.openValue = openValue;
    return this;
  }

   /**
   * Get openValue
   * @return openValue
  **/
  @ApiModelProperty(value = "")
  public String getOpenValue() {
    return openValue;
  }

  public void setOpenValue(String openValue) {
    this.openValue = openValue;
  }

  public SymbolTickInfo totalTurnover(String totalTurnover) {
    this.totalTurnover = totalTurnover;
    return this;
  }

   /**
   * Get totalTurnover
   * @return totalTurnover
  **/
  @ApiModelProperty(value = "")
  public String getTotalTurnover() {
    return totalTurnover;
  }

  public void setTotalTurnover(String totalTurnover) {
    this.totalTurnover = totalTurnover;
  }

  public SymbolTickInfo turnover24h(String turnover24h) {
    this.turnover24h = turnover24h;
    return this;
  }

   /**
   * Get turnover24h
   * @return turnover24h
  **/
  @ApiModelProperty(value = "")
  public String getTurnover24h() {
    return turnover24h;
  }

  public void setTurnover24h(String turnover24h) {
    this.turnover24h = turnover24h;
  }

  public SymbolTickInfo totalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
    return this;
  }

   /**
   * Get totalVolume
   * @return totalVolume
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalVolume() {
    return totalVolume;
  }

  public void setTotalVolume(BigDecimal totalVolume) {
    this.totalVolume = totalVolume;
  }

  public SymbolTickInfo volume24h(BigDecimal volume24h) {
    this.volume24h = volume24h;
    return this;
  }

   /**
   * Get volume24h
   * @return volume24h
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getVolume24h() {
    return volume24h;
  }

  public void setVolume24h(BigDecimal volume24h) {
    this.volume24h = volume24h;
  }

  public SymbolTickInfo fundingRate(String fundingRate) {
    this.fundingRate = fundingRate;
    return this;
  }

   /**
   * Get fundingRate
   * @return fundingRate
  **/
  @ApiModelProperty(value = "")
  public String getFundingRate() {
    return fundingRate;
  }

  public void setFundingRate(String fundingRate) {
    this.fundingRate = fundingRate;
  }

  public SymbolTickInfo predictedFundingRate(String predictedFundingRate) {
    this.predictedFundingRate = predictedFundingRate;
    return this;
  }

   /**
   * Get predictedFundingRate
   * @return predictedFundingRate
  **/
  @ApiModelProperty(value = "")
  public String getPredictedFundingRate() {
    return predictedFundingRate;
  }

  public void setPredictedFundingRate(String predictedFundingRate) {
    this.predictedFundingRate = predictedFundingRate;
  }

  public SymbolTickInfo nextFundingTime(String nextFundingTime) {
    this.nextFundingTime = nextFundingTime;
    return this;
  }

   /**
   * Get nextFundingTime
   * @return nextFundingTime
  **/
  @ApiModelProperty(value = "")
  public String getNextFundingTime() {
    return nextFundingTime;
  }

  public void setNextFundingTime(String nextFundingTime) {
    this.nextFundingTime = nextFundingTime;
  }

  public SymbolTickInfo countdownHour(BigDecimal countdownHour) {
    this.countdownHour = countdownHour;
    return this;
  }

   /**
   * Get countdownHour
   * @return countdownHour
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCountdownHour() {
    return countdownHour;
  }

  public void setCountdownHour(BigDecimal countdownHour) {
    this.countdownHour = countdownHour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolTickInfo symbolTickInfo = (SymbolTickInfo) o;
    return Objects.equals(this.symbol, symbolTickInfo.symbol) &&
        Objects.equals(this.bidPrice, symbolTickInfo.bidPrice) &&
        Objects.equals(this.askPrice, symbolTickInfo.askPrice) &&
        Objects.equals(this.lastPrice, symbolTickInfo.lastPrice) &&
        Objects.equals(this.lastTickDirection, symbolTickInfo.lastTickDirection) &&
        Objects.equals(this.prevPrice24h, symbolTickInfo.prevPrice24h) &&
        Objects.equals(this.price24hPcnt, symbolTickInfo.price24hPcnt) &&
        Objects.equals(this.highPrice24h, symbolTickInfo.highPrice24h) &&
        Objects.equals(this.lowPrice24h, symbolTickInfo.lowPrice24h) &&
        Objects.equals(this.prevPrice1h, symbolTickInfo.prevPrice1h) &&
        Objects.equals(this.price1hPcnt, symbolTickInfo.price1hPcnt) &&
        Objects.equals(this.markPrice, symbolTickInfo.markPrice) &&
        Objects.equals(this.indexPrice, symbolTickInfo.indexPrice) &&
        Objects.equals(this.openInterest, symbolTickInfo.openInterest) &&
        Objects.equals(this.openValue, symbolTickInfo.openValue) &&
        Objects.equals(this.totalTurnover, symbolTickInfo.totalTurnover) &&
        Objects.equals(this.turnover24h, symbolTickInfo.turnover24h) &&
        Objects.equals(this.totalVolume, symbolTickInfo.totalVolume) &&
        Objects.equals(this.volume24h, symbolTickInfo.volume24h) &&
        Objects.equals(this.fundingRate, symbolTickInfo.fundingRate) &&
        Objects.equals(this.predictedFundingRate, symbolTickInfo.predictedFundingRate) &&
        Objects.equals(this.nextFundingTime, symbolTickInfo.nextFundingTime) &&
        Objects.equals(this.countdownHour, symbolTickInfo.countdownHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, bidPrice, askPrice, lastPrice, lastTickDirection, prevPrice24h, price24hPcnt, highPrice24h, lowPrice24h, prevPrice1h, price1hPcnt, markPrice, indexPrice, openInterest, openValue, totalTurnover, turnover24h, totalVolume, volume24h, fundingRate, predictedFundingRate, nextFundingTime, countdownHour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymbolTickInfo {\n");
    
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    lastTickDirection: ").append(toIndentedString(lastTickDirection)).append("\n");
    sb.append("    prevPrice24h: ").append(toIndentedString(prevPrice24h)).append("\n");
    sb.append("    price24hPcnt: ").append(toIndentedString(price24hPcnt)).append("\n");
    sb.append("    highPrice24h: ").append(toIndentedString(highPrice24h)).append("\n");
    sb.append("    lowPrice24h: ").append(toIndentedString(lowPrice24h)).append("\n");
    sb.append("    prevPrice1h: ").append(toIndentedString(prevPrice1h)).append("\n");
    sb.append("    price1hPcnt: ").append(toIndentedString(price1hPcnt)).append("\n");
    sb.append("    markPrice: ").append(toIndentedString(markPrice)).append("\n");
    sb.append("    indexPrice: ").append(toIndentedString(indexPrice)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
    sb.append("    openValue: ").append(toIndentedString(openValue)).append("\n");
    sb.append("    totalTurnover: ").append(toIndentedString(totalTurnover)).append("\n");
    sb.append("    turnover24h: ").append(toIndentedString(turnover24h)).append("\n");
    sb.append("    totalVolume: ").append(toIndentedString(totalVolume)).append("\n");
    sb.append("    volume24h: ").append(toIndentedString(volume24h)).append("\n");
    sb.append("    fundingRate: ").append(toIndentedString(fundingRate)).append("\n");
    sb.append("    predictedFundingRate: ").append(toIndentedString(predictedFundingRate)).append("\n");
    sb.append("    nextFundingTime: ").append(toIndentedString(nextFundingTime)).append("\n");
    sb.append("    countdownHour: ").append(toIndentedString(countdownHour)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

