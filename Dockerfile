FROM openjdk:15.0.2-oracle
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
# ARG JAR_FILE=libs/*.jar
# docker run -p 9000:9000 -e JAVA_OPTS=-Dserver.port=9000
COPY ./build/libs/куекшумук-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar
