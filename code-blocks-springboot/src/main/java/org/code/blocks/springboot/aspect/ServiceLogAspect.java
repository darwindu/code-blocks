package org.code.blocks.springboot.aspect;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.code.blocks.common.constant.CommonConstant;
import org.code.blocks.common.util.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class ServiceLogAspect {

    private Logger logger = LoggerFactory.getLogger(ServiceLogAspect.class);

    ThreadLocal<Long>  startTime = new ThreadLocal<Long>();

    @Pointcut("execution(public * org.code.blocks.springboot.service.*.*(..))")
    private void controllerAspect(){

    }

    /**o
     * running before joinPoint
     * @param joinPoint this is joinPoint
     */
    @Before(value = "controllerAspect()")
    public void before(JoinPoint joinPoint){

        startTime.set(System.currentTimeMillis());

        ServletRequestAttributes requestAttributes =
            (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        if (null == requestAttributes) {
            logger.info("####request url:{}| type:{}| method:[{}]| args:{}",
                CommonConstant.EMPTY,
                CommonConstant.EMPTY,
                joinPoint.getSignature(),
                Arrays.toString(joinPoint.getArgs()));
            return;
        }

        HttpServletRequest request = requestAttributes.getRequest();
        logger.info("####request url:{}| type:{}| method:[{}]| args:{}",
            request.getRequestURL().toString(),
            request.getMethod(),
            joinPoint.getSignature(),
            Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * when joinPoint, running after return
     * @param joinPoint this is joinPoint
     * @param keys return result
     */
    @AfterReturning(value = "controllerAspect()", returning = "keys")
    public void afterReturning(JoinPoint joinPoint, Object keys) {

        logger.info("####response method:[{}]| args:{}| response:{}| cost tims:{}ms",
            joinPoint.getSignature(),
            Arrays.asList(joinPoint.getArgs()),
            JsonUtils.objToJsonStr(keys),
            (System.currentTimeMillis() - startTime.get()));
    }

}
