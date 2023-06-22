## Webinar
- [Quarkus Deep Dive Webinar](https://www.youtube.com/watch?v=I5QZpzpx8aI)

## Native executable
- [Install on Ubuntu](https://dev.to/fahadisrar/guide-to-install-graalvm-community-edition-on-ubuntu-38h8)
- [Building Native Image](https://quarkus.io/guides/building-native-image)

```shell
# https://www.mastertheboss.com/soa-cloud/quarkus/building-container-ready-native-applications-with-quarkus/

# 1. Building a Native executable with Quarkus – the easy way
# 2. Building a Native executable with GRAALVM
 
./gradlew build -Dquarkus.package.type=native
/build:~$ ./a-little-bit-about-quarkus-1.0-SNAPSHOT-runner 
```


## Native executable vs Jar
A native executable and a JAR (Java ARchive) file are different ways of packaging and distributing software applications. Let's explore their characteristics and use cases:

Native Executable:
A native executable refers to an executable file that is specifically compiled and built for a particular operating system and hardware architecture. It is written in a programming language that is directly compatible with the target platform. The resulting binary file can be directly run on the operating system without any additional runtime or virtual machine.

Advantages of native executables:
1. Performance: Native executables can often offer better performance since they are compiled directly to the machine code of the target platform.
2. Platform-specific functionality: They can take advantage of platform-specific features and libraries, allowing for deep integration with the underlying operating system.
3. Distribution: Native executables are typically standalone files, making distribution and deployment simpler.

Disadvantages of native executables:
1. Portability: Native executables are specific to a particular operating system and hardware architecture. Therefore, they are not easily portable across different platforms.
2. Development and maintenance: Building and maintaining native executables can be more complex and time-consuming, as it requires separate builds for each target platform.

JAR (Java ARchive) file:
A JAR file is a Java archive format that contains compiled Java classes, resources, and metadata required for running Java applications. It is a platform-independent format that can be executed using a Java Virtual Machine (JVM). JAR files are commonly used for packaging and distributing Java applications and libraries.

Advantages of JAR files:
1. Portability: JAR files can run on any platform that has a compatible Java Runtime Environment (JRE) or Java Development Kit (JDK) installed, making them highly portable.
2. Security: JAR files can be digitally signed and verified, ensuring the authenticity and integrity of the contained code.
3. Dependency management: JAR files can include dependencies, allowing for easier management of libraries and their versions.

Disadvantages of JAR files:
1. Performance: Java bytecode executed in a JVM typically has a performance overhead compared to native executables, although the JVM has advanced optimization techniques that mitigate this gap to some extent.
2. JVM dependency: To run a JAR file, a compatible JVM must be installed on the target system. This dependency can add complexity to the deployment process.
3. Limited platform integration: Java applications running in a JVM have limited access to low-level platform-specific functionality and may require additional libraries or frameworks to interact with the operating system.

In summary, native executables provide better performance and platform integration but lack portability, while JAR files offer platform independence and easier distribution but may have a slight performance overhead and require a JVM. The choice between the two depends on factors such as target platforms, performance requirements, development complexity, and the need for platform-specific functionality.

## Performance
https://medium.com/arconsis/spring-boot-vs-quarkus-part-2-jvm-runtime-performance-af45d0db116e


## Livereload

Change code and recall API to see the difference.

- [Is Quarkus the future of Java?](https://medium.com/swlh/is-quarkus-the-future-of-java-b664c5e79381)


## [GraalVM](https://www.graalvm.org/why-graalvm/)
- https://www.infoq.com/articles/native-java-graalvm/
- [GraalVM — Make Java Great Again](https://batnamv.medium.com/c%C3%A1ch-m%E1%BA%A1ng-h%C3%B3a-java-v%E1%BB%9Bi-graalvm-d7fe1cfa3c25)


GraalVM Native Image is a technology that allows you to compile Java applications into standalone, native executables. While it offers several benefits such as faster startup time and lower memory footprint, **reducing cloud costs might not be one of its primary advantages**. However, there are some indirect ways in which GraalVM Native Image can contribute to cost reduction. Here are a few points to consider:

1. Lower resource consumption: GraalVM Native Image can help reduce memory usage and improve performance, which can lead to more efficient resource utilization. By optimizing your application's memory footprint, you might be able to reduce the size of cloud instances or containers required to run your application, resulting in cost savings.

2. Faster startup time: Native executables generated by GraalVM Native Image tend to start up faster compared to traditional Java applications. This means that your application can respond to requests more quickly, potentially reducing the need for higher-tier or larger instances that are typically associated with better performance. By using smaller instances, you can save on cloud costs.

3. Serverless architectures: GraalVM Native Image can be particularly beneficial in serverless architectures, where you pay based on resource usage and execution time. The faster startup time and reduced memory footprint can translate into shorter execution times and lower resource consumption, resulting in lower cloud costs.

4. Scaling considerations: When scaling your application horizontally to handle increased load, the reduced memory footprint of GraalVM Native Image can allow you to accommodate more instances within the same resource limits. This can help you achieve better scalability without incurring additional costs.

While GraalVM Native Image may not directly reduce cloud costs, it can contribute to optimizing resource utilization, improving performance, and potentially enabling more efficient scaling strategies. It's important to evaluate these factors in the context of your specific application and cloud deployment to determine the potential cost benefits.

## [Why Dropping Java 8](https://github.com/quarkusio/quarkus/wiki/Why-Dropping-Java-8)

## Ahead-of-Time Compilation vs. Just-in-Time Compilation
- https://www.cesarsotovalero.net/blog/aot-vs-jit-compilation-in-java.html
- https://www.marcobehler.com/guides/graalvm-aot-jit
  https://www.linkedin.com/pulse/ahead-of-time-compilation-vs-just-in-time-java-comparative-raj/
- 
## References
- https://www.slideshare.net/svdevops/quarkus-a-nextgeneration-kubernetes-native-java-framework
- https://viblo.asia/p/tim-hieu-ve-quarkus-supersonic-subatomic-java-jvEla14zlkw
