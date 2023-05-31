package org.example.converter;

import org.springframework.cglib.core.Converter;

public class ConverterSetting implements Converter {

    @Override
    public Object convert(Object o, Class aClass, Object o1) {
        if (o instanceof String) {
            return o;
        } else {
            return o.toString();
        }
    }
}
