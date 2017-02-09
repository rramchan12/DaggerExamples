# DaggerExamples

# Project Title

[Dagger2](https://google.github.io/dagger/) is a fully static, compile-time dependency injection framework for both Java and Android. It is an adaptation of an earlier version created by Square and now maintained by Google.

The below repository has two starter module which demonstrate Method Injection, Constructor Injection and Field Injection in Dagger



### Why

I personally found the sample [coffee sample](https://github.com/google/dagger/tree/master/examples/simple/src/main/java/coffee) not the ideal place to start. 
So I put up the below two samples. I would start with these samples after reading the Dagger 2 documentation


#### DaggerAPIInjector

A step by step example. I am a big fan of Vogellas tutorials, but at the time of writing his example on Dagger was broken. I fixed it and have uploaded the code here. 

The original code and explanationi is available here [Vogella Dagger Example](http://www.vogella.com/tutorials/Dagger/article.html)

#### DaggerCar

The classic DI Car example. We compose a Car using Dagger. I faced some problems here, and maybe I hit a bug. Refer to [StackOverflow](http://stackoverflow.com/questions/42088929/dagger2-basics-field-injection-not-working/42102936#42102936) for  documentation regarding the implementation. 

## Acknowledgments

* Vogella 
* Pls give credit if reused
