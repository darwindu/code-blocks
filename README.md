# 代码块
提供各种组件，以代码块的形式编写；使用多项目架构

### 项目结构

```$xslt
|--code-blocks::根项目, 不写任何代码,仅仅整合所有子项目
             |--code-blocks-common::通用模块
             |--code-blocks-spring::基于spring通用模块
             |--code-blocks-springboot::基于springboot通用模块
```


### 新特性

#### code-blocks-common
> 版本：0.1.1

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
- springboot加载spring的xml文件请使用ClassPathXmlApplicationContext方法，见code-blocks-spring的BaseServiceImpl.java

***