package demo;

import jdk.swing.interop.SwingInterOpUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticatingPointCut(){
       // System.out.println("authenticatingPointCut");
    }

    @Pointcut("within(demo..*)") //within() : which class we want to execute for all methods
    public void authorizationPointCut(){
       // System.out.println("authorizationPointCut");
    }
    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the Request");
    }
}
