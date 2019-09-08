# easy-web-testing
This is a demo repository for 
[Web Testing is Easy](https://docs.google.com/presentation/d/1lMdhoAD5wJ7FYnnj2SdFudkcbf4JWAwymw8oK1jbp6s/edit?usp=sharing) 
presentation

## Demo test without containers

Launch [demo test](./src/test/java/io/github/easy/DouDemoTestLocal.java) from your favorite IDE

## Demo test with containers

* Start Docker
* Launch [selenoid demo test](./src/test/java/io/github/easy/DouDemoTestWithSelenoid.java) from your favorite IDE

#### Important

Currently Selenoid [does not support](https://aerokube.com/selenoid/latest/#_features_not_working)
pulling browser images automatically.
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

* [Selenide](https://github.com/selenide/selenide)
* [Selenoid](https://github.com/aerokube/selenoid)
* [Testcontainers](https://www.testcontainers.org/)
* [Owner](https://github.com/lviggiano/owner)
* [JUnit 5](https://junit.org/junit5/)
* [Hamcrest](http://hamcrest.org/)
* [SLF4J](https://www.slf4j.org/)
* [LOGBack](https://logback.qos.ch/)