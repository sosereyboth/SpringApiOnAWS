FROM openjdk:17
ADD target/myapi.jar myapi.jar
ENTRYPOINT ["java","-jar","/myapi.jar"]