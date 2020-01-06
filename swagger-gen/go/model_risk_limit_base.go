/*
 * Bybit API
 *
 * ## REST API for the Bybit Exchange. 
 *
 * API version: 1.0.0
 * Contact: support@bybit.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

// Get risk limit.
type RiskLimitBase struct {
	RetCode float32 `json:"ret_code,omitempty"`
	RetMsg string `json:"ret_msg,omitempty"`
	ExtCode string `json:"ext_code,omitempty"`
	ExtInfo string `json:"ext_info,omitempty"`
	Result *interface{} `json:"result,omitempty"`
	TimeNow string `json:"time_now,omitempty"`
}
