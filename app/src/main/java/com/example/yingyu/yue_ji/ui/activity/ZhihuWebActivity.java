package com.example.yingyu.yue_ji.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.ui.base.MVPBaseActivity;
import com.example.yingyu.yue_ji.ui.presenter.ZhihuWebPresenter;
import com.example.yingyu.yue_ji.ui.viewinterface.ZhihuWebInterface;

import butterknife.BindView;
import butterknife.ButterKnife;



public class ZhihuWebActivity
        extends MVPBaseActivity<ZhihuWebInterface, ZhihuWebPresenter>
        implements ZhihuWebInterface{

    private static final String ID = "id";

    private String id;

    @BindView(R.id.web_view)
    WebView web_view;
    @BindView(R.id.iv_web_img)
    ImageView iv_web_img;
    @BindView(R.id.tv_img_title)
    TextView tv_img_title;
    @BindView(R.id.tv_img_source)
    TextView tv_img_source;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        parseIntent();
        ButterKnife.bind(this);
        mPresenter.getDetailNews(id);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.destroyImg();
    }

    public static Intent newIntent(Context context, String id){
        Intent intent = new Intent(context,ZhihuWebActivity.class);
        intent.putExtra(ZhihuWebActivity.ID,id);
        return intent;
    }

    private void parseIntent(){
        id = getIntent().getStringExtra(ID);
    }

    @Override
    protected ZhihuWebPresenter createPresenter() {
        return new ZhihuWebPresenter(this);
    }

    @Override
    public WebView getWebView() {
        return web_view;
    }

    @Override
    public ImageView getWebImg() {
        return iv_web_img;
    }

    @Override
    public TextView getImgTitle() {
        return tv_img_title;
    }

    @Override
    public TextView getImgSource() {
        return tv_img_source;
    }
}
