FROM openjdk:8u151-alpine3.7
VOLUME /tmp
ARG JAR_FILE=impl/target/*.jar
COPY ${JAR_FILE} service.jar
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar /service.jar