package hk.hku.cs.msc.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import hk.hku.cs.msc.main.tab.AboutFragment;
import hk.hku.cs.msc.main.tab.AdmissionFragment;
import hk.hku.cs.msc.main.tab.CurriculumFragment;
import hk.hku.cs.msc.main.tab.GraduateAndAlumniFragment;
import hk.hku.cs.msc.main.tab.NewsAndEventsFragment;
import hk.hku.cs.msc.main.tab.OverviewFragment;
import hk.hku.cs.msc.main.tab.StudentResourcesFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    public static final String[] TITLES = {"Overview","About","Admission","Curriculum","Graduate & Alumni","News & Events","Student Resources"};
    private Fragment[] fragments;

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments = new Fragment[7];
    }

    @Override
    public Fragment getItem(int position) {
        if (fragments[position] == null) {
            switch (position) {
                case 0: fragments[position] = new OverviewFragment(); break;
                case 1: fragments[position] = new AboutFragment(); break;
                case 2: fragments[position] = new AdmissionFragment(); break;
                case 3: fragments[position] = new CurriculumFragment(); break;
                case 4: fragments[position] = new GraduateAndAlumniFragment(); break;
                case 5: fragments[position] = new NewsAndEventsFragment(); break;
                case 6: fragments[position] = new StudentResourcesFragment(); break;
            }
        }
        return fragments[position];
    }

    @Override
    public int getCount() {
        return TITLES.length;
    }
}
