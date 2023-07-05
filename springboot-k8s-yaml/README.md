# springboot-k8s-yaml


```bash
Build the application
1. mvn clean install

Build docker image
2. docker build -t springboot-k8s:1.0 .

Check the built images
3. docker image ls

Deploy the application to kubernetes
4. kubectl apply -f deployment.yaml

check the deployment status
5. kubectl get deployments

Expose app to outside k8s cluster as service
6. kubectl apply -f service.yaml

check the service status
7. kubectl get service

Get the node ip
8. kubectl get nodes -o wide
   Note: pick the ip address under INTERNAL-IP column

9. open this link in browser
   http://<ip address from above command>:8080/api/v1/now?timezone=UTC
```
