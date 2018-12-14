package hk.hku.cs.msc.main.tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import hk.hku.cs.msc.R;
import hk.hku.cs.msc.main.overview.SliderPagerAdapter;

public class OverviewFragment extends Fragment {

    private ViewPager mSliderPager;
    private TextView mSliderText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_overview, container, false);

        initViews(rootView);
        initSlider(rootView);
        initEvents();
        initFinal();

        return rootView;
    }

    private void initViews(View v) {
        mSliderPager = v.findViewById(R.id.view_pager);
        mSliderText = v.findViewById(R.id.image_text);
    }

    private void initSlider(View rootView) {
        SliderPagerAdapter adapter = new SliderPagerAdapter(getActivity());
        mSliderPager.setAdapter(adapter);
        mSliderPager.addOnPageChangeListener(adapter);
    }

    private void initEvents() {

    }

    private void initFinal() {
        mSliderText.setText(SliderPagerAdapter.sliderTexts[0]);
        mSliderPager.setCurrentItem(0);
    }

}
