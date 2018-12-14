package hk.hku.cs.msc.main;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * user for sub tab and sub pages
 */
public class InnerPagerAdapter extends PagerAdapter {

    private ArrayList<View> views;
    private ArrayList<String> titles;

    public InnerPagerAdapter (ArrayList<View> views, ArrayList<String> titles) {
        this.views = views;
        this.titles = titles;
    }

    @Override
    public int getCount() {
        return views.size();
    }

    // when going to next page
    @Override
    public View instantiateItem(ViewGroup container, final int position) {
        View v = views.get(position);
        container.addView(v);
        return v;
    }

    // if is the same page
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    // when leave one page
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    // for setting viewPagerTab
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

}
