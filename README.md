![Biohackathon2017Image](http://2017.biohackathon.org/bh17-logo.png)
Project: Build a [smartAPI](http://smart-api.info/website/) for a Spontaneus Reporting System (SRS) for drug safety research purposes. More specifically FAERS data that was standardized and currated as the [OHDSI](https://www.ohdsi.org/) resource A curated and standardized adverse drug event resource to accelerate drug safety research (AEOLUS) published in [Nature Scientific data](https://www.nature.com/articles/sdata201626).

Authors: [Juan M. Banda](http://jmbanda.com/)
Available at (temporary location): http://ec2-54-186-230-27.us-west-2.compute.amazonaws.com:8080
Documentation (temporary location): http://ec2-54-186-230-27.us-west-2.compute.amazonaws.com:8080/swagger-ui.html

## Project Goals

* **Spec out an API for the AEOLUS resource:** Based on the most common queries recieved about the resource, provide API calls to answer these queries. 
* **Make the API a smartAPI v3.0:** This will allow the API to be discoverable and reusable while providing rich documentation about its functionality.
* **Make output be JSONLD v1.1 compliant:** While most researcher will just need/want a basic JSON output to their queries. This resouce will provide additional semantics in the JSONLD for potential re-use of the data returned. 
* **Register API with the smartAPI registry:** As part of the process of making the resource discoverable and available to the wider audience, the API will be registered in the registry.

## Repository content

**AEOLUSsrsAPI-v1.0.json** Main JSON file with the smartAPI specification
**java-client** This folder contains the Swagger auto-generated Java client
**spring-server** This folder contains the Swagger auto-generates Java/Spring server. Instructions on how to build and deploy the server are listed bellow. 

## Important
Besides the API server, you will also need to download and install the AEOLUS data file from [Dryad](http://datadryad.org/resource/doi:10.5061/dryad.8q0s4)

## Instrucctions to build the Spring Server

This project requires Java 7 or greater and Maven.

To build, go to the /spring-server folder and type:

```
mvn clean package
```

This produces an exectuable jar in the `target` folder.

To run:

```
java -jar target/swagger-spring-1.0.0.jar
