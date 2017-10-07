package sust.hackathon.fragmenttest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout myTabs;
    private ViewPager myVP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //initialize
        myTabs = (TabLayout) findViewById(R.id.tabLayout);
        myVP = (ViewPager) findViewById(R.id.viewPager);

        setUpPager(myVP);
        myTabs.setupWithViewPager(myVP);

    }

    void setUpPager(ViewPager vp){


        setUpMyViewPager vpa=new setUpMyViewPager(getSupportFragmentManager());

        vpa.addToFragment(new FragmentOne(),"One");
        vpa.addToFragment(new FragmentTwo(),"Two");
        vpa.addToFragment(new FragmentThree(),"Three");


        vp.setAdapter(vpa);

    }

    class setUpMyViewPager extends FragmentPagerAdapter{

        private final List<Fragment> my_lists=new ArrayList<>();
        private final List<String> my_titles=new ArrayList<>();



        public setUpMyViewPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return my_lists.get(position);
        }

        @Override
        public int getCount() {
            return my_lists.size();
        }

        void addToFragment(Fragment fm,String title){

            my_lists.add(fm);
            my_titles.add(title);

        }


        @Override
        public CharSequence getPageTitle(int position) {
            return my_titles.get(position);
        }
    }


}
