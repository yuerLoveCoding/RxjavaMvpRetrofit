package com.yuer.study.module.news.article;

import com.yuer.study.bean.news.MultiNewsArticleDataBean;
import com.yuer.study.module.base.IBaseListView;
import com.yuer.study.module.base.IBasePresenter;

import java.util.List;

/**
 * Created by Meiji on 2017/5/18.
 */

public interface INewsArticle {

    interface View extends IBaseListView<Presenter> {

        /**
         * 请求数据
         */
        void onLoadData();

        /**
         * 刷新
         */
        void onRefresh();
    }

    interface Presenter extends IBasePresenter {

        /**
         * 请求数据
         */
        void doLoadData(String... category);

        /**
         * 再起请求数据
         */
        void doLoadMoreData();

        /**
         * 设置适配器
         */
        void doSetAdapter(List<MultiNewsArticleDataBean> dataBeen);

        /**
         * 加载完毕
         */
        void doShowNoMore();
    }
}
