Apache CXF and Jakarta RESTful Web Services Bootstrap
==============

- Build

         mvn clean package
         
- Run using Maven exec plugin

         mvn exec:java
         
- Run using standalone JAR

         java -jar target/cxf-jakarta-restful-3.1-bootstrap-0.0.1-SNAPSHOT.jar

- Invoke People REST service  

        curl http://localhost:10800/api/people