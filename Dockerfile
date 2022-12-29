FROM openjdk:11
EXPOSE 8085
ADD target/bill.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]