#A minimal example Spark framework

## Purpose
* To minify css/javascript file
* Prove how to improve loading page speed
* Using a java web application framework
* Tasks will be trigger by maven

## Prerequisite
* Java 8
* [Jade syntax](http://jade-lang.com)


## BY DOCKER
See Makefile for building, running and deploying.
Detailed description in this blogpost: http://blog.giantswarm.io/getting-started-with-java-development-on-docker


## BY MAVEN ONLY
1. Prerequisite
  * Java 8 sdk
  * Maven > 3.1
  * Check it with `java -version` and `javac -version`

2. Run
  * Navigate to `pom.xml` folder
  * `mvn packge` to compile to jar file
  * `java -jar target/sparkexample-jar-with-dependencies.jar`
  * The Jetty standalone server is now online at port 4567
  * Signal end to stop server and rebuild again

## Speed page improvement
> Remember to disable cached in development tool

| Network | `/hello` | `/speedhello`|
| ------- | -------- | ------------ |
| Size    | ~ 262 kb | ~ 84 kb      |

