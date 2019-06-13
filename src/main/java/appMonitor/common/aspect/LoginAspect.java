package appMonitor.common.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
/**
 * 必须要@Aspect  和 @Component一起使用否则没法拦截通知
 * 搞了好久才明白刚刚开始以为时execution里面的配置的问题
 * AOP使用很简单的
 */
@Aspect
@Component
public class LoginAspect {
    private  final Log log = LogFactory.getLog(LoginAspect.class);
    //定义一个方法作为切入点id
    @Pointcut("execution(* appMonitor.controller.*.*(..))")
    private void loginAspcetMethod(){}

    //Before
    @Before("loginAspcetMethod()")
    public void loginBeforeAdvice(JoinPoint joinPoint){
        String classname = joinPoint.getTarget().getClass().getSimpleName();
        String methodname = joinPoint.getSignature().getName();
        log.info(">>>>>>>>>>>>>>>>>>登陆前拦截类："+classname);
    }

    //After
    @After("loginAspcetMethod()")
    public void loginAfterAdvice(JoinPoint joinPoint){
        log.info("<<<<<<<<<<<<<<<<<登陆后>>>>>>>>>>>>>>>>>>");
    }

}
