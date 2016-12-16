package com.example.yingyu.yue_ji.ui.presenter;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.yingyu.yue_ji.R;
import com.example.yingyu.yue_ji.bean.zhihu.NewDetail;
import com.example.yingyu.yue_ji.ui.base.BasePresentter;
import com.example.yingyu.yue_ji.ui.viewinterface.ZhihuWebInterface;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class ZhihuWebPresenter extends BasePresentter<ZhihuWebInterface> {

    private Context mContext;
    private ZhihuWebInterface view;

    public ZhihuWebPresenter(Context mContext) {
        this.mContext = mContext;
    }

    public void getDetailNews(String id) {
        zhihuApi.getDetailNews(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<NewDetail>() {
                    @Override
                    public void call(NewDetail news) {
                        setWebView(news);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Toast.makeText(mContext, R.string.net_wrong, Toast.LENGTH_SHORT).show();
                    }
                });
    }


    private void setWebView(NewDetail news) {
        view = getView();
        WebView webView = view.getWebView();
        ImageView webImg = view.getWebImg();
        TextView imgTitle = getView().getImgTitle();
        TextView imgSource = getView().getImgSource();

        // TODO: 2016/9/20
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        String head = "<head>\n" +
                "\t<link rel=\"stylesheet\" href=\""+news.getCss().get(0)+"\"/>\n" +
                "</head>";
        String img = "<div class=\"headline\">";
        String html =head + news.getBody().replace(img," ");
        webView.loadDataWithBaseURL(null,html,"text/html","utf-8",null);

        Glide.with(mContext).load(news.getImage()).centerCrop().into(webImg);
        imgTitle.setText(news.getTitle());
        imgSource.setText(news.getImage_source());
    }

    public void destroyImg() {
        // TODO: 2016/9/20
    }
}
