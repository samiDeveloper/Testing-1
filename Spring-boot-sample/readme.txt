in the properties file:

spring.profiles.active=@activatedProperties@

When the build is run, the Resources Plugin will replace the placeholder with the value of the property defined in the active Maven profile. After starting  your application, the Spring framework will load the appropriate configuration file based on the name of the active Spring profile, which is described by the value of the spring.profiles.active property. Note that Spring Boot 1.3 replaced the default Resources Plugin syntax for filtered values and uses @activatedProperties@ instead of ${activatedProperties} notation.


Example :
 mvn package -P test

mvn install -Dspring-boot.run.profiles=prod