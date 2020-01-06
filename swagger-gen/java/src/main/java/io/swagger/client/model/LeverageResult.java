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

/**
 * LeverageResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-06T18:07:36.892+08:00")
public class LeverageResult {
  @SerializedName("BTCUSD")
  private Object BTCUSD = null;

  @SerializedName("EOSUSD")
  private Object EOSUSD = null;

  @SerializedName("ETHUSD")
  private Object ETHUSD = null;

  @SerializedName("XRPUSD")
  private Object XRPUSD = null;

  public LeverageResult BTCUSD(Object BTCUSD) {
    this.BTCUSD = BTCUSD;
    return this;
  }

   /**
   * Get BTCUSD
   * @return BTCUSD
  **/
  @ApiModelProperty(value = "")
  public Object getBTCUSD() {
    return BTCUSD;
  }

  public void setBTCUSD(Object BTCUSD) {
    this.BTCUSD = BTCUSD;
  }

  public LeverageResult EOSUSD(Object EOSUSD) {
    this.EOSUSD = EOSUSD;
    return this;
  }

   /**
   * Get EOSUSD
   * @return EOSUSD
  **/
  @ApiModelProperty(value = "")
  public Object getEOSUSD() {
    return EOSUSD;
  }

  public void setEOSUSD(Object EOSUSD) {
    this.EOSUSD = EOSUSD;
  }

  public LeverageResult ETHUSD(Object ETHUSD) {
    this.ETHUSD = ETHUSD;
    return this;
  }

   /**
   * Get ETHUSD
   * @return ETHUSD
  **/
  @ApiModelProperty(value = "")
  public Object getETHUSD() {
    return ETHUSD;
  }

  public void setETHUSD(Object ETHUSD) {
    this.ETHUSD = ETHUSD;
  }

  public LeverageResult XRPUSD(Object XRPUSD) {
    this.XRPUSD = XRPUSD;
    return this;
  }

   /**
   * Get XRPUSD
   * @return XRPUSD
  **/
  @ApiModelProperty(value = "")
  public Object getXRPUSD() {
    return XRPUSD;
  }

  public void setXRPUSD(Object XRPUSD) {
    this.XRPUSD = XRPUSD;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeverageResult leverageResult = (LeverageResult) o;
    return Objects.equals(this.BTCUSD, leverageResult.BTCUSD) &&
        Objects.equals(this.EOSUSD, leverageResult.EOSUSD) &&
        Objects.equals(this.ETHUSD, leverageResult.ETHUSD) &&
        Objects.equals(this.XRPUSD, leverageResult.XRPUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BTCUSD, EOSUSD, ETHUSD, XRPUSD);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeverageResult {\n");
    
    sb.append("    BTCUSD: ").append(toIndentedString(BTCUSD)).append("\n");
    sb.append("    EOSUSD: ").append(toIndentedString(EOSUSD)).append("\n");
    sb.append("    ETHUSD: ").append(toIndentedString(ETHUSD)).append("\n");
    sb.append("    XRPUSD: ").append(toIndentedString(XRPUSD)).append("\n");
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

