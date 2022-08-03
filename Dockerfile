FROM openjdk:17-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} basic-app.jar
ENTRYPOINT ["java","-jar","/basic-app.jar"]
EXPOSE 8081