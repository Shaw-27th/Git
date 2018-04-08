package app;


	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	//下面开始写程序，我们需要一个启动类，然后在启动类声明让spring boot自动给我们配置spring需要的配置，
	//比如：@SpringBootApplication,为了可以尽快让程序跑起来，我们简单写一个通过浏览器访问hello world字样的例子：

	/*
	 * 其中@SpringBootApplication声明让spring boot自动给程序进行必要的配置，
	 * 等价于以默认属性使用:
	 * @Configuration
	 * @EnableAutoConfiguration
	 * @ComponentScan
	 * @RestController返回json字符串的数据，直接可以编写RESTFul的接口。
	 * */

		@RestController
		@SpringBootApplication  
		public class Application {
		    @RequestMapping("/index")  
		    String home() {  
		        return "Spring Boot Index!";  
		    }  
		      
		    public static void main(String[] args) {  
		        SpringApplication.run(Application.class, args);    
		    }  
		}  
		
	/*	
		运行我们的Application，我们先介绍第一种运行方式。
		
		第一种方式特别简单：右键Run As -> Java Application。
		之后打开浏览器输入地址：http://127.0.0.1:8080/home 就可以看到Hello world!了。
			
		第二种方式右键project – Run as – Maven build – 在Goals里输入spring-boot:run ,
		然后Apply,最后点击Run。
	*/


