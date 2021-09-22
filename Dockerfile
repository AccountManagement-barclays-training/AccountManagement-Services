FROM openjdk:8
ADD target/Account_Management-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9191
ENTRYPOINT [ "java", "-jar", "app.jar" ]
