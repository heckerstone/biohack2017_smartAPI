# ContingencyTableApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contingencyTableCodes**](ContingencyTableApi.md#contingencyTableCodes) | **GET** /contingencyTableCodes | Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and produce the corresponding contingency table.
[**contingencyTableNames**](ContingencyTableApi.md#contingencyTableNames) | **GET** /contingencyTableNames | Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and produce the corresponding contingency table.


<a name="contingencyTableCodes"></a>
# **contingencyTableCodes**
> contingencyTableCodes(drugCode, outcomeCode)

Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and produce the corresponding contingency table.

Makes drug/outcome coded query and returns two by two contingency table.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContingencyTableApi;


ContingencyTableApi apiInstance = new ContingencyTableApi();
String drugCode = "drugCode_example"; // String | RxNorm drug code for search
String outcomeCode = "outcomeCode_example"; // String | SNOMEDCT outcome code for search
try {
    apiInstance.contingencyTableCodes(drugCode, outcomeCode);
} catch (ApiException e) {
    System.err.println("Exception when calling ContingencyTableApi#contingencyTableCodes");
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

<a name="contingencyTableNames"></a>
# **contingencyTableNames**
> contingencyTableNames(drugName, outcomeName)

Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and produce the corresponding contingency table.

Makes drug/outcome coded query and returns two by two contingency table.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ContingencyTableApi;


ContingencyTableApi apiInstance = new ContingencyTableApi();
String drugName = "drugName_example"; // String | RxNorm-standard drug name for search
String outcomeName = "outcomeName_example"; // String | SNOMEDCT-standard outcome name for search
try {
    apiInstance.contingencyTableNames(drugName, outcomeName);
} catch (ApiException e) {
    System.err.println("Exception when calling ContingencyTableApi#contingencyTableNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drugName** | **String**| RxNorm-standard drug name for search |
 **outcomeName** | **String**| SNOMEDCT-standard outcome name for search |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

