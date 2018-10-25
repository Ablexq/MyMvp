package com.example.ablex.mymvp.presenter;

import java.lang.ref.WeakReference;

public class BasePresenter<T> {
    protected WeakReference<T> mViewRef;

    //进行绑定
    public void attchView(T view) {
        mViewRef = new WeakReference<>(view);
    }

    //进行解绑
    public void dettachView() {
        mViewRef.clear();
    }
}