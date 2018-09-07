FROM openjdk:8
ADD target/devops-practical-0.1.0.jar /


CMD ["java", "-jar", "/devops-practical-0.1.0.jar"]