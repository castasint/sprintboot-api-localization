package com.example.apilocalization;

import java.lang.annotation.*;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LocalizedLabel {
    String value();
}