#!/usr/bin/env bash
mvn clean package
docker build -t spring-cloud-sleuth .
docker tag spring-cloud-sleuth:latest 849310892904.dkr.ecr.eu-west-3.amazonaws.com/spring-cloud-sleuth:latest
docker push 849310892904.dkr.ecr.eu-west-3.amazonaws.com/spring-cloud-sleuth:latest