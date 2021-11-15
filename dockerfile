FROM java:8
EXPOSE 8090
COPY target/Timesheet-spring-boot-core-data-jpa-mvc-REST-1-0.0.1-SNAPSHOT.war app.war
ENTRYPOINT ["java","-jar","app.war"]