FROM openjdk:8-jdk as build
EXPOSE 8080
ADD target/clean-it-backend-0.0.1-SNAPSHOT.jar /clean-it-backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/clean-it-backend-0.0.1-SNAPSHOT.jar"]