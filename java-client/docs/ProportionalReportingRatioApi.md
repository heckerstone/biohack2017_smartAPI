# ProportionalReportingRatioApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pprCodes**](ProportionalReportingRatioApi.md#pprCodes) | **GET** /PPRCodes | Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the PPR, 95% confidence intervals and case count.
[**pprNames**](ProportionalReportingRatioApi.md#pprNames) | **GET** /PPRNames | Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the PPR, 95% confidence intervals and case count.


<a name="pprCodes"></a>
# **pprCodes**
> pprCodes(drugCode, outcomeCode)

Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the PPR, 95% confidence intervals and case count.

Returns the Proportional Reporting Ratio (PPR) for the drug/outcome coded query as well as the lower and upper 95% confidence intervals and the case count. Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProportionalReportingRatioApi;


ProportionalReportingRatioApi apiInstance = new ProportionalReportingRatioApi();
String drugCode = "drugCode_example"; // String | RxNorm drug code for search
String outcomeCode = "outcomeCode_example"; // String | SNOMEDCT outcome code for search
try {
    apiInstance.pprCodes(drugCode, outcomeCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ProportionalReportingRatioApi#pprCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drugCode** | **String**| RxNorm drug code for search |
 **outcomeCode** | **String**| SNOMEDCT outcome code for search |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="pprNames"></a>
# **pprNames**
> pprNames(drugName, outcomeName)

Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the PPR, 95% confidence intervals and case count.

Returns the Proportional Reporting Ratio (PPR) for the drug/outcome named query as well as the lower and upper 95% confidence intervals and the case count. Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProportionalReportingRatioApi;


ProportionalReportingRatioApi apiInstance = new ProportionalReportingRatioApi();
String drugName = "drugName_example"; // String | RxNorm drug name for search
String outcomeName = "outcomeName_example"; // String | SNOMEDCT outcome name for search
try {
    apiInstance.pprNames(drugName, outcomeName);
} catch (ApiException e) {
    System.err.println("Exception when calling ProportionalReportingRatioApi#pprNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drugName** | **String**| RxNorm drug name for search |
 **outcomeName** | **String**| SNOMEDCT outcome name for search |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

