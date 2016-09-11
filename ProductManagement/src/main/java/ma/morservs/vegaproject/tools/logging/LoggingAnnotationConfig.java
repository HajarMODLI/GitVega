package ma.morservs.vegaproject.tools.logging;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;


/**
 * Created by Ayoub on 08/09/2016.
 */

@Component
public class LoggingAnnotationConfig implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotation(Logging.class) != null) {
                injectLogger(bean, field);
            }
        }
        return bean;
    }

    private void injectLogger(Object bean, Field field) {
        ReflectionUtils.makeAccessible(field);
        ReflectionUtils.setField(field, bean,
                Logger.getLogger(field.getDeclaringClass()));
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
