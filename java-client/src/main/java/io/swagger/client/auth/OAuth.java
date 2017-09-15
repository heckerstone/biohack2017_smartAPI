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


package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-15T01:24:21.529Z")
public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
