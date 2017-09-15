/*
 * AEOLUsrs API
 * Documentation of the A curated and standardized adverse drug event resource to accelerate drug safety research (AEOLUS) web query services. Learn more about the underlying dataset [HERE](https://www.nature.com/articles/sdata201626)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: jmbanda@stanford.edu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportingOddsRatioApi {
    private ApiClient apiClient;

    public ReportingOddsRatioApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportingOddsRatioApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for rorCodes
     * @param drugCode RxNorm drug code for search (required)
     * @param outcomeCode SNOMEDCT outcome code for search (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rorCodesCall(String drugCode, String outcomeCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/RORCodes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (drugCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "drugCode", drugCode));
        if (outcomeCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "outcomeCode", outcomeCode));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call rorCodesValidateBeforeCall(String drugCode, String outcomeCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drugCode' is set
        if (drugCode == null) {
            throw new ApiException("Missing the required parameter 'drugCode' when calling rorCodes(Async)");
        }
        
        // verify the required parameter 'outcomeCode' is set
        if (outcomeCode == null) {
            throw new ApiException("Missing the required parameter 'outcomeCode' when calling rorCodes(Async)");
        }
        
        
        com.squareup.okhttp.Call call = rorCodesCall(drugCode, outcomeCode, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.
     * Returns the Reporting Odds Ratio (ROR) for the drug/outcome coded query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)
     * @param drugCode RxNorm drug code for search (required)
     * @param outcomeCode SNOMEDCT outcome code for search (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void rorCodes(String drugCode, String outcomeCode) throws ApiException {
        rorCodesWithHttpInfo(drugCode, outcomeCode);
    }

    /**
     * Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.
     * Returns the Reporting Odds Ratio (ROR) for the drug/outcome coded query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)
     * @param drugCode RxNorm drug code for search (required)
     * @param outcomeCode SNOMEDCT outcome code for search (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> rorCodesWithHttpInfo(String drugCode, String outcomeCode) throws ApiException {
        com.squareup.okhttp.Call call = rorCodesValidateBeforeCall(drugCode, outcomeCode, null, null);
        return apiClient.execute(call);
    }

    /**
     * Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count. (asynchronously)
     * Returns the Reporting Odds Ratio (ROR) for the drug/outcome coded query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)
     * @param drugCode RxNorm drug code for search (required)
     * @param outcomeCode SNOMEDCT outcome code for search (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rorCodesAsync(String drugCode, String outcomeCode, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = rorCodesValidateBeforeCall(drugCode, outcomeCode, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for rorNames
     * @param drugName RxNorm drug name for search (required)
     * @param outcomeName SNOMEDCT outcome name for search (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rorNamesCall(String drugName, String outcomeName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/RORNames";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (drugName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "drugName", drugName));
        if (outcomeName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "outcomeName", outcomeName));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call rorNamesValidateBeforeCall(String drugName, String outcomeName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'drugName' is set
        if (drugName == null) {
            throw new ApiException("Missing the required parameter 'drugName' when calling rorNames(Async)");
        }
        
        // verify the required parameter 'outcomeName' is set
        if (outcomeName == null) {
            throw new ApiException("Missing the required parameter 'outcomeName' when calling rorNames(Async)");
        }
        
        
        com.squareup.okhttp.Call call = rorNamesCall(drugName, outcomeName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.
     * Returns the Reporting Odds Ratio (ROR) for the drug/outcome named query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)
     * @param drugName RxNorm drug name for search (required)
     * @param outcomeName SNOMEDCT outcome name for search (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void rorNames(String drugName, String outcomeName) throws ApiException {
        rorNamesWithHttpInfo(drugName, outcomeName);
    }

    /**
     * Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.
     * Returns the Reporting Odds Ratio (ROR) for the drug/outcome named query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)
     * @param drugName RxNorm drug name for search (required)
     * @param outcomeName SNOMEDCT outcome name for search (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> rorNamesWithHttpInfo(String drugName, String outcomeName) throws ApiException {
        com.squareup.okhttp.Call call = rorNamesValidateBeforeCall(drugName, outcomeName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count. (asynchronously)
     * Returns the Reporting Odds Ratio (ROR) for the drug/outcome named query as well as the lower and upper 95% confidence intervals and the case count.Calculations are made following [Gavali, D. K., Kulkarni, K. S., Kumar, A. &amp; Chakraborty, B. S. Therapeutic class-specific signal detection of bradycardia associated with propranolol hydrochloride. Indian Journal of Pharmacology 41, 162–166 (2009).](http://www.ijp-online.com/text.asp?2009/41/4/162/56068)
     * @param drugName RxNorm drug name for search (required)
     * @param outcomeName SNOMEDCT outcome name for search (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rorNamesAsync(String drugName, String outcomeName, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = rorNamesValidateBeforeCall(drugName, outcomeName, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
