# Biohackathon 2017 in Morioka, Iwate, Japan
![Biohackathon2017Image](http://2017.biohackathon.org/bh17-logo.png)

AEOLUS smartAPI

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
