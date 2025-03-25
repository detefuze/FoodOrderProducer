# Базовый образ с Java
FROM openjdk:17-jdk-alpine

WORKDIR /FoodOrderProducer

COPY target/FoodOrderProducer-1.0-SNAPSHOT.jar /FoodOrderProducer/FoodOrderProducer-1.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "FoodOrderProducer-1.0-SNAPSHOT.jar"]