# Java面试宝典


# JavaCore

## 1.面向对象和面向过程的区别？
- 面向过程，程式化的套路（作文，总分总，分总结构），按照计算机的思路来编程
- 面向对象，按照人能够理解的思路来编程。每个人对类和对象的理解是不同的，需要统一思想，达成共识

## 2.如何理解面向对象？它有哪些特征？
1. 面向对象OOP，一切皆为对象，它是对现实世界中的具体对象进行归纳总结划分类别。面向对象主要关注对象以及对象之间的协作关系，它是以人可以理解的思维方式来解决软件系统中的业务问题。
2. 面向对象有以下特征：  
    抽象性：对具体对象进行归纳总结，划分类别。  
    封装性：把对象的属性和行为绑定在一起，对外以对象的形式展现，它是一种信息隐藏技术。  
    继承性：子类继承父类，子类可以当做父类来使用，它是一种代码复用技术。  
    多态性：多种行为，多种状态。包含参数化多态（重载）和运行时多态（重写）。  
    唯一性：每个对象唯一身份标识，用来区分不同的对象。

## 3.如何进行抽象？
 - 划分类别（对象归类）
 - 找特征 （数据抽象）
 - 找行为 （过程抽象）

## 4.Java数据类型有哪些？每种类型占几个字节？每种数据类型的默认值？

- 分两种：基本类型 引用类型
- 基本数据类型，包括byte[1]，short[2],int[4],long[8],float[4],double[8],boolean,char[2]
- 引用数据类型，包括class，enum，interface,array

## 5. 流程控制语句有几种？
- 顺序语句，从上到下，从左到右，按照程序既定顺序执行
- 条件语句（分支语句、选择语句），包含if..else ,if...else if..,switch...case...
- 循环语句（迭代语句）包含while循环，do...while循环，for循环，foreach循环  
``
注意continue和break含义
`` 
## 6.Switch使用那些类型？
- char，byte,short,int,enum(枚举)，String
## 7. 重载和重写有什么区别？
- 重载：同一类中，方法名相同，参数列表不同（类型，个数，顺序），与返回值类型无关
- 重写：父子类中，方法名相同，参数列表完全相同，权限修饰符相同（子大于父）
## 8.Java序列化、反序列化是什么意思？如何实现序列化？为什么要序列化？
- 序列化：把对象转化成字符串序列的过程，反序列化：把字节序列恢复为Java对象的过程
- 实现Serializable接口，实现Externalnalizable接口
- 数据的持久化，数据保存到物理硬盘，数据在网络上传输

## 9.如何理解static？
    static静态的，可以修饰方法，属性，静态块，类的所有对象共享static变量和方法，独立于对象，类专属使用，通过类来调用。

## 10.如何理解final？
    最终，一份，定义类不能被继承，定义方法不能被覆盖，定义变量不能被改变
## 11.==和equals有什么区别？
1.==可用于基本类型又可用于引用类型，equals只能用户引用类型

2.一般情况下==比较引用地址，equals比较内容主要看类是否实现Object的equals和hashcode方法  

* 自定义类没有实现equals和hashcode方法，==和equals都比较的是引用地址
* 自定义类已经实现equals和hashcode方法，==比较引用地址，equals比较内容  

3.基本类型的包装类型
    Byte,Short,Integer,Long,Character,Boolean实现常量池技术，在byte区间[-128,127]使用常量池，超过常量池失效
4.String字符串类型，实现了常量值
5.String类型和部分基本类型的包装类型，实现常量池技术，比较内容和地址一致
    
## 12.抽象类和接口有什么区别？
抽象类：包含抽象方法的类，不能被实例化；可以有常量，有部分实现方法，部分定义未实现方法。  
接口：可理解为抽象的抽象类，比抽象类抽象级别更高，是一种标准、规范，有定义无实现；jdk8接口方法默认实现，必须加default关键字；

## 13. Java可以实现多继承吗？如果有怎么实现？
    一般情况下，Java是单继承多实现；可以侧面实现多继承，接口继承多个接口。
## 14. String是基本数据类型吗？String可以被继承吗？
    不是，不可以被继承，因为它是final的。
## 15. 说说常用的日期类？
    Date、DateFormat、SimpleDateFormat、Calendar、LocalDate、LocalTime、LocalDateTime

## 16. Java的IO流分几种？有哪些常用类？
流的方向：输入流、输出流；流的数据单位：字节流、字符流
常用类：File、InputStream、FileInputStream、OutputStream、FileOutputStream、Reader、FileReader、Writer、FileWriter..
## 17. List和Set有什么区别？
1. 结构：List 中存储的数据是有顺序,并且允许重复;Set 中存储的数据是无
序的,且不允许有重复,但元素在集合中的位置由元素的 hashcode 决定,位置是固定的(Set 集合根据 hashcode 来进行数据的存储,所以位置是固定的,但是位置不是用户可以控制的,所以对于用户来说 set 中的元素还是无序的)
2. 实现类：List接口有三个实现类(LinkedList:基于链表实现,链表内存是散乱的,每一个元素存储本身内存地址的同时还存储下一个元素的地址。链表增删快,查找慢;ArrayList:基于数组实现,非线程安全的,效率高,便于索引,但不便于插入删除;Vector:基于数组实现,线程安全的,效率低)；Set 接口有两个实现类(HashSet:底层是由 HashMap 实现,不允许集合中有重复的值,使用该方式时需要重
写 equals()和 hashCode()方法;LinkedHashSet:继承与 HashSet,同时又基于 LinkedHashMap 来进行实现,底层使用的是 LinkedHashMp)。
3. List 集合中对象按照索引位置排序,可以有重复对象,允许按照对象在集合中的索引位置检索对象,例如通过
list.get(i)方法来获取集合中的元素;Set 集合中的对象不按照特定的方式排序,并且没有重复对象,但它的实现类能对集合中的对象按照特定
的方式排序,例如 TreeSet 类,可以按照默认顺序,也可以通过实现 Java.util.Comparator<Type>接口来自定义排序方式。
## 18. ArrayList跟LinkedList区别，还有Vector？
ArrayList:
　　底层数据结构是数组，查询快，增删慢。  
　　线程不安全，效率高。    
Vector:  
　　底层数据结构是数组，查询快，增删慢。
　　线程安全，效率低。  
Vector相对ArrayList查询慢(线程安全的)
Vector相对LinkedList增删慢(数组结构)  
LinkedList:
　　底层数据结构是链表，查询慢，增删快。
　　线程不安全，效率高。

## 19. HashMap和Hashtable的区别？List和Map区别？
1. HashMap 是线程不安全的,HashMap 是一个接口,是 Map 的一个子接口,是将键映射到值得对象,不允许键值重复,允许空键和空值;由于非线程安全,HashMap 的效率要较 HashTable 的效率高一些.  
HashTable 是线程安全的一个集合,不允许 null 值作为一个 key 值或者 Value 值;  
HashTable 是 sychronize,多个线程访问时不需要自己为它的方法实现同步,而 HashMap 在被多个线程访问的时候需要自己为它的方法实现同步;
2. List-map区别
    1. 结构：List是存储单列数据的集合，Map是存储键和值这样的双列数据的集合；list中存储的数据是有顺序的，且允许重复，map中存储的数据是没有顺序，且键不能重复，值可以重复；
    2. 实现类：List接口有三个实现类(LinkedList:基于链表实现,链表内存是散乱的,每一个元素存储本身内存地址的同时还存储下一个元素的地址。链表增删快,查找慢;ArrayList:基于数组实现,非线程安全的,效率高,便于索引,但不便于插入删除;Vector:基于数组实现,线程安全的,效率低)；map接口有三个实现类(HashMap:基于 hash 表的 Map 接口实现,非线程安全,高效,支持 null 值和 null键;HashTable:线程安全,低效,不支持 null 值和 null 键;LinkedHashMap:是 HashMap 的一个子类,保存了记录的插入顺序;SortMap 接口:TreeMap,能够把它保存的记录根据键排序,默认是键值的升序排序)
    3. List 集合中对象按照索引位置排序,可以有重复对象,允许按照对象在集合中的索引位置检索对象,例如通过list.get(i)方法来获取集合中的元素;Map 中的每一个元素包含一个键和一个值,成对出现,键对象不可以重复,值对象可以重复;

## 20. Map有什么特点？
1. Map 中存储的数据是没有顺序的,其键是不能重复的,它的值是可以有重复的
2. Map 接口有三个实现类(HashMap:基于 hash 表的 Map 接口实现,非线程安全,高效,支持 null 值和 null键;HashTable:线程安全,低效,不支持 null 值和 null 键;LinkedHashMap:是 HashMap 的一个子类,保存了记录的插入顺序;SortMap 接口:TreeMap,能够把它保存的记录根据键排序,默认是键值的升序排序)。
## 21. 所有集合类的父类/父接口是Collection吗？
不是，是Object，Collection只包含List和Set，不包含Map
## 22. 数据有没有length方法？字符串有没有length方法？
数组只有length属性，字符串有length方法
## 23. Error和Exception有什么区别？
error是系统中的错误，程序员是无法改变处理的，是在编译是发生的错误，只能通过修改程序才能改正。一般与虚拟机相关，如虚拟机错误、系统崩溃、内存空间不足等问题。对于这类错误导致的应用程序中断，仅靠程序本身是无法恢复的。

exception表示的是程序可以处理的异常，可以捕获且可能恢复，遇到这类异常应该对异常进行捕获处理，使程序恢复运行。

exception又可以分为checkedException和uncheckedException。



## 24. CheckedException和UncheckedException有什么区别？
checkedException是我们常用try--catch捕获的异常，程序在编译时系统会强制我们对异常进行try--catch或者throws。

uncheckedException又称为runtimeException，是程序在运行时出现的异常，我们无法捕获，常见的有空指针异常，下标越界等


## 25. Throw和throws有什么区别？
throw:
1) throw 语句用在方法体内,表示抛出异常,由方法体内的语句处理。  
2) throw 是具体向外抛出异常的动作,所以它抛出的是一个异常实例,执行 throw 一定是抛出了某种异常。  

throws:    
1) throws 语句是用在方法声明后面,表示如果抛出异常,由该方法的调用者来进行异常的处理。  
2) throws 主要是声明这个方法会抛出某种类型的异常,让它的使用者要知道需要捕获的异常的类型。  
3) throws 表示出现异常的一种可能性,并不一定会发生这种异常。  
 
## 26. Final、finally、finalize有什么区别？
final是Java中的一个修饰符关键字，被final修饰的类不可被继承，被修饰的变量不可被修改，被修饰的方法不能被重写。

finally是try--catch异常处理块中的一部分，无论try中是否捕获了异常，finally部分都会被执行，除非down机，一般用于资源关闭。

finalize是object中的一个方法，这个方法会在gc垃圾回收时才会调用到。



## 27. 进程和线程有什么区别？Java实现多线程有哪些方法？
一个程序至少包含一个进程，一个进程可以包含多个线程。
进程：进程有独立的地址空间，可以单独运行
线程：是一个进程中的不同执行路径，线程之间没有单独的地址空间；线程不能够单独执行，它必须运行在处于活动状态的应用程序进程中
Java实现多线程的两种方法：实现Runnable接口、继承Thread类
## 28. Java多线程的生命周期？
创建状态：new操作符创建一个新的线程对象，一个空的线程对象，系统不为它分配资源  
就绪状态：执行线程的start()方法，等待操作系统调度分配必须的系统资源（时间片），排队等待，此时线程并未运行  
运行状态：线程得到系统的时间片资源，运行线程的run()方法  
终止状态：线程运行完成，释放资源，线程终止  
阻塞状态：线程进入运行状态中执行sleep/join/wait方法，线程进入阻塞状态。  
线程装换：
阻塞状态中执行notify/notifyAll方法，阻塞结束，线程进入就绪状态  
运行状态执行yield方法，线程进入就绪状态
## 29. 什么是死锁？如何避免死锁？
死锁：并发运行的多个线程间彼此等待对方锁定的临界资源、都无法运行的状态。线程之间互相调用对方，不能释放资源  
避免死锁：在方法或语句块中加关键字synchronized
## 30. 堆和栈有什么区别？
堆：先进先出，Java中存放对象，数组；有点：动态地分配内存大小；缺点：运行时动态分配内存，存取速度较慢  
栈：先进后出，Java中堆存储的是基本类型、对象引用、方法形参；优点存取速度快；缺点：栈中的数据大小与生存期必须确定，缺乏灵活性
## 31. 值传递和引用传递？
值传递：参数传递的是基本数据类型，传递的是实参值的副本。传递前后变量的值不变  
引用传递：参数传递的是引用数据类型，传递的是实参的引用。传递前后变量（对象）的值会改变

## 32. 权限修饰符有哪些？各代表什么意思？
public、protected、default、private
1. public：所有的类都可以访问。
2. private：只有在同一个类中才可以访问。
3. protected：同一个类中、同一个包中、子类中都可以访问
4. 包类型的，即默认类型 同一个类中、同一个包中可以访问到

## 33. Jdk1.5+的新特性？
- 泛型
- 注解
- 可变参数
- 静态导入
- 默认实现
- Lambda表达式
## 34. Collection和Collections的区别？
* collection是一个接口接口接口。他抽取出各种集合<继承List和Set>的主要功能,并做出统一行为规范。

他是很多集合的祖辈接口，没错父辈接口是List和Set。

* Collections是一个工具类。工具类是工具，就像Math，Arrays类一样，他是一种工具，集成了很多特定的功能。

* 比如排序，拷贝，替换，反转等等等功能。工具类不能被实例化。 工具类使用方式：类名.方法名()

总体来说：collection是接口  ， collections是工具类


## 35. Java解析xml有几种方式？
1. Sax 基于事件模型，一次性解析，边加载到内存边读取，解析效率高，生成xml文件比较繁琐
2. Dom 整个xml文件的以dom树结构到内存中，可以树结构进行上下导航操作，前期加载花费时间较多
3. jdom Java特定文档模型，jdom仅使用具体类而不使用接口，性能高于dom 
4. Dom4j 前期是jdom的一个分支，Dom4j使用接口和抽象基本类方法，具有性能优异、功能强大和极端易使用的特点，性能最高

## 36. 垃圾回收是什么意思？有哪些回收算法？有哪些垃圾收集器？
垃圾回收：  
    Java虚拟机（jvm）回收那些不再被引用的对象内存的过程。一般我们认为正在被引用的对象状态为“alive”，而没有被应用或者取不到引用属性的对象状态为“dead”。垃圾回收是一个释放处于“dead”状态的对象的内存的过程。而垃圾回收的规则和算法被动态的作用于应用运行当中，自动回收。垃圾回收一般采用分代回收策略：Young（年轻代）、Tenured(年老代)、Perm（持久代）  
回收算法：  
1. Mark-Sweep（标记-清除）算法
2. Coping （复制）算法
3. Mark-Compact（标记-整理）算法
4. Generational Collection（分代收集）算法  

垃圾回收器：
1. Serial/Seril Old
2. PparNew
3. Parallel Scavenge
4. Parallel Old
5. CMS
6. G1

## 37. Socket是什么意思？Java如何实现socket编程？
定义：  
> 网络上两个程序通过一个双向的通信连接实现数据的交换，这个连接的一端称为一个socket，即套接字；点对点的通信每个socket必须提供协议、地址和端口号  

Java socket：
>Socket类 根据服务器的IP地址和端口号实现客户端套接字  
>ServerSocket类：服务器套接字。服务器套接字提供IP地址和端口号等待请求网络传入。


# WEBCore

## 1. 说几个HTML5用到的标签？
article（标题）、audio（音频）、header、video

## 2. HTML5中如何使用css?
- 链接标签 < link href=”filename.css” rel=”stylesheet”>
- 样式标签 style
- 内联样式参数

## 3. Html5中如何使用JavaScript？
```
<script>
alert("My First JavaScript");
</script>
```


## 4. 什么是jQuery？
jQuery就是javascript的一个库，把我们常用的一些功能进行了封装，方便我们来调用，提高我们的开发效率。

极大地简化了 JavaScript 编程。

## 5. Jquery如何获取表单控件的值（文本框、单选、多选、下拉、文本域等）？
```
文本框，文本区域：$("#txt").attr("value")； 
多选框checkbox：$("#checkbox_id").attr("value")； 
单选组radio： $("input[@type=radio][@checked]").val(); 
下拉框select： $('#sel').val(); 
```

## 6. Jquery的常用选择器有那些？

```
1. id选择器
　　<div id="myDiv”>myDiv</div> 据元素的id属性中给定的值$("#myDiv")

2. element选择器
　　<div>DIV1</div>　查找一个DIV元素，指向DOM节点的标签名$('div')

3. 类选择器
　　<div class="hello"></div>　根据元素的class属性中给定的值$('.hello')

4. *选择器
　　查找每一个元素

5. selecotr1,selector2,selector3
　　将每一个选择器匹配到的元素合并后一起返回。　　$（"div,span"）

6. 后代选择器
　　在给定祖先元素下匹配所有的后代元素　　$("form input")

7. 子代选择器
　　在给定的父元素下皮匹配所有的子元素　　$("form > input")

8. 相邻元素选择器  prev+next
　　匹配所有进阶在prev元素后的next元素　　例：$("label+input")

9. 同辈元素选择器 prev~siblings
　　匹配prev元素的所有同辈siblings元素

10. 首元素选择器     ：first
　　获取第一个元素 $("li:first")

11. 末尾元素选择器     ：last
　　获取匹配的最后一个元素$("li:last")
```

## 7. json什么意思？有什么特点？Java操作json有哪些方式？
定义：官网 http://www.json.org/
- json：JavaScript对象表示法（JavaScript Object notation）
- JSON 是存储和交换文本信息的语法，类型XML
- JSON 比XML更小、更快、更易解析
- JSON 数据的书写格式是：名称/值对 {键：值}  

特点：
- 轻量级的文本数据交换格式
- 独立于语言
- 具有自我描述性，更易理解

Java操作json的第三方库【Java对象和json的互相转换】：  
>阿里Fastjson（推荐）、Yidong Fang的JSON.simple 、Google的GSON、FasterXML的Jackson、 Oracle的JSONP

## 8. Ajax是什么意思？有什么优点？
    ajax指异步JavaScript及XML（Asynchronous JavaScript And XML ）Ajax的核心是JavaScript对象XmlHttpRequest  
AJAX并非一种新的技术，而是几种原有技术的结合体：  
- 使用CSS和XHTML来表示
- 使用DOM模型来交互和动态显示
- 使用XMLHttpRequest来和服务器进行异步通信
- 使用JavaScript来绑定和调用

优点：
- 异步交互，页面无刷新，用户体验好
- 不打断用户操作，具有后天的响应能力
- 服务器部分工作转移到客户端，按需取数据
- 主流浏览器支持，不需要插件

##  9. Java 和javaScript有什么区别？
1. Java是sun/orcle公司，JavaScript是网景公司
2. Java是强类型语言，JavaScript是弱类型语言
3. Java是面向对象的，JavaScript是基于对象的
4. Java是编译执行，JavaScript是解释执行  
也可以讲细节，比如数组的区别，对象的区别。

# JavaWEB

## 1. jsp的9个隐式对象具体有哪些？
    页面page，请求request，会话session，应用application，还有resonse，config剩下的out，exception，pageContext

## 2. JSP的4大作用域，各代表什么意思？
JSP的四大作用域：①pageContext ②request ③session ④application。    其中page作用域最小，application作用域最大。

存储在application对象中的属性可以被同一个Web应用程序中的所有Servlet和Jsp页面访问（属性作用范围最大）

存储在session对象中的属性可以被同一个会话的所有Servlet和Jsp页面访问。

存储在request对象中的属性可以被同一个请求的所有Servlet和Jsp页面访问。  
application 在所有应用程序中有效

session 在当前会话中有效

request 在当前请求中有效

pageContext 在当前页面有效

## 3. JSP静态导入和动态导入有什么区别？

```
include指令在转换时插入“Header.jsp”的源代码，而<jsp:include>动作在运行时插入“Header.jsp"的响应。
<%@include为静态包含，<%@include不论包含的是txt文本还是jsp文件，被包含的页面都不会从新编译。
<%@include为静态包含,包含了几个JSP转译成servlet时就会有  几 个 class文件，如果在jsp1定义了变量i同时在jsp2也定义了变量i那么你编译都会通不过的,
<%@ include file="文件的URL" %>

jsp容器会告诉你i重复定义了.
<jsp:include 为动态包含，<jsp:include 如包含jsp文件，这每次加载主页面的时候，被包含的页面都要重新编译。
就是说不管你包含了几个jsp页面转译成servlet时中有一个class文件
<%@ include file="text/head.txt" %>
```


## 4. 跳转和重定向有什么区别？
1. 重定向是两次请求，转发是一次请求，因此转发的速度要快于重定向  
2. 重定向之后地址栏上的地址会发生变化，变化成第二次请求的地址，转发之后地址栏上的地址不会变化，还是第一次请求的地址  
3. 转发是服务器行为，重定向是客户端行为。重定向时浏览器上的网址改变 ,转发是浏览器上的网址不变  
4. 重定向是两次request，转发只有一次请求  
5. 重定向时的网址可以是任何网址，转发的网址必须是本站点的网址

## 5. Cookie和session有什么区别？
1、cookie数据存放在客户的浏览器上，session数据放在服务器上。

2、cookie不是很安全，别人可以分析存放在本地的COOKIE并进行COOKIE欺骗
   考虑到安全应当使用session。

3、session会在一定时间内保存在服务器上。当访问增多，会比较占用你服务器的性能
   考虑到减轻服务器性能方面，应当使用COOKIE。Session 的有效期随着系统退出而失效，设置失效时间[常用2种]；Cookie 可以长期驻留在客户机器中，可以设置有效期

4、单个cookie保存的数据不能超过4K，很多浏览器都限制一个站点最多保存20个cookie。session存储的是Object对象，cookie存储的是String字符串信息

## 6. Servlet的生命周期？
1. ：``加载Servlet``
web容器负责加载Servlet，当web容器启动时或者是在第一次使用这个Servlet时，容器会负责创建Servlet实例，但是用户必须通过部署描述符（web.xml）指定Servlet的位置，也就是Servlet所在的类名称，成功加载后，web容器会通过反射的方式对Servlet进行实例化。
2. ：``初始化``
当一个Servlet初始化后，容器将调用init()方法初始化这个对象，初始化的目的是为了让Servlet在处理客户端请求前完成一些初始化的工作，如建立数据库连接，读取资源文件信息等，如果初始化失败，则次Servlet将被直接卸载。
3. ：``进入服务``
当有请求提交时，Servlet将调用service()方法进行处理，常用的是service根据请求类型调用doGet()或者doPost()方法进行处理；在service()方法中，Servlet可以通过ServletRequest接受客户的请求，也可以利用ServletResponse设置响应信息。
4. ：``销毁``
当web容器关闭或者检测到一个Servlet要从容器中被删除时，会自动调用destroy()方法，以便让该实例释放掉所占用的资源。
5. ：``卸载``
当一个Servlet调用完destroy()方法后，次实例将等待被垃圾收集器所回收，如果需要再次使用此Servlet时，会重新调用init()方法初始化。

## 7. 页面同步交互和异步交互的区别？
>同步交互：最常见的（单击，刷新）click-refresh模式，点一个连接或提交一个表单到后台Java代码，然后整个页面被刷新 
异步交互：在不刷新整个页面的情况下，把页面请求提交到后台Java代码，常用的技术是AJAX。

## 8. 分页的实现原理？
分页有两种策略：
- 一种是真分页，分段到数据库中取数据，强烈推荐
- 一种是假分页，一次性获取所有数据，大数据量不推荐。  

1.设计页面：首页、上一页、下一页、尾页  
2.写一个分页工具类，封装分页逻辑，比如每页显示多少条记录，总页数，首页、上一页、下一页、尾页等  
3.Dao中实现2个方法，一个是获取总的记录数，二是分页获取列表（从哪开始，每次取多少条记录）  
4.根据页面请求的页面数来进行分页查询，调用分页工具类进行分页  

# Database
## 1. 创建，修改，删除表结构的sql语句？
INSERT --向数据库表添加新数据行  
UPDATE --更新数据库表中的数据(修改)  
DELETE --从数据库表中删除数据行  
CREATE TABLE --创建一个数据库表  
ALTER TABLE --修改数据库表结构  
DROP TABLE --从数据库中删除表  

## 2. 表数据的CRUD语句？
insert--delete--update--select
```
选择：select * from table1 where 范围
插入：insert into table1(field1,field2) values(value1,value2)
删除：delete from table1 where 范围
更新：update table1 set field1=value1 where 范围
查找：select * from table1 where field1 like ’%value1%’ 
排序：select * from table1 order by field1,field2 [desc]
总数：select count as totalcount from table1
求和：select sum(field1) as sumvalue from table1
平均：select avg(field1) as avgvalue from table1
最大：select max(field1) as maxvalue from table1
最小：select min(field1) as minvalue from table1
```

## 3. 事物有哪些特性（ACID）？你是怎么理解的？
- 原子性：事务包含的几个步骤，不能分割。
- 一致性：事务执行的结果，要不成功，要不失败，结果保持一致
- 隔离性：每个事务之间互不干扰
- 持久性：事务执行的结果，永久保存在数据库或物理硬盘中。以后可以查询之前事务执行的结果。

## 4. join和union是什么意思？
join是多表连接查询的意思，包含（innner join、left join、right join、full join， cross join），union是合并多个查询语句的结果
## 5. 如何来设计表的主键？
>数字类型，自动编号，与业务逻辑无关
## 6. 主键的关键字？自动编号的关键字？
>主键：primary key 自动编号：auto_increment(mysql),identity(sql server),sequence序列（Oracle）

## 7. 约束有哪几种？
a. 非空约束（not null）  
b. 唯一性约束（unique）
c. 主键约束（primary key）实体完整性
d. 外键约束（foreign key）引用完整性
e. 检查约束（check）
f. 默认值约束（default）
g. 自动编号（auto_increment）

## 8. sql的性能优化有哪些？
1. 索引优化
2. 选择合适的列数据类型
3. 尽可能使用not null
4. 避免使用多表连接，join的字段要加索引
5. 尽量不要用子查询
6. 尽量在where子句中使用！=或<>操作符
7. 慎用in和not in
8. 尽量使用数字类型的字段
9. 查询尽量避免使用*,写出需要查询的字段

## 9. 数据库设计三个范式？
1NF第一范式就是原子性，字段不可再分割；【无重复的列】  
2NF第二范式就是完全依赖，没有部分依赖；【非主属性部分依赖于主关键字，实体完整性】  
3NF第三范式就是没有传递依赖【属性不依赖于其他非主属性】

## 10. top N的问题（w3cschool）
mysql :先排序order by 再limit
sql server：先top，再排序
Oracle：先排序，再rownum

## 11. 什么是sql注入？如何预防sql注入？
sql注入：客户端发送请求数据（表单/url）时，将sql指令发送到后台Java代码（DAO层），后台构造sql语句时被注入非法指令，导致数据被破坏或泄露的风险。  
预防措施：
- 页面的客户端验证
- 服务器端验证，对非法数据进行转义
- 采用预处理绑定变量，不要采用直接拼接sql语句
- 生产环境服务器错误友好提示
- 账户权限管理
- 对敏感信息进行加密

# JavaEE

## 1. 如何理解MVC？说说Java的分层思想？
M:model模型层 V:view视图层 C:controller控制层  
分层的主要目的是，降低代码之间的耦合性，提高代码的服从性；各司其职，互不干扰。  
一般分五层：
- 视图层：主要关注客户请求和页面数据展示
- 控制层：主要关注视图层与模型层的业务和数据对接，调度作用，主要是收集、处理、转发的作用
- 模型层【服务层service】：关注具体的业务逻辑
- 模型层【数据访问层DAO】：关注实体类与数据库表之间的原子操作（crud）
- 数据库层：关注数据的持久化

## 2. jdbc常用的连接池有哪些？
    DBCP、C3P0、Proxool、阿里的Druid

## 3. Struts2的工作原理是什么（原理图）？
- 客户请求经过一系列的过滤器，最后进入StrutsPreparedAndExcuteFilter过滤器（核心控制器）
- 核心过滤器根据用户请求调用ActionMapper对象，查找对应请求（url）和具体处理控制器
- 核心过滤器会创建ActionProxy对象，此对象通过配置管理器加载Struts的配置文件
- 代理对象去调用ActionInvocation对象，此对象通过命令模式，负责拦截器和Action的调度
- Action执行方法返回结果生成客户端响应

## 4. mybatis的工作原理（原理图）？
1. 加载mybatis主配置文件（主配置文件包含模块的配置文件）创建SqlSessionFacory对象
2. 根据SqlSessionFacory对象创建SqlSession对象
3. Sqlsession对象调用模块配置文件中的sql语句，执行CRUD操作

## 5. HIbernate的工作原理（原理图）？
1. 加载hibernate主配置文件（主配置文件包含模块的配置文件）创建sessionFacory对象
2. 根据SessionFacory对象创建session对象
3. session对象实体对象（POJO）的操作，HIbernate底层转化成相应的sql语句，执行CRUD操作

## 6. mybatis和HIbernate的区别？
mybatis：
>半自动化ORM框架，实现了POJO（实体类）与sql之间的映射关系，sql Mapping实现；程序员/DBA可以优化sql语句。适合历史遗留项目/升级项目、执行效率要求比较高的项目。强项：动态的增删改查操作  

HIbernate：
>全自动ORM框架，实现了POJO（实体类）和数据库表之间的映射，以及sql的自动生成和执行，通过对对象的操作转化成对数据库CRUD操作，O/R Mapping实现适合的项目。强项：增删改查操作

一句话总结：mybatis：小巧、方便、高效、简单、直接、半自动化；HIbernate：强大、方便、高效、复杂、间接、全自动化

## 7. Struts2获取页面的值有几种方式？
- Action定义单个属性+getter/setter方法
- Action定义对象+getter/setter方法
- 模型驱动，实现ModelDriven接口
- 创建原型request对象，request，getAttribute（“”）；
- 创建map的Request对象，Request.get("");

## 8. Spring 的核心思想？
1. DI/IOC,依赖容器注入对象，以前开发人员使用对象之前需要new一个对象，控制对象的创建过程；现在把创建对象的过程交给容器来完成，所以控制权反转了。开发人员只要告诉容器，给我一个xx对象，不需要考虑对象的创建细节。spring容器负责组装、管理对象。
2. AOP，面向切面编程。是面向OOP的一个补充，AOP是在不改变现有程序代码和业务逻辑的情况下，针对现有程序的功能增强。具体给需要使用的AOP方法追加切入点，通过配置，追加功能，底层是用反射和动态代理来完成的。

## 9. 如何设计一个模块？
- 先进行需求分析，了解模块所具有的功能
- 模块的数据库设计及实现
- 模块的代码设计及实现（接口、实现、页面布局）
- 模块功能的测试

## 10. Spring用到哪些设计模式？
1. 工厂模式（简单工厂、工厂方法）
2. 单例模式
3. 代理模式
4. 适配器模式
5. 包装器模式
6. 观察者模式
7. 策略模式
8. 模板方法

## 11. 常用的设计模式？
- 单例模式：确保一个类只有一个实例，单一实例，共享实例
- 简单工厂模式：对象的创建交给模式
- 工厂方法模式：核心工厂定义创建对象的接口，具体创建对象的任务交给子类来实现。
- 适配器模式：把一个类的接口变换成客户端所期待的另一种接口；有点像，USB转接口
- 代理模式：某一个对象提供一个代理对象，并由代理对象控制对源对象的引用
- 观察者模式：定义一种一对多 的依赖关系，让多个观察者对象同时监听某一个主题对象。类似监听器
- 策略模式:针对一组算法，将每一个算法封装到具有共同接口的独立的类中，从而使得它们可以互相替换。
- 模板方法：准备一个抽象类，将部分逻辑以具体方法以及具体构造函数的形式实现，然后声明一些抽象方法来迫使子类实现剩余的逻辑

## 12. Spring的注入方式有哪几种？
>构造注入、setter、p命名空间注入、注解注入

## 13. HIbernate的一级缓存和二级缓存有什么区别？
一级缓存：是session的缓存，hibernate默认配置，无须程序员操心  
二级缓存是SessionFactory的缓存，默认不开启，想开启的话需要在主配置xml文件或实体的xml中进行相关配置


## 14. HIbernate中get和load的区别？
load方法：延迟加载的机制来加载这个对象；对象id不存在，抛出ObjectNotFoundException异常  
get方法：直接通过Hibernate生成sql语句操作数据库；hibernate一定要获取到真实的数据，否则返回null

## 15. 说说Mybatis的缓存机制？
    mybatis的查询缓存分为一级缓存和二级缓存，一级缓存是SqlSession级别的缓存，二级缓存时mapper级别的缓存，二级缓存是多个SqlSession共享的。mybatis通过缓存机制减轻数据压力，提高数据库性能。

# 人事相关

## 1.职业规划
长远未考虑，勿谈学习
3年短期规划第一年初级；第二年带新人，项目组长；第三年，小型项目经理。

## 2.薪资
公司有标准的薪资制度，咱们行业有平均水平，不能低于行业平均水平
干得好，相信老板不会亏待
不和技术经理谈工资，不到万不得已不谈具体数值可划范围。

##  3.优缺点？
优：做事细心，负责，自学能力，恪守信用
缺：工作近一年，工作经验欠缺，执着；性子慢，做事深思熟虑，善于思考，统筹兼顾；沟通的技巧方式上还有待提高。

## 4.挫折、影响深刻的事？
高考失误，尽力了。励志，正面解释。

## 5.为什么进入公司、对公司了解多少？
通过什么渠道了解公司，公司规模，业务，研发能力。


## 6.为什么离职？
忌口谈前公司缺点；平台不好，发展空间不够；接触新技术。


## 7.问面试官？
公司对新员工有没有培训计划；公司对员工的职业规划；公司使用技术；公司团建活动；对我本次面试有什么看法？

## 8.评价面试官？
不留痕迹的夸赞，公司正规，面试官很规范，很专业，技术能力强，发展目标。

## 9.女朋友？
没有。（谈女朋友吗？）还年轻，没有考虑

## 10.加班、996？
愿意，由于项目需要，加班完全没问题；个人能力影响，努力提高水平；
还年轻，吃苦加班，没问题，提高技能。

## 11.对离职公司建议？
任务分配不合理，前后端分离。权责分明，技术反馈，客户满意度，应急处理。技术架构过时。


## 12.程序员素养？
技术：过硬，发现问题解决问题；沟通能力；快速搜索资源；领导能力，管理能力；


## 13.团队合作？你是项目经理，如何组织工作？
首先人员分工，定期开会沟通，每周会议，；问题解决；客户需求沟通；

配合团队：完成项目经理分配工作，遇到问题及时与上级汇报，


## 14.自身问题导致项目延期，怎么办？
向公司及领导，同事道歉，挽回损失，请吃饭等表歉意。

## 15.项目中出现问题，你有更好的方案，如何回应？
私下找领导提出，仔细思考，谦虚。

## 16.与领导意见分歧，怎么办？
谦虚、谨慎。私下解决。

## 17.同事犯错，举报你？
触发个人底线，澄清事实，小问题，息事宁人。

## 18.是不是优秀的程序员？
  同程序员素养：12
## 19。面试总分100，给自己多少？
60-80，谦虚，提出自己还有许多不足。问面试官这次面试还有哪些改进。

## 20.女程序员优劣势？
细心，负责。
请产假，生理期心情-》加班辛苦。没什么差别，一个部门有几个锦上添花。耐力弱，加班体力跟不上。


# 技术：
## 21。公司换新技术，你准备要多长时间正式干活？Java——》C#
按公司要求，积极学习。一个月左右。2-3周写一个demo。

## 22.公司要用一个新的技术，你如何学习？
官方文档快速写demo，集成到项目中，遇到问题网上查资料。

## 23.问题不知道？
之前没有研究，了解一点简单介绍。反问面试官，虚心请教。


# 项目经验：
1. 项目背景、概况？
为什么做这个项目，


2. 项目周期,人员分工?
开发时间，有哪些人员，参与工作。

3. 你的职责？


4. 项目用户，受众？

5. 项目使用技术？

6. 项目的业务逻辑？

7. 项目中产生意见分歧怎么解决？

8. 你的收获？
项目经验，技术收获，业务逻辑


9. 项目功能？