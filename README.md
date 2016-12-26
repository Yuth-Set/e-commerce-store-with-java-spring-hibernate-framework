# e-commerce-store-with-java-spring-hibernate-framework-part1
-Using H2 Database : http://www.h2database.com/html/main.html
<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
    <property name="driverClassName" value="org.h2.Driver" />
    <property name="url" value="jdbc:h2:tcp://localhost/~/test" />
    <property name="username" value="sa" />
    <property name="password" value="" />
</bean>
-In order to run H2 Database on your machine :
First you have to install it
Second set the url property from your h2 local machine
eg: <property name="url" value="jdbc:h2:tcp://localhost/~/test" />
