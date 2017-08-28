package cn.zhang.spring.contextListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringServletListener implements ServletContextListener {
	
    public SpringServletListener() {}

    public void contextDestroyed(ServletContextEvent sce)  { 
    }

    public void contextInitialized(ServletContextEvent sce)  {
    	// 从上下文配置文件中获取Spring配置文件
    	ServletContext sc = sce.getServletContext();
    	String configFile = sc.getInitParameter("configFile");
    	// 进行IOC容器的初始化
    	ApplicationContext ctx = new ClassPathXmlApplicationContext(configFile);
    	// 将IOC容器放入到application域对象中
    	sc.setAttribute("ApplicationContext", ctx);
    }
	
}
