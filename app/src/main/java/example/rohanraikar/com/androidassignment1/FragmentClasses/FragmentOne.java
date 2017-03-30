package example.rohanraikar.com.androidassignment1.FragmentClasses;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import example.rohanraikar.com.androidassignment1.R;

/**
 * Created by Rohan.Raikar on 30/03/2017.
 */

public class FragmentOne extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_one_activity,container,false);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"You have clicked Fragment 1",Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
}
