#!/usr/bin/env bash
./mvnw clean package
mv target/hello-world-0.0.1-SNAPSHOT.war target/hello-world.war
docker build -t eddytnk/myapp .
docker run -d -p 8080:8080 eddytnk/myapp
