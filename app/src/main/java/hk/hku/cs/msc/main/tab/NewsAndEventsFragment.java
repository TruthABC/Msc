package hk.hku.cs.msc.main.tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import java.util.ArrayList;

import hk.hku.cs.msc.R;
import hk.hku.cs.msc.main.InnerPagerAdapter;

public class NewsAndEventsFragment extends Fragment {

    // storing sub pages
    private ArrayList<View> views;
    private ArrayList<String> titles;

    private ViewPager mViewPager;
    private PagerTabStrip mViewPagerTab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_about, container, false);

        initViews(rootView);
        initSubPages();
        initPager(rootView);
        initEvents();
        initFinal();

        return rootView;
    }

    private void initViews(View v) {
        mViewPager = v.findViewById(R.id.about_pager);
        mViewPagerTab = v.findViewById(R.id.about_pager_tab);
    }

    private void initSubPages() {
        views = new ArrayList<>();
        titles = new ArrayList<>();

        // put sub views of this tab into arraylist
        {
            View v1 = View.inflate(getActivity(), R.layout.cu_programme_overview, null);
            WebView webView = v1.findViewById(R.id.web_view);
            webView.loadUrl("https://www.msc-cs.hku.hk/NewsnEvents");
            views.add(v1);
        }
//        views.add(View.inflate(getActivity(), R.layout.news, null));
        titles.add("News And Events");
    }

    private void initPager(View rootView) {
        // transfer views to adapter
        InnerPagerAdapter adapter = new InnerPagerAdapter(views, titles);
        mViewPager.setAdapter(adapter);
    }

    private void initEvents() {
//        mViewPager.addOnPageChangeListener();
    }
    private void initFinal() {

    }

}
