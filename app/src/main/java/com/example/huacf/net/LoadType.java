package com.example.huacf.net;

import androidx.annotation.IntDef;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.PARAMETER)
@IntDef(value = {LoadType.MORE,LoadType.NORMAL,LoadType.REFRESH})
public @interface LoadType {
    int NORMAL = 10086;
    int REFRESH = 10010;
    int MORE = 10001;
}
