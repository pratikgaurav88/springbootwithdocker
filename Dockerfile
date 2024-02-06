FROM container-registry.oracle.com/java/jdk:17.0.10-oraclelinux8
COPY target/student-service.jar /home/
ENTRYPOINT ["java","-jar","/home/student-service.jar"]