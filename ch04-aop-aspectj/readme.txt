ch04-aop-aspectj:使用aspectj框架实现aop。
使用aop：目的是给已经存在的类和方法增加额外的功能。前提是不改变原来的类的代码。

使用aspectJ框架的基本步骤：
1.新建maven项目
2.加入依赖
    spring依赖
    aspectj依赖
    junit单元测试
3.创建目标类：接口和他的实现类
  要做的是给类中的方法增加功能
4.创建切面类：普通类
  1) 在类的上面加入@Aspect
  2) 在类中定义方法，方法就是切面要执行的功能代码
     在方法的上面加入aspectj中的通知注解，例如@Before
     需要指定切面表达式execution（）
5.创建spring的配置文件：声明对象，把对象统一交给容器管理
  声明对象可以使用注解方式或者xml配置文件中的<bean>标签
  1)声明目标对象
  2)声明切面类对象
  3)声明aspectj框架中的自动代理生成器标签。
    自动代理生成器：用来完成代理对象的自动创建功能的。
6.创建测试类，从spring容器中获取目标对象（实际上就是代理对象）
  通过执行代理方法，实现aop的功能增强。