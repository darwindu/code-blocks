# 代码块
提供各种组件演示，以代码块的形式编写；使用多项目架构

### 项目结构

```sh
|--code-blocks::根项目, 不写任何代码,仅仅整合所有子项目
             |--code-blocks-common::通用模块
             |--code-blocks-spring::基于spring通用模块
             |--code-blocks-springboot::基于springboot通用模块
```


### 新特性

#### code-blocks-common
> 版本：0.1.2

- 异常类的定义
- Juint的使用
- 枚举的定义
- rpc
- cglib.jdk: jdk动态代理，实现接口InvocationHandler
- cglib.cglib: cglib动态代理，实现即接口MethodInterceptor
- cglib.demo: 静态代理、动态代理demo
- JsonUtils: jackson的json的使用
- TreeUtils: 树构建与解析
- ListUtils: 排序
- CommonUtils: 字符串长度校验、BigDecimal转换String长度校验
- Base64Utils: Jdk Base64 编码解码
- RsaUtils: RSA 非对称加密解密
- AesUtils: AES 对称加密解密
- DataTypeUtils: 字符串转byte[32], byte[32]转字符串

> 版本：0.1.2
- PropertyUtils: 读取配置文件
- JsonUtils: 更新jackson使用的配置，初始化变量

> 版本：0.1.3
- ThreadPoolUtils: 线程池的使用
- JsonUtils：增加泛型转换



##### jdk动态代理与cglib动态代理区别
> JDK的动态代理机制只能代理接口类，而非接口类无法实现JDK的动态代理，它的原理是通过 Proxy.newProxyInstance 创建的代理对象是在jvm运行时动态生成的一个对象，它并不是我们的InvocationHandler类型，也不是我们定义的那组接口的类型，而是在运行时动态生成的一个对象，并且命名方式都是这样的形式，以$开头，"proxy"在中间，最后一个数字表示对象的标号；

> cglib是针对类来实现代理的，它的原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理；

***

#### code-blocks-spring
> 版本：0.1.1

- spring框架读取配置文件
- spring cglib生成POJO

***

#### code-blocks-springboot
> 版本：0.1.1

- aspect: 实现日志拦截
- 实现CommandLineRunner接口：启动后执行一类操作
- 实现ApplicationContextAware接口：通过获取context取得bean
- 实现定时任务
- springboot加载spring的xml文件请使用以下两种方式
  - @ImportResource(locations={"classpath:codeBolcksSpringbootApplicationContext.xml"})
  - ClassPathXmlApplicationContext方法，见code-blocks-spring的BaseServiceImpl.java

  #### code-blocks-designpattern
  > 版本：0.1.1

  <table class="mytable">
    <tr align="left">
      <th>序号</th>
      <th>模式&描述</th>
      <th>包括</th>
    </tr>
    <tr>
      <td>1</td>
      <td>
      <b>创建型模式</b><br>
      这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，<br>
      而不是使用 new 运算符直接实例化对象。<br>
      这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。<br>
      </td>
      <td>
      工厂模式（Factory Pattern）<br>
      抽象工厂模式（Abstract Factory Pattern）<br>
      单例模式（Singleton Pattern）<br>
      建造者模式（Builder Pattern）<br>
      原型模式（Prototype Pattern<br>
      </td>
    </tr>
    <tr>
      <td>2</td>
      <td>
      <b>结构型模式</b><br>
      这些设计模式关注类和对象的组合。<br>
      继承的概念被用来组合接口和定义组合对象获得新功能的方式。<br>
      </td>
      <td>
      适配器模式（Adapter Pattern）<br>
      桥接模式（Bridge Pattern）<br>
      过滤器模式（Filter、Criteria Pattern）<br>
      组合模式（Composite Pattern）<br>
      装饰器模式（Decorator Pattern）<br>
      外观模式（Facade Pattern）<br>
      享元模式（Flyweight Pattern）<br>
      代理模式（Proxy Pattern）<br>
      </td>
    </tr>
    <tr>
      <td>3</td>
      <td>
      <b>行为型模式</b><br>
      这些设计模式特别关注对象之间的通信。<br>
      </td>
      <td>
      责任链模式（Chain of Responsibility Pattern）<br>
      命令模式（Command Pattern）<br>
      解释器模式（Interpreter Pattern）<br><br>
      迭代器模式（Iterator Pattern）<br>
      中介者模式（Mediator Pattern）<br>
      备忘录模式（Memento Pattern）<br>
      观察者模式（Observer Pattern）<br>
      状态模式（State Pattern）<br>
      空对象模式（Null Object Pattern）<br>
      策略模式（Strategy Pattern）<br>
      模板模式（Template Pattern）<br>
      访问者模式（Visitor Pattern）<br>
      </td>
    </tr>
    <tr>
      <td>4</td>
      <td>
      <b>J2EE 模式</b><br>
      这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。<br>
      </td>
      <td>
      MVC 模式（MVC Pattern）<br>
      业务代表模式（Business Delegate Pattern）<br>
      组合实体模式（Composite Entity Pattern）<br>
      数据访问对象模式（Data Access Object Pattern）<br>
      前端控制器模式（Front Controller Pattern）<br>
      拦截过滤器模式（Intercepting Filter Pattern）<br>
      服务定位器模式（Service Locator Pattern）<br>
      传输对象模式（Transfer Object Pattern）<br>
      </td>
    </tr>
  </table>