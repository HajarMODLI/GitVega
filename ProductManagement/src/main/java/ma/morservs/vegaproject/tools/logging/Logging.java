package ma.morservs.vegaproject.tools.logging;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Ayoub on 08/09/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public  @interface Logging {
}

