import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//аннотация применима только к классам
@Retention(RetentionPolicy.RUNTIME)//работает в рантайме
public @interface Company{
    String name() default "Some Name";//указание дефолтных переменных(если не присвоят новые)
    String city() default "City N";
}

