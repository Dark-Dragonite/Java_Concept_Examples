package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// A custom annotation to store metadata on a downhill mountain biker in a race
public @interface CustomAnnotation {

    // Makes our annotation apply to a classes
    @Target(ElementType.TYPE)

    // Makes our annotation available at runtime
    // Since its available at runtime we can access fields with reflection
    @Retention(RetentionPolicy.RUNTIME)

    public @interface BikerStats {
        String name();

        String state();

        int skillLevel();

        String bikeType();

        String teamname() default "Solo Rider";
    }

}
