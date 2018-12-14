package hk.hku.cs.msc.main.tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import hk.hku.cs.msc.R;
import hk.hku.cs.msc.main.InnerPagerAdapter;

public class AdmissionFragment extends Fragment {

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
        views.add(View.inflate(getActivity(), R.layout.admission_admission_requirements, null));
        views.add(View.inflate(getActivity(), R.layout.admission_application_procedures, null));
        views.add(View.inflate(getActivity(), R.layout.admission_composition_fees, null));
        views.add(View.inflate(getActivity(), R.layout.admission_words_from_students_and_graduates, null));
        views.add(View.inflate(getActivity(), R.layout.admission_information_sessions, null));
        views.add(View.inflate(getActivity(), R.layout.admission_faq, null));
        titles.add("Admission Requirements");
        titles.add("Application Procedures");
        titles.add("Composition Fees");
        titles.add("Words from Students and Graduates");
        titles.add("Information Sessions");
        titles.add("FAQ");

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

    public void forwardJump(int targetSubPage) {
        mViewPager.setCurrentItem(targetSubPage);
    }
}
