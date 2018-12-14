package hk.hku.cs.msc.main.overview;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import hk.hku.cs.msc.R;

public class SliderPagerAdapter extends PagerAdapter implements ViewPager.OnPageChangeListener {

    public static int[] sliderImages = {R.drawable.slider1, R.drawable.slider_admission};
    public static String[] sliderTexts = {"MASTER OF SCIENCE IN COMPUTER SCIENCE", "MASTER THE TECHNOLOGY AND STAY AHEAD"};

    private FragmentActivity activity;

    private ArrayList<ImageView> views;

    public SliderPagerAdapter(FragmentActivity activity) {
        this.activity = activity;
        views = new ArrayList<>();
        for (int si: sliderImages) {
            ImageView imageView= new ImageView(activity);
            imageView.setImageResource(si);
            views.add(imageView);
        }
    }

    @Override
    public int getCount() {
        return sliderImages.length;
    }

    @Override
    public View instantiateItem(ViewGroup container, final int position) {
        ImageView v = views.get(position);
        container.addView(v);
        return v;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    //ViewPager.OnPageChangeListener
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        // change view and text
        TextView imageTextView = activity.findViewById(R.id.image_text);
        imageTextView.setText(sliderTexts[position]);
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
