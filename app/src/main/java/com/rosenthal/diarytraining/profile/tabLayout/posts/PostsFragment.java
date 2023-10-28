package com.rosenthal.diarytraining.profile.tabLayout.posts;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rosenthal.diarytraining.R;

public class PostsFragment extends Fragment {

    public static  PostsFragment newInstance(){
        return new PostsFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_posts, container, false);
    }
}