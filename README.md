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
- proxy: 静态代理、动态代理
- JsonUtils: jackson的json的使用
- TreeUtils: 树构建与解析
- ListUtils: 排序
- CommonUtils: 字符串长度校验、BigDecimal转换String长度校验
- Base64Utils: Jdk Base64 编码解码
- RsaUtils: RSA 非对称加密解密
- AesUtils: AES 对称加密解密
- DataTypeUtils: 字符串转byte[32], byte[32]转字符串

***

#### code-blocks-spring
> 版本：0.1.1

- spring框架读取配置文件
- cglib生成POJO

***

#### code-blocks-springboot
> 版本：0.1.1

- aspect: 实现日志拦截

***