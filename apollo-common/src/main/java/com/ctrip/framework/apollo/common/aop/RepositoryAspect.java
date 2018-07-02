package com.ctrip.framework.apollo.common.aop;

import com.ctrip.framework.apollo.tracer.Tracer;
import com.ctrip.framework.apollo.tracer.spi.Transaction;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RepositoryAspect {

  @Pointcut("execution(public * org.springframework.data.repository.Repository+.*(..))")
  public void anyRepositoryMethod() {
  }

  @Around("anyRepositoryMethod()")
  public Object invokeWithCatTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
    String name =
        joinPoint.getSignature().getDeclaringType().getSimpleName() + "." + joinPoint.getSignature()
            .getName();
    Transaction transaction = Tracer.newTransaction("SQL", name);
    try {
      Object result = joinPoint.proceed();
      transaction.setStatus(Transaction.SUCCESS);
      return result;
    } catch (Throwable ex) {
      transaction.setStatus(ex);
      throw ex;
    } finally {
      transaction.complete();
    }
  }
}
