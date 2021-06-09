package com.example.huacf.base;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import com.example.huacf.model.BaseModel;
import com.example.huacf.net.LoadType;
import com.example.huacf.presenter.BasePresenter;
import com.example.huacf.view.BaseView;

import java.util.Map;

import okhttp3.RequestBody;

public class CommonPresenter extends BasePresenter {
    private BaseView mView;
    private BaseModel mModel;
    private BaseActivity mContext;

    public CommonPresenter(BaseView view,BaseModel pModel){
        mView = view;
        mModel = pModel;
//        mContext = view instanceof BaseActivity?(BaseActivity)view:(BaseActivity)((BaseFragment)view).getActivity();
    }

    public Activity getActivity(){
        return mContext;
    }
  

    public void showLog(Object object) {
        Log.e("饕餮", object.toString());
    }

//    public void showToast(Object object){
//        Toast.makeText(CommonApplication.getCommonApplicationContext(), object.toString(), Toast.LENGTH_SHORT).show();
//    }
}
