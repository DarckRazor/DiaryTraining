package com.rosenthal.diarytraining.profile.tabLayout.training;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rosenthal.diarytraining.R;

public class TrainingFragmentProfile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_training_profile, container, false);

    }
}