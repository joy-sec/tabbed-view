package sust.hackathon.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by joy on 10/4/17.
 */

public class FragmentOne extends Fragment {


    View view;
    private TextView textView;
    private Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_one_layout,container,false);

        textView=(TextView)view.findViewById(R.id.textView);
        button=(Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("CLICKED !!!!!!!!!");
            }
        });

        return view;

    }
}
