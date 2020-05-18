# ETag demo

This project contains a very basic example of how to implement the ETag in SpringBoot based APIs

## Add the following bean

The class KarateRunnerTest takes care of running the features and generating Cucumber reports with the results

```java
@Bean
public ShallowEtagHeaderFilter shallowEtagHeaderFilter() {
    return new ShallowEtagHeaderFilter();
}
```

Your API will now calculate the ETag and send the value in the reponse header.

If you send afterwards that value in the "If-None-Match" header, your API will check if that value has been changed. 
If so, it will deliver the response with a new ETag, otherwise will send a http code 304-Not Modified
