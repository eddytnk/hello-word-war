all: build_app create_image publish_image clean

build_app:
	@echo "building war file"
	./mvnw clean package
	 mv target/hello-world-0.0.1-SNAPSHOT.war ci/hello-world.war

create_image: build_app ci/hello-world.war
	docker build -t eddytnk/myapp ci/

publish_image: create_image
	docker push eddytnk/myapp

clean: ci/hello-world.war
	rm ci/hello-world.war
