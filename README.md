Maven embedder poc
===

This project demonstrates how maven could be embedded (see: [Maven Embedder](https://maven.apache.org/ref/3.9.7/maven-embedder/index.html)) into a simple Java application.

The example project (Spring-Boot application) resides in `src/main/java/resources/demo` and is build by the embedded maven library.

### How to run

1. Clone this repo
2. Execute
   ```bash
   ./gradlew run
   ```