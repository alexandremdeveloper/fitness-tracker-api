FROM openjdk:17-jdk-slim

WORKDIR /app

COPY . .

RUN ./mvnw clean install -DskipTests

CMD ["java", "-jar", "target/fitness-backend-0.0.1-SNAPSHOT.jar"]