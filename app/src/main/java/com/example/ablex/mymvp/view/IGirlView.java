package com.example.ablex.mymvp.view;

import com.example.ablex.mymvp.bean.Girl;

import java.util.List;

public interface IGirlView {
    void showLoading();
    void showGirls(List<Girl> girls);
}
