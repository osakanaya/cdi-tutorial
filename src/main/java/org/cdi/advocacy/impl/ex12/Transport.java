package org.cdi.advocacy.impl.ex12;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;

@Qualifier
@Retention(RUNTIME)
@Target({TYPE, METHOD, FIELD, PARAMETER})
public @interface Transport {
	TransportType type() default TransportType.STANDARD;
	int priorityLevel() default -1;
}
