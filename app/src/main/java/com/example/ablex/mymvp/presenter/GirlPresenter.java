package com.example.ablex.mymvp.presenter;

import com.example.ablex.mymvp.bean.Girl;
import com.example.ablex.mymvp.model.GirlModelImpl;
import com.example.ablex.mymvp.model.IGirlModel;
import com.example.ablex.mymvp.view.IGirlView;

import java.util.List;

public class GirlPresenter<T extends IGirlView> extends BasePresenter<T> {

    IGirlModel iGirlModel = new GirlModelImpl();

    //执行数据
    public void fetch() {
        if (mViewRef != null) {
            mViewRef.get().showLoading();
            if (iGirlModel != null) {
                iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        if (mViewRef != null) {
                            mViewRef.get().showGirls(girls);
                        }
                    }
                });
            }
        }

    }
}