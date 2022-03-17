package cloud.autotests.jupiter;

import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
@Target(ElementType.METHOD)
@Retention(RUNTIME)
@ExtendWith(BrowserVideoExtension.class)
public @interface BrowserExtension {
}