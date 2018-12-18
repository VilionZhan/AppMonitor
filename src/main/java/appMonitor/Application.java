package appMonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

    /* 拦截
     * http://localhost:8080/
     * 跳转到
     * 系统登陆页面login.html*/
     /* @RequestMapping("/")
      public String login() {
          System.out.println("login...........................");
            return "templates/login.html";
        }

        @RequestMapping("/404")
        public  String notFound() {
            return "app/404";
        }

        @RequestMapping("/500")
        public  String error() {
            return "app/500";
        }
        */
}
