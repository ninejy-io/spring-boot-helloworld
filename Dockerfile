FROM openjdk:8u171-alpine3.8

COPY target/spring-boot-helloworld-1.0.0.jar /opt/app.jar

WORKDIR /opt

ENTRYPOINT ["java", "-jar", "app.jar"]
