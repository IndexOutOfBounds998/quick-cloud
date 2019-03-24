FROM java:alpine
VOLUME /tmp
ADD ytl-register-0.0.1-SNAPSHOT app.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/app.jar"]
