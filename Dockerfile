FROM registry.access.redhat.com/ubi8/openjdk-17:1.11
COPY target/oom*.jar /oom.jar
CMD ["java", "-Xmx2048m", "-jar", "/oom.jar"]