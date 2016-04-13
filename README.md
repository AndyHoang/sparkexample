A minimal example build with Docker and http://sparkjava.com/


See Makefile for building, running and deploying.

Detailed description in this blogpost: http://blog.giantswarm.io/getting-started-with-java-development-on-docker

# BY DOCKER

# BY MAVEN ONLY
1. Prerequisite
  * Java 8
  * Maven > 3.1
  * Check it with `java -version` and `javac -version`
2. Run
  * Navigate to `pom.xml` folder
  * `mvn packge` to compile to jar file
  * `java -jar target/sparkexample-jar-with-dependencies.jar`
  * The Jetty standalone server is now online at port 4567
