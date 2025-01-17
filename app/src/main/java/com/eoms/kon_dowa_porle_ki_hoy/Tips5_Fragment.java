package com.eoms.kon_dowa_porle_ki_hoy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.eoms.kon_dowa_porle_ki_hoy.MainActivity;
import com.eoms.kon_dowa_porle_ki_hoy.OnBackPressed;
import com.eomsbd.kon_dowa_porle_ki_hoy.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tips5_Fragment extends Fragment implements OnBackPressed {
    LinearLayout button;


    public Tips5_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tips5_, container, false);

        button=view.findViewById(R.id.backButton5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
                getActivity().finish();
            }
        });
        return view;
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getActivity(),MainActivity.class);
        startActivity(intent);
    }
}
