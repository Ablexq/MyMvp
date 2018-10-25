package com.example.ablex.mymvp.model;

import com.example.ablex.mymvp.R;
import com.example.ablex.mymvp.bean.Girl;

import java.util.ArrayList;
import java.util.List;

public class GirlModelImpl implements IGirlModel {
    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> datas = new ArrayList<>();
        datas.add(new Girl(R.mipmap.ic_launcher, "小美丽"));
        datas.add(new Girl(R.mipmap.ic_launcher_round, "中美丽"));
        datas.add(new Girl(R.mipmap.ic_launcher, "大美丽"));
        datas.add(new Girl(R.mipmap.ic_launcher_round, "最美丽"));
        girlOnLoadListener.onComplete(datas);
    }
}