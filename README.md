![GitHub top language](https://img.shields.io/badge/SPRING%20BOOT-2.7.0-brightgreen)
![GitHub top language](https://img.shields.io/badge/APP%20RELEASE-1.0.0-blue)
# Study-Spring Boot with Kafka using Avro

## Project Arch
	- Project BackEnd: Spring Cloud 2.7.0
	
## Owner
	- Carlos Roberto Medeiros de Lima
	
<p align="center">
  <img src= "https://github.com/CarlosRobertoMedeiros/kafka-avro-spring-boot/blob/master/draw-io/implementation-spring-kafka-avro.drawio.png" />
</p>

## General
	
	- Draw.io Arch
		implementation-spring-kafka-avro.drawio
	
	- Postman Collections
		microservice-kafka-avro
	
	- IDE Conduktor for Managed Kafka

## Environment
	- Execute the Stack Using 
		- docker-compose down -- free the docker
		- docker-compose up -- up the images
	
## MicroServices
	- kafka-producer-poc-with-avro
	- kafka-consumer-poc-with-avro

## Trick
	 Put a message(kafka-producer-poc-with-avro) using the postman collection and see the
kafka-consumer-poc-with-avro receiving the message.

