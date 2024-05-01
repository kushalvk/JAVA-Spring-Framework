package com.vk.springbootrest9.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.vk.springbootrest9.service.JobService.getJob(..)) && args(postId)")
    public Object validateAndUpdated(ProceedingJoinPoint jp, int postId) throws Throwable {

        if (postId < 0) {
            LOGGER.info("postId is negative updating it");
            postId = -postId; // changing it to negative to positive
            LOGGER.info("New postId : " + postId);
        }

        Object obj = jp.proceed(new Object[]{postId});

        return obj;
    }
}
