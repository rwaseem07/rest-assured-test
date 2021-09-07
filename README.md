Used tools and frameworks

1. Rest-Assured
2. Maven repository
3. TestNG

Main features
1. All classes and methods are implemented in Java with Maven repository to include all dependencies needed. REST-Assured is used to offer a friendly DSL (Domain specific Languages) 
that describes a connection to an HTTP endpoint and expected results.

2. Utilizes the capabilities of TestNG such as Data provider annotation to separate test data in external file and flexible test suites configuration and management.

3. The framework validates the returned status code, response body, headers and cookies. It can validate each field data type and value. If the returned response includes object of arraylist, 
the framework can validate its size using the keyword ".size()"

API Reference
1. https://www.metaweather.com/api/location/search?query=Nottingham
2. https://www.metaweather.com/api/location/30720/2021-09-07

Source Document

1. https://www.metaweather.com/api/

Testing Scope 
1.The returned City title and Woied can be validated
2.The returned response of in specific location weather details can be validated for

Feature
1. This project will help MetaWeather API using Companies to validate the correct response of application using automation to reduce the manual time.

How to use:
1. Clone the project 
2. Open the project in intellij idea as existing project 
3. Execute the MetaWeatherTest.class  



