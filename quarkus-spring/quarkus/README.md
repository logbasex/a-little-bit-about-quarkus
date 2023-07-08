## quarkus

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Microprofile
Since there are several implementations of Eclipse MicroProfile, we’ll be using one of the most famous: Quarkus

### SmallRye Quarkus

SmallRye Quarkus is a framework for building microservices using Java. It is based on the Quarkus framework, but it adds a number of features that are specifically designed for microservices.

Some of the features that SmallRye Quarkus provides for microservices include:

- Embedded containers: SmallRye Quarkus can be used to create microservices that are embedded in containers. This makes it easy to deploy microservices to cloud platforms such as Kubernetes.
- Health checks: SmallRye Quarkus provides a number of health checks that can be used to monitor the health of microservices. This makes it easy to ensure that microservices are up and running and that they are able to process requests.
- Metrics: SmallRye Quarkus can be used to collect metrics about microservices. This information can be used to track the performance of microservices and to identify any potential problems.
- Tracing: SmallRye Quarkus can be used to trace requests as they flow through microservices. This information can be used to troubleshoot problems and to improve the performance of microservices.
- SmallRye Quarkus is a popular framework for building microservices. It is easy to use and it provides a number of features that are specifically designed for microservices.

Here are some of the benefits of using SmallRye Quarkus:

- Faster development: SmallRye Quarkus can be used to develop microservices more quickly. This is because SmallRye Quarkus uses a number of optimizations that make it faster to compile and deploy microservices.
- Smaller footprint: SmallRye Quarkus microservices are smaller than microservices that are built using other frameworks. This is because SmallRye Quarkus uses a number of techniques to reduce the size of microservices.
- Secure: SmallRye Quarkus provides a number of features that make it easier to build secure microservices. This includes features such as security annotations and security extensions.

If you are looking for a framework for building microservices, SmallRye Quarkus is a good option. It is easy to use, it provides a number of features that are specifically designed for microservices, and it can help you to develop microservices more quickly and securely.
## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./gradlew quarkusDev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./gradlew build
```

It produces the `quarkus-run.jar` file in the `build/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/quarkus-app/lib/` directory.

The application is now runnable using `java -jar build/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar build/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./gradlew build -Dquarkus.package.type=native
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./build/quarkus-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
