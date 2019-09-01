演示地址：http://txr.tpddns.cn/login.html (有可能没运行)
#技术清单
+ SpringBoot 2.17
+ Mybaris-plus 3.2
+ thymeleaf 2.17

#功能列表
+ 登录
+ 注册
+ 文件上传
+ ...

#臭傻逼的踩坑日记😊

###mybatis-plus升级3.x后

- 参数为`Map pm`时 \
 select * from account where account_id != #{pm.id}\
 2.x分页 page是RowBounds的子类，可以不要写@param, 现在IPage 是需要@param, 现在需要@param("map") Map
以前可以直接 #{id} 现在需要 #{map.id}

###mybatis-plus在idea中是不会默认加载的(新建的项目会很容易忽略哦)

```
<build>
           <resources>
               <!-- mapper.xml文件在java目录下 -->
               <resource>
                   <directory>src/main/java</directory>
                   <includes>
                       <include>**/*.xml</include>
                   </includes>
               </resource>
               <!-- mapper.xml文件在resources目录下-->
               <resource>
                   <directory>src/main/resources</directory>
               </resource>
           </resources>
       </build>
```
###Thymeleaf热更新html
```
spring:
  thymeleaf:
    cache: false
```
还需要使用``Ctrl+F9``构建项目

