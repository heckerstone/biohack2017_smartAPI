# ReportingOddsRatioApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rorCodes**](ReportingOddsRatioApi.md#rorCodes) | **GET** /RORCodes | Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.
[**rorNames**](ReportingOddsRatioApi.md#rorNames) | **GET** /RORNames | Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.


<a name="rorCodes"></a>
# **rorCodes**
> rorCodes(drugCode, outcomeCode)

Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.

Returns the Reporting Odds Ratio (ROR) for the drug/outcome coded query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportingOddsRatioApi;


ReportingOddsRatioApi apiInstance = new ReportingOddsRatioApi();
String drugCode = "drugCode_example"; // String | RxNorm drug code for search
String outcomeCode = "outcomeCode_example"; // String | SNOMEDCT outcome code for search
try {
    apiInstance.rorCodes(drugCode, outcomeCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingOddsRatioApi#rorCodes");
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

<a name="rorNames"></a>
# **rorNames**
> rorNames(drugName, outcomeName)

Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.

Returns the Reporting Odds Ratio (ROR) for the drug/outcome named query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportingOddsRatioApi;


ReportingOddsRatioApi apiInstance = new ReportingOddsRatioApi();
String drugName = "drugName_example"; // String | RxNorm drug name for search
String outcomeName = "outcomeName_example"; // String | SNOMEDCT outcome name for search
try {
    apiInstance.rorNames(drugName, outcomeName);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingOddsRatioApi#rorNames");
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

