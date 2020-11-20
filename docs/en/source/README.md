# Code block
Provide various component demos written in code blocks; use multi-project architecture

### Project Structure

```sh
|--code-blocks::root project, do not write any code, just integrate all subprojects
             |--code-blocks-common::General Module
             |--code-blocks-spring::based on spring universal module
             |--code-blocks-springboot::based on springboot universal module
```


### New Features

#### code-blocks-common
> Version: 0.1.1

- Definition of exception classes
- Use of Juint
- definition of enumeration
- rpc
- cglib.jdk: jdk dynamic proxy, implement interface InvocationHandler
- cglib.cglib: cglib dynamic proxy, implementation ie interface MethodInterceptor
- cglib.demo: static proxy, dynamic proxy demo
- JsonUtils: The use of jackson's json
- TreeUtils: Tree Construction and Parsing
- ListUtils: Sort
- CommonUtils: String length check, BigDecimal conversion String length check
- Base64Utils: Jdk Base64 codec
- RsaUtils: RSA asymmetric encryption and decryption
- AesUtils: AES symmetric encryption and decryption
- DataTypeUtils: string to byte[32], byte[32] to string

> Version: 0.1.2
- PropertyUtils: Read configuration file
- JsonUtils: Update the configuration used by jackson, initialize variables

> Version：0.1.3
-ThreadPoolUtils: the use of thread pool
-JsonUtils: add generic conversion


##### jdk dynamic proxy and cglib dynamic proxy difference
> JDK's dynamic proxy mechanism can only proxy interface classes. Non-interface classes cannot implement JDK dynamic proxy. The principle is that the proxy object created by Proxy.newProxyInstance is an object dynamically generated during jvm runtime. It is not us. The type of InvocationHandler is not the type of the interface we defined, but an object dynamically generated at runtime, and the naming method is such that it starts with $, "proxy" is in the middle, and the last number represents the object. Label

> cglib is a proxy for the class, its principle is to generate a subclass of the specified target class, and override the method implementation enhancement, but because of the inheritance, you can not proxy the final modified class;

***

#### code-blocks-spring
> Version: 0.1.1

- spring frame read configuration file
- spring cglib generates POJO

***

#### code-blocks-springboot
> Version: 0.1.1

- aspect: implements log interception
- Implement the CommandLineRunner interface: perform a type of operation after startup
- Implement the ApplicationContextAware interface: get the bean by getting the context
- Implement timing tasks
Springboot load spring xml file please use the following two ways
  - @ImportResource(locations={"classpath:codeBolcksSpringbootApplicationContext.xml"})
  - ClassPathXmlApplicationContext method, see code-blocks-spring's BaseServiceImpl.java