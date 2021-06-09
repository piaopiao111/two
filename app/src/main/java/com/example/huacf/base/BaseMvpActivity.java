package com.example.huacf.base;

import com.example.huacf.model.BaseModel;
import com.example.huacf.view.BaseView;

public class BaseMvpActivity<M extends BaseModel> extends BaseActivity implements BaseView {
    @Override
    public void onSuccess(int whichApi, int loadType, Object o, Object... pObjects) {

    }

    @Override
    public void onFailed(int whichApi, Throwable pThrowable) {

    }
}
