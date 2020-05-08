FROM openjdk:8
ADD target/devops_calculator-1.0-SNAPSHOT devops_calculator-1.0-SNAPSHOT
CMD ["java","-jar","devops_calculator-1.0-SNAPSHOT.jar"]