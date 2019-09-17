# easy-web-testing
This is a demo repository for 
[Web Testing is Easy](https://docs.google.com/presentation/d/1lMdhoAD5wJ7FYnnj2SdFudkcbf4JWAwymw8oK1jbp6s/edit?usp=sharing) 
presentation

## Demo simple test

Launch [demo test](./src/test/java/io/github/easy/DouDemoTestLocal.java) from your favorite IDE

## Demo test with cucumber

* Install Cucumber plugin to your favorite IDE
* Launch [demo test](./src/spec/resources/io/github/easy/DouDemoTest.feature) from your favorite IDE

## Demo test with containers

* Start Docker
* Launch [container demo test](./src/test/java/io/github/easy/DouDemoTestWithContainer.java) from your favorite IDE

#### Important

Test Containers load browser version based on installed driver version 
[Richard North (TestContainers creator)](https://vimeo.com/222501136).

Also current demo is not pulling browser images automatically.
This requires deleting all related containers if [test.properties](./src/test/resources/test.properties)
were updated with new `browser.name`, `browser.version` or `platform.name`, like:
```bash
docker system prune -a
```
OR
```bash
docker container stop $(docker container ls -aq)
docker container rm $(docker container ls -aq)
docker rmi $(docker images -a -q)
```
OR any other suitable way of cleaning saved images. 
Otherwise current demo tests will fail. Adding `Dockerfile` or `docker-compose.yml` may help.

## Used dependencies

* [Cucumber](https://cucumber.io/docs/guides/)
* [Hamcrest](http://hamcrest.org/)
* [JUnit 5](https://junit.org/junit5/)
* [LOGBack](https://logback.qos.ch/)
* [Owner](https://github.com/lviggiano/owner)
* [SLF4J](https://www.slf4j.org/)
* [Selenide](https://github.com/selenide/selenide)
* [Testcontainers](https://www.testcontainers.org/)