WAD
===

This branch focuses on dependency injection. 
Things to consider:
In SendNotificationController the service is injected using constructor injection. Other possibilites are setter or field injection using the @Autowired notation.

There are two implementing classes for the MessagingService. There are more ways to set what specific class will be injected:
* Annotating one class with the @Primary annotation.
* Naming each service ( @Service("email"), @Service("tel")) and using @Qualifier in the controller
* Adding each service to a profile @Profile("dev"), @Profile("prod") and changing the active profile in /resources/application.properties

Also remember we can add a properties file for each profile, for example for dev profile we will have application-dev.properties
