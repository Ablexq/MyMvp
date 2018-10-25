package com.example.ablex.mymvp;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ablex.mymvp.adapter.MyAdapter;
import com.example.ablex.mymvp.bean.Girl;
import com.example.ablex.mymvp.presenter.GirlPresenter;
import com.example.ablex.mymvp.base.BaseActivity;
import com.example.ablex.mymvp.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView, GirlPresenter<IGirlView>> implements IGirlView {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.mylistview);
        presenter.fetch();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "加载成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {
        MyAdapter myAdapter = new MyAdapter(this, girls);
        listView.setAdapter(myAdapter);
    }

    @Override
    protected GirlPresenter<IGirlView> creatPresenter() {
        return new GirlPresenter<>();
    }
}