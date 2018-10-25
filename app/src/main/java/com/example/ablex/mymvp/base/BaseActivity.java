package com.example.ablex.mymvp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.ablex.mymvp.presenter.BasePresenter;

public abstract class BaseActivity<V, T extends BasePresenter<V>>extends Activity {
    public T presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = creatPresenter();
        presenter.attchView((V)this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dettachView();
    }

    protected abstract  T creatPresenter();
}
