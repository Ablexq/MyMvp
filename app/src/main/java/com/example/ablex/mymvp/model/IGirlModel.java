package com.example.ablex.mymvp.model;

import com.example.ablex.mymvp.bean.Girl;

import java.util.List;

public interface IGirlModel {

    void loadGirl(GirlOnLoadListener girlOnLoadListener);

    interface GirlOnLoadListener {
        void onComplete(List<Girl> girls);
    }
}