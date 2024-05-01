package com.vk.springbootrest9.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// AOP is the execute the method before some method

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

//    Before run the Method
    // in execution( return type, class name.method-name(arguments))
    @Before("execution(* com.vk.springbootrest9.service.JobService.getJob(..)) || execution(* com.vk.springbootrest9.service.JobService.getAllJobs(..))") // to call to method use ( || )
    // it will call for time when every method in the 'JobService' class -> you can also do in the particular method(ex:-...JobService.updateJob(..))
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called " + jp.getSignature().getName());
    }

//    After run the Method
    @After("execution(* com.vk.springbootrest9.service.JobService.getJob(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method Executed " + jp.getSignature().getName());
    }

//    AfterThrowing is execute when method thas some error
    @AfterThrowing("execution(* com.vk.springbootrest9.service.JobService.getJob(..))")
    public void logMethodCrash(JoinPoint jp) {
        LOGGER.info("Method has some issues " + jp.getSignature().getName());
    }

//    AfterReturning is execute when method is run successfully without error
    @AfterReturning("execution(* com.vk.springbootrest9.service.JobService.getJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp) {
        LOGGER.info("Method Executed successfully " + jp.getSignature().getName());
    }
}
