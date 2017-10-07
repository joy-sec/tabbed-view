package sust.hackathon.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by joy on 10/4/17.
 */

public class FragmentThree extends Fragment {


    View view;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_three_layout,container,false);

        return view;
    }
}
