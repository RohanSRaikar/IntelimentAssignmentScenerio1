package example.rohanraikar.com.androidassignment1.AdapterClasses;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import example.rohanraikar.com.androidassignment1.FragmentClasses.FragmentFour;
import example.rohanraikar.com.androidassignment1.FragmentClasses.FragmentOne;
import example.rohanraikar.com.androidassignment1.FragmentClasses.FragmentThree;
import example.rohanraikar.com.androidassignment1.FragmentClasses.FragmentTwo;

/**
 * Created by Rohan.Raikar on 30/03/2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                //Display 1st fragment class
                return new FragmentOne();
            case 1:
                //Display 2nd fragment class
                return new FragmentTwo();
            case 2:
                //Display Fragment 3
                return new FragmentThree();
            case 3:
                //display fragment 4
                return new FragmentFour();
        }
        return null;
    }

    @Override
    public int getCount() {
        //Getting total number of fragment counts
        return 4;
    }
}
