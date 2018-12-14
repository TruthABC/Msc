package hk.hku.cs.msc.main.tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import hk.hku.cs.msc.MainActivity;
import hk.hku.cs.msc.R;
import hk.hku.cs.msc.main.overview.SliderPagerAdapter;

public class OverviewFragment extends Fragment {

    private ViewPager mSliderPager;
    private TextView mSliderText;

    //for forward jump
    private Button mButtonOverview;
    private CardView mCardKPChow;
    private Button mButtonAd;
    private CardView mCardSchedule;
    private CardView mCardFee;
    private CardView mCardDDL;


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

        mButtonOverview = v.findViewById(R.id.btn_overview);
        mCardKPChow = v.findViewById(R.id.card_kpchow);
        mButtonAd = v.findViewById(R.id.btn_ad2019);
        mCardSchedule = v.findViewById(R.id.card_schedule);
        mCardFee = v.findViewById(R.id.card_fee);
        mCardDDL = v.findViewById(R.id.card_ddl);
    }

    private void initSlider(View rootView) {
        SliderPagerAdapter adapter = new SliderPagerAdapter(getActivity());
        mSliderPager.setAdapter(adapter);
        mSliderPager.addOnPageChangeListener(adapter);
    }

    private void initEvents() {
        mButtonOverview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).forwardJump(3, 0);
            }
        });
        mCardKPChow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).forwardJump(1, 1);
            }
        });
        mButtonAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).forwardJump(2, 0);
            }
        });
        mCardSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).forwardJump(3, 2);
            }
        });
        mCardFee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).forwardJump(2, 2);
            }
        });
        mCardDDL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).forwardJump(2, 1);
            }
        });
    }

    private void initFinal() {
        mSliderText.setText(SliderPagerAdapter.sliderTexts[0]);
        mSliderPager.setCurrentItem(0);
    }

}
