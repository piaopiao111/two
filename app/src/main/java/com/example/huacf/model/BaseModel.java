package com.example.huacf.model;

import com.example.huacf.net.LoadType;
import com.example.huacf.presenter.BasePresenter;

import java.util.Map;

import okhttp3.RequestBody;

public interface BaseModel {
    void getData(BasePresenter presenter, int whichApi, @LoadType int loadType, Class<?> pClass,
                 Map<String, Object> params, RequestBody pBody,Object... obj);
}
