# Use OpenJDK base image
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy compiled classes (build locally first)
COPY target/caltest.jar app.jar

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]
