#!/usr/bin/env bash
../mvnw clean package
mv target/hello-world-0.0.1-SNAPSHOT.war target/hello-world.war
docker build -t eddytnk/myapp .
docker run -d -p 8080:8080 eddytnk/myapp


#docker run --env-file=/Users/edwardtanko/workspace/hello-world/host/config.env -p 8080:8080 eddytnk/myapp
#scp stack-compose.yml root@206.189.237.50:/root/demo
