## [Static Proxy in Quarkus](https://dev.to/nutrymaco/static-proxies-in-quarkus-4ebf)

Quarkus combines bytecode generation, bytecode transformation and knowledge about all classes to generate proxy at build time. Thereby giving better perfomance at runtime and possibility for creating proxy for final classes.

---

## Does quarkus using static proxy?

Yes, Quarkus uses static proxies. Static proxies are created at build time, which means that they are more efficient than dynamic proxies, which are created at runtime. Quarkus also uses bytecode transformation to modify the bytecode of classes with the final modifier, so that they can be proxied.

There are a number of benefits to using static proxies in Quarkus:

* Performance: Static proxies are more efficient than dynamic proxies, because they are created at build time.
* Flexibility: Static proxies can be used to proxy any class, including classes with the final modifier.
* Power: Static proxies can modify the behavior of classes in a wide range of ways.

Quarkus uses static proxies for a number of features, including:

* Dependency injection: Quarkus uses static proxies to inject dependencies into fields and methods.
* Interceptors: Quarkus uses static proxies to implement interceptors, which can be used to intercept and modify calls to methods.
* Bean validation: Quarkus uses static proxies to implement bean validation, which can be used to validate the state of beans.
* CDI events: Quarkus uses static proxies to implement CDI events, which can be used to notify observers of changes to the state of the application.

If you are developing a Quarkus application, you do not need to worry about creating and managing static proxies yourself. Quarkus will automatically create and manage static proxies for you, based on the configuration of your application.

----

## Which library Quarkus use for create static proxy?

Quarkus uses the Byte Buddy library to create static proxies. Byte Buddy is a powerful and flexible library that can be used to generate bytecode at runtime. Quarkus uses Byte Buddy to generate static proxies for a variety of features, including dependency injection, interceptors, bean validation, and CDI events.

Byte Buddy is a popular choice for creating static proxies in Java, and it is used by many popular libraries, such as Mockito and Spring Boot. It is a powerful and flexible library, but it can be complex to use. Quarkus makes it easy to use Byte Buddy to create static proxies, by providing a number of abstractions and conveniences.

If you are developing a Quarkus application, you do not need to worry about using Byte Buddy directly. Quarkus will automatically use Byte Buddy to generate static proxies for you, based on the configuration of your application.

Here are some of the benefits of using Byte Buddy to create static proxies in Quarkus:

* Performance: Byte Buddy is a very efficient library, and the static proxies that it generates are also very efficient.
* Flexibility: Byte Buddy can be used to generate static proxies for any class, including classes with the final modifier.
* Power: Byte Buddy can be used to modify the behavior of classes in a wide range of ways.

If you are interested in learning more about Byte Buddy, you can visit the Byte Buddy website: https://bytebuddy.net/

----

## Why quarkus using Byte Buddy instead of CGLIB

Quarkus uses ByteBuddy instead of CGLib for a number of reasons:

* **ByteBuddy is more performant.** ByteBuddy can generate classes much faster than CGLib, especially for complex classes.
* **ByteBuddy is more flexible.** ByteBuddy allows for more fine-grained control over the bytecode generation process. This makes it possible to implement features that are not possible with CGLib, such as generating code for new Java versions before they are released.
* **ByteBuddy is more actively maintained.** ByteBuddy is a newer project than CGLib and is actively maintained by a team of developers. This means that it is more likely to receive new features and bug fixes.

In addition to these reasons, ByteBuddy is also a better fit for the overall architecture of Quarkus. Quarkus is designed to be a lightweight and fast Java framework. ByteBuddy's performance and flexibility make it a good choice for Quarkus, as it allows Quarkus to generate the code it needs quickly and efficiently.

Here are some specific examples of how ByteBuddy is used in Quarkus:

* ByteBuddy is used to generate the code for Quarkus extensions. Quarkus extensions are used to add new features and functionality to Quarkus. ByteBuddy allows Quarkus to generate the code for extensions quickly and efficiently, even for complex extensions.
* ByteBuddy is used to generate the code for Quarkus's hot reloading feature. Hot reloading allows Quarkus to reload changes to code without restarting the application. ByteBuddy allows Quarkus to generate the code needed to implement hot reloading in a performant and efficient way.
* ByteBuddy is used to generate the code for Quarkus's dependency injection feature. Dependency injection is a design pattern that allows Quarkus to automatically inject dependencies into objects. ByteBuddy allows Quarkus to generate the code needed to implement dependency injection in a performant and efficient way.

Overall, ByteBuddy is a good choice for Quarkus because it is performant, flexible, and actively maintained. It also fits well with the overall architecture of Quarkus.

----

## How Quarkus uses the Byte Buddy library to create static proxies while Byte Buddy is dynamic agent?

Quarkus uses Byte Buddy to create static proxies in two ways:

1. **Bytecode generation at build time:** Quarkus uses Byte Buddy to generate bytecode for static proxies at build time. This means that the static proxies are created before the application starts, which makes them more efficient than dynamic proxies, which are created at runtime.
2. **Bytecode transformation:** Quarkus uses Byte Buddy to transform the bytecode of classes with the final modifier, so that they can be proxied. Dynamic proxies cannot proxy classes with the final modifier, so this is a significant advantage of using Byte Buddy to create static proxies in Quarkus.

To create a static proxy for a class, Quarkus first generates bytecode for the proxy class. The proxy class extends the original class and overrides all of the methods in the original class. Byte Buddy is used to generate the bytecode for the proxy class in such a way that the proxy class can intercept and modify calls to the methods in the original class.

Once the bytecode for the proxy class has been generated, Quarkus uses bytecode transformation to transform the bytecode of the original class. The bytecode transformation adds a field to the original class that stores a reference to the proxy class. The bytecode transformation also modifies the bytecode of the original class so that all calls to the methods in the original class are redirected to the corresponding methods in the proxy class.

The entire process of creating and transforming the bytecode for static proxies happens at build time. This means that the static proxies are created before the application starts, which makes them more efficient than dynamic proxies, which are created at runtime.

It is important to note that Byte Buddy is a dynamic agent library. However, Quarkus uses Byte Buddy to generate and transform bytecode at build time, which effectively creates static proxies.

Here are some of the benefits of using Byte Buddy to create static proxies in Quarkus:

* Performance: Static proxies are more efficient than dynamic proxies, because they are created at build time.
* Flexibility: Static proxies can be used to proxy any class, including classes with the final modifier.
* Power: Static proxies can modify the behavior of classes in a wide range of ways.

If you are developing a Quarkus application, you do not need to worry about using Byte Buddy directly. Quarkus will automatically use Byte Buddy to generate static proxies for you, based on the configuration of your application.