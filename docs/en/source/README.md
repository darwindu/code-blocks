#Code block

Provide various component demonstrations, written in the form of code blocks; Use Multi Project Schema



###Project Structure



```sh

|--Code blocks: root project, no code is written, only all subprojects are integrated

|--Code blocks common:: general module

|--Code blocks spring:: based on spring general module

|--Code blocks spring boot:: based on spring boot general module

```




###New features



#### code-blocks

>Version: 0.1.4



-Add gradle.properties file to handle general version



#### code-blocks-common

>Version: 0.1.2



-Definition of exception class

-Use of Juint

-Definition of Enumeration

- rpc

- cglib. Jdk: jdk dynamic proxy, implementing the interface InvocationHandler

- cglib. Cglib: cglib dynamic proxy, implementing the interface MethodInterceptor

- cglib. Demo: static proxy and dynamic proxy demo

-JsonUtils: Use of Jason's json

-TreeUtils: tree construction and parsing

-ListUtils: Sort

-CommonUtils: string length verification, BigDecimal conversion String length verification

-Base64Utils: Jdk Base64 encoding and decoding

-RsaUtils: RSA asymmetric encryption and decryption

-AesUtils: AES symmetric encryption and decryption

-DataTypeUtils: string to byte [32], byte [32] to string



>Version: 0.1.2

-PropertyUtils: Read configuration file

-JsonUtils: Update the configuration used by jackson and initialize variables



>Version: 0.1.3

-ThreadPoolUtils: Use of thread pool

-JsonUtils: Add generic conversion





#####Differences between jdk dynamic proxy and cglib dynamic proxy

>The dynamic proxy mechanism of JDK can only proxy interface classes, and non interface classes cannot implement the dynamic proxy of JDK. Its principle is to use Proxy The proxy object created by newProxyInstance is an object dynamically generated at the jvm runtime. It is not our InvocationHandler type or the type of the set of interfaces we define, but an object dynamically generated at runtime. The naming method is the same, starting with $, "proxy" in the middle, and the last number represents the label of the object;



>Cglib implements proxies for classes. Its principle is to generate a subclass of the specified target class and override its method implementation enhancements. However, because it uses inheritance, it cannot proxy final modified classes;



***



#### code-blocks-spring

>Version: 0.1.1



-Spring Framework Read Configuration File

-Spring cglib generates POJOs



***



#### code-blocks-springboot

>Version: 0.1.1



-Aspect: log interception

-Implement the CommandLineRunner interface: perform a class of operations after startup

-Implement ApplicationContextAware interface: get beans by getting context

-Implement scheduled tasks

-Spring boot uses the following two methods to load spring xml files

- @ImportResource(locations={"classpath:codeBolcksSpringbootApplicationContext.xml"})

-ClassPathXmlApplicationContext method, see BaseServiceImpl.java of code blocks spring



>Version: 0.1.3

-HttpAspect: optimize aop logs

-CommonExceptionHandler: add aop exception handling

-@ Valid @ Validated: increase the verification usage

-Mybatis: add mybatis database field to transfer to hump



>Version: 0.1.4

-HttpFilter: request interception filter, handling cross domain in gateway mode

-CrosConfig: universal cross domain processing



#### code-blocks-springboot-jdbc

>Version: 0.1.1



-Add, delete, modify and query Mybatis



#### code-blocks-designpattern

>Version: 0.1.1



<table class="mytable">

<tr align="left">

<th>S/N</th>

<th>Mode&Description</th>

<th>including</th>

</tr>

<tr>

<td>1</td>

<td>

<b>Creation mode</b><br>

These design patterns provide a way to hide the creation logic while creating objects,<br>

Instead of using the new operator to directly instantiate the object< br>

This makes the program more flexible in determining which objects need to be created for a given instance< br>

</td>

<td>

Factory Pattern<br>

Abstract Factory Pattern<br>

Singleton Pattern<br>

Builder Pattern<br>

Prototype Pattern

</td>

</tr>

<tr>

<td>2</td>

<td>

<b>Structural mode</b><br>

These design patterns focus on the combination of classes and objects< br>

The concept of inheritance is used to combine interfaces and define how composite objects can obtain new functions< br>

</td>

<td>

Adapter Pattern<br>

Bridge Pattern<br>

Filter, Criteria Pattern

Composite Pattern

Decorator Pattern<br>

Facade Pattern<br>

Flyweight Pattern

Proxy Pattern<br>

</td>

</tr>

<tr>

<td>3</td>

<td>

<b>Behavioral mode</b><br>

These design patterns pay particular attention to communication between objects< br>

</td>

<td>

Chain of Responsibility Pattern

Command Pattern<br>

Interpreter Pattern<br><br>

Iterator Pattern<br>

Mediator Pattern

Memo Pattern

Observer Pattern<br>

State Pattern<br>

Null Object Pattern<br>

Strategy Pattern<br>

Template Pattern<br>

Visitor Pattern<br>

</td>

</tr>

<tr>

<td>4</td>

<td>

<b>J2EE pattern</b><br>

These design patterns pay particular attention to the presentation layer. These patterns are qualified by Sun Java Center< br>

</td>

<td>

MVC Pattern<br>

Business Delegate Pattern<br>

Composite Entity Pattern<br>

Data Access Object Pattern<br>

Front Controller Pattern<br>

Intercepting Filter Pattern<br>

Service Locator Pattern<br>

Transfer Object Pattern<br>

</td>

</tr>

</table>



#### code-blocks-springboot-security

>Version: 0.1.1



-New



#### code-blocks-springboot-eureka

>Version: 0.1.1



-New



#### code-blocks-springboot-eureka-article

>Version: 0.1.1



-New



#### code-blocks-springboot-eureka-discovery

>Version: 0.1.1



-New