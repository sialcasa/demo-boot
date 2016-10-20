# Project Template for distributed Microservices @ Saxsys
Reference Project Template MS, Saxsys


##Service Structure
There are 4 Services

* Zuul (API-Gateway) on Port 8080
* Eureka (Service Discovery) on Port 8081
* SearchService on Port 8082 
* Subscription on Port 8083

On startup all services register to Eureka. Zuul acts as the API-Gateway and proxies requests to the corresponding services via looking up the service in the Service Discovery.

**There are currently 2 important services missing:**

* Auth Service (e.g. https://github.com/rohitghatol/spring-boot-microservices)
* Message Broker ([https://cloud.spring.io/spring-cloud-stream/](https://cloud.spring.io/spring-cloud-stream/))

##How to use & What happens
1. Start all services via start script 
2. Open Eureka Service Discovery Panel under [http://localhost:8761/
](http://localhost:8761/)
3. Wait that 3 Services appear under "Instances currently registered with Eureka" (Search, Subscription, Zuul) by refreshing the page
4. Zuul (running on 8080) is the API Gateway ([Config](https://github.com/sialcasa/demo-boot/blob/master/proxy/src/main/resources/application.properties)) that routes the search and subscription path to the corresponding services and their REST-Endpoints
5. call [http://localhost:8080/search/company](http://localhost:8080/search/company) (The Request runs against Zuul, Zuul requests the services address of the service instance from Eureka and poxies the request to the available service instance)
