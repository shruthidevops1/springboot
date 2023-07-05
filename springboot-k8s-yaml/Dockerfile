FROM openjdk:8
EXPOSE 8080
ADD target/springboot-k8s.jar springboot-k8s.jar
ENTRYPOINT ["java","-jar","/springboot-k8s.jar"]
