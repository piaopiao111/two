package com.example.huacf.view;

public interface BaseView<D> {
    void onSuccess(int whichApi,int loadType,D d,Object... pObjects);
    void onFailed(int whichApi,Throwable pThrowable);
}
