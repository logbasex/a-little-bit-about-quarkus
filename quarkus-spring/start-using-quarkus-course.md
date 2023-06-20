# [Start using Quarkus: the Supersonic Subatomic Java toolkit](https://www.udemy.com/course/quarkus-starting-with-quarkus/)

- manage profiles

## So what is Quarkus?

Let's go to the Quarkus website, Quarkus dot io, and look at the first sentence at the very top.

Quarkus is said to be "Supersonic Subatomic Java".

Catchy sentence, isn't it ? To be honest, I quite like it because supersonic gives you the impression of speed.

As you will see, Quarkus is fast to work with.

So as a developer, it's very fast, you change some code, it compiles automatically and you know, you can test your code immediately.

So as a developer, it's a much faster way to iterate through coding and testing.

But also, speed in terms of executables, when you build an executable jar with Quarkus or an executable binary with GraalVM, the time to first response is very fast, way faster than other Java frameworks.

Then comes subatomic.

Subatomic gives you the sensation of size, uh, atomic, you know, so you can think that everything is small and yes, indeed it is.

When you build an executable jar, the size of the binary is way smaller, shorter than other Java toolkits and also it consumes less memory.

SoQuarkus is very well optimized in terms of resource consumption.

Then you have a second sentence on the same quarks.io website.

It's a bit longer and it goes "Quarkus is a Kubernetes Native Java stack tailored for OpenJDK Hotspot and GraalVM, crafted from the best of breed Java libraries and standards.

So, yes, it is also a catchy sentence.

It's slightly longer than the first one and it means several things.

Kubernetes Native.

We won't be using Kubernetes in this course.

That means that you can use Quarkus without Kubernetes, but it comes with Kubernetes in mind.

As you will see, when we generate a project, it comes with Docker files, so it's very, you know, the way we can create and build and run Docker images with Quarkus is very easy.

The same goes with Kubernetes.

So we won't be doing that discourse.

But keep in mind that what we will be doing with Docker is as easy to do with Kubernetes.

Then comes this Java stack, tailored for open JDK hotspot and GraalVM. The order here is very important,

Hotspot first,

GraalVM second.

We will build a native binary with GraalVM, and as you will see, it's quite amazing,

we have very small binaries that run very fast. But the same is true with HotSpot.

Quarkus has a few tricks to make your application run faster with HotSpot than any other Java framework,

GraalVM is just one step further, but HotSpot comes first.

Then the sentence ends with "crafted from the best of breed Java libraries and standards."

Yes, Quarkus is quite new, it has been created a few years ago.

But it integrates with very well-known Java libraries that have been there for decades.

So if you don't know Quarkus, but you are familiar with one of those libraries, then it will be very easy to use Quarkus and build an application.

It's not like you have to learn everything again.

And standards, because, yes, it implements a few standards, the macro profile, JPA and so on.

What else is Quarkus ? First of all, as I said, it was created in late 2018.

It's open source, it's very important to mention that, and it is backed by the company Red Hat.

As you might know, Red Hat, that is the company behind Red Hat Enterprise Linux, JBoss, EAP,

Hibernate, Vertex.

All these tools are open source andQuarkus is one of them.

Quarkus is said to be Java toolkits, so sometimes you read Java toolkit, Java Framework, Java runtime server, it's a bit of all that.

You know, you have Quarkus APIs and other Quarkus runtime.

But because it's a bit of all that, we tend to say that Quarkus is a Java toolkit because it does a little bit of all these things.

You might also read here in there that Quarkus is good for microservices, for functions, for reactive systems.

Yes, it's true, but Quarkus is good for any kind of application we will be building a REST endpoint, you could build applications to access data or so on. It's not only meant for microservices or functions

or reactive system.

Let's talk a little bit about extensions.

If you look at the internal of Quarkus, the core of Quarkus is very small because everything else is an extension. You have several kind of extensions, the ones supported by the Quarkus team, which are bundled with Quarkus, but also you have a set of extensions that are maintained by the community.

And you can always create your own extension, so it integrates well with Quarkus.

As an example, you have Eclipse Vert.x or microprofile, Spring, Hibernate, RestEasy, Apache Camel.

All that are extensions such as Kubernetes.

So even if Kubernetes is a first class citizen in Quarkus, it's just another extension.

OpenShift, Jaeger, Prometheus, Apache Kafka, very important when you have a reactive systems and messaging, and Netty for the not blocking IO.

Check VM:
```shell
java -XshowSettings:properties -version
```

