ch02-di-xml:在spring的配置文件中，给Java对象的属性赋值

di:依赖注入，表示创建对象，给属性赋值

DI的实现有两种：
1.在Spring配置文件中，使用标签和属性完成，叫做基于XML的di实现。
2.使用Spring的注解，完成属性赋值，叫做基于注解的di实现。

DI的语法分类：
1.set注入（设值注入）：spring调用类的set方法，用set方法实现属性的赋值（80%）。
2.构造注入，Spring调用类的有参构造方法创建对象，在构造方法中完成赋值。

实现步骤：
1.创建maven项目
2.加入maven的依赖
    spring的依赖，5.2.5版本
    junit依赖
3.创建类（接口和它的实现类）
    和没有使用框架一样，就是普通的类
4.创建spring需要使用的配置文件
    声明类的信息，这些类由spring创建和管理
    通过Spring的语法，完成属性的赋值
5.测试spring创建的类