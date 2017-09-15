# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ContingencyTableApi;

import java.io.File;
import java.util.*;

public class ContingencyTableApiExample {

    public static void main(String[] args) {
        
        ContingencyTableApi apiInstance = new ContingencyTableApi();
        String drugCode = "drugCode_example"; // String | RxNorm drug code for search
        String outcomeCode = "outcomeCode_example"; // String | SNOMEDCT outcome code for search
        try {
            apiInstance.contingencyTableCodes(drugCode, outcomeCode);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContingencyTableApi#contingencyTableCodes");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContingencyTableApi* | [**contingencyTableCodes**](docs/ContingencyTableApi.md#contingencyTableCodes) | **GET** /contingencyTableCodes | Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and produce the corresponding contingency table.
*ContingencyTableApi* | [**contingencyTableNames**](docs/ContingencyTableApi.md#contingencyTableNames) | **GET** /contingencyTableNames | Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and produce the corresponding contingency table.
*ProportionalReportingRatioApi* | [**pprCodes**](docs/ProportionalReportingRatioApi.md#pprCodes) | **GET** /PPRCodes | Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the PPR, 95% confidence intervals and case count.
*ProportionalReportingRatioApi* | [**pprNames**](docs/ProportionalReportingRatioApi.md#pprNames) | **GET** /PPRNames | Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the PPR, 95% confidence intervals and case count.
*ReportingOddsRatioApi* | [**rorCodes**](docs/ReportingOddsRatioApi.md#rorCodes) | **GET** /RORCodes | Uses drug and outcome codes in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.
*ReportingOddsRatioApi* | [**rorNames**](docs/ReportingOddsRatioApi.md#rorNames) | **GET** /RORNames | Uses drug and outcome names in RxNorm and SNOMEDCT respectively to search AEOLUS and return the ROR, 95% confidence intervals and case count.


## Documentation for Models



## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

jmbanda@stanford.edu

