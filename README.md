# Dependency Injection with Hilt

Dependency injection (DI) is a technique widely used in programming and well suited to Android development, where dependencies are provided to a class instead of creating them itself. By following DI principles, you lay the groundwork for good app architecture, greater code reusability, and ease of testing.

<br>

The hilt is a dependency injection (DI) framework based on Dagger. So, anyone who used Dagger in the past will have an easy time learning to use Hilt for Android development.

<br>

<h3>Constructor and Field Injection</h3>
If the dependency is passed to the class, it can be done in two ways. With constructor and field injection.

<br>

<h3>1. Constructor Injection</h3>
The class contains constructor preferences input, which becomes the field of the class. A class instance is directly passed to the class’s constructor to create a new instance. This is called constructor injection. 

<br>

<h3>2. Field Injection</h3>
The field injection is handy during class inheritance, which we do not possess from Android like Activity, Service, Fragment, View and others. The Android activity is initialized within the system, but Hilt can provide all necessary dependencies.

<br>

<h3>Hilt modules</h3>
The modules are sources of the required class instances for classes which depend on them. Sometimes, you miss ownership of the class, or the third party library gives you an interface to inherit, but no specific implementation, or the creation of the instance does not have an empty constructor. The modules create space for objects to construct instances and pass them to Hilt to figure out where to put them without much of the code. There are two variants: module and binding.

<br><br>

Author - Amir
