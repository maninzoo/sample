FROM openjdk:11-jre-slim
ARG JAR_FILE=build/libs/sample-0.0.1.jar
COPY ${JAR_FILE} sample.jar
ENTRYPOINT ["java", "-jar", "/sample.jar"]
