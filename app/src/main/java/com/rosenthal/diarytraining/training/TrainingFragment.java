package com.rosenthal.diarytraining.training;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rosenthal.diarytraining.R;

public class TrainingFragment extends Fragment {

    public TrainingFragment() {
        // Required empty public constructor
    }

    public static TrainingFragment newInstance(){
        return new TrainingFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_training, container, false);
    }
}