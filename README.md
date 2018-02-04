# wildfly swarm test project

**Commands:**<br/>
**_run_**<br/>
java -jar target\wildfly-swarm.jar
<br/>
**_build and run_**<br/>
mvn clean package && java -jar target\wildfly-swarm.jar
<br/>
**_build and run with debug_**<br/>
mvn clean package && java -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000 -jar target\wildfly-swarm.jar
