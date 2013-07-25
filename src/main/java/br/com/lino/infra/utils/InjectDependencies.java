package br.com.lino.infra.utils;

import java.util.Collection;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InjectDependencies {

	@Autowired
	private ApplicationContext applicationContext;

	@AfterReturning(value = "@annotation(br.com.lino.infra.annotation.AddDependencies)", returning = "target")
	public void resolve(Object target) throws Throwable {
		if (target != null)
			autowire(target);
	}

	private void autowire(Object target) {
		if (target instanceof Collection<?>) {
			autowireBeans((Collection<?>) target);
		} else {
			autowireBean(target);
		}
	}

	private void autowireBeans(Collection<?> beans) {
		for (Object bean : beans) {
			autowireBean(bean);
		}
	}

	private void autowireBean(Object target) {
		applicationContext.getAutowireCapableBeanFactory().autowireBean(target);
	}

}