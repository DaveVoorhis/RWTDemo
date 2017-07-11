# RWTDemo
A simple demo of a minimal RAP/RWT project, with instructions for deploying to Jetty. 

*** Create and Deploy Eclipse RWT[1] Application to Jetty ***

1. Install Eclipse Java EE Developer Tools, Eclipse Java Web Developer Tools, Eclipse Web Developer Tools
   (Note: possibly, only Eclipse Java EE Developer Tools are required.)
   
2. Download latest Eclipse RAP bundle and extract JAR org.eclipse.rap.rwt_*.jar
   As of this writing it's org.eclipse.rap.rwt_3.2.0.20170609-1144.jar

3. Create new project via: New | Other... | Web | Dynamic Web Project

4. Copy org.eclipse.rap.rwt_*.jar to WebContent/WEB-INF/lib and add it to the project's
   Referenced Libraries
   
5. Select Export | Web | WAR file and create .WAR file. E.g., RWTDemo.WAR

6. Install Jetty 9 on target platform. E.g., apt install jetty9

7. Copy WAR file to webapps. E.g., cp RWTDemo.WAR /var/lib/jetty9/webapps

8. Restart Jetty 9. E.g., sudo service jetty9 restart

9. Verify it's working: Point your web browser at
   http://localhost:8080/RWTDemo/demo 
   where '/demo' is the servlet URL defined in the web.xml <servlet-mapping><url-pattern>...
   and RWTDemo is the name of the WAR file.
 
References:

1. https://wiki.eclipse.org/RAP/RWT 
