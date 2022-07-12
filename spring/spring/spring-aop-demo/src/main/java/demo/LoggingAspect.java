package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))") //pointcut  (*) means any return type (..) means what ever no of parameters it will match
    public void beforeLogger(JoinPoint jp){  //jointpoint
        //System.out.println(jp.getSignature());
        String arg = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with argument "+ arg);
    }

    @After("execution(* *.*.checkout(..))") //*(any returntype) * (any package).*(any class)
    public void afterLogger(){
        System.out.println("After Logger");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){
    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retval")
    public void afterReturning(String retval){
        System.out.println("After Returning : "+retval);
    }

}
