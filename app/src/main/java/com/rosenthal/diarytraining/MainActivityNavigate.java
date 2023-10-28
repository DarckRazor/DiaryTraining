package com.rosenthal.diarytraining;

import android.annotation.SuppressLint;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rosenthal.diarytraining.profile.ProfileFragment;
import com.rosenthal.diarytraining.teams.TeamFragment;
import com.rosenthal.diarytraining.training.TrainingFragment;
import org.jetbrains.annotations.NotNull;

public class MainActivityNavigate extends AppCompatActivity {
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onNavigationItemSelected(@NotNull MenuItem item) {
            int itemId = item.getItemId();

            if (itemId == R.id.navigation_profile && !(getCurrentFragment() instanceof ProfileFragment)) {
                loadFragment(ProfileFragment.newInstance());
                return true;
            } else if (itemId == R.id.navigation_teams && !(getCurrentFragment() instanceof TeamFragment)) {
                loadFragment(TeamFragment.newInstance());
                return true;
            } else if (itemId == R.id.navigation_taraining && !(getCurrentFragment() instanceof TrainingFragment)) {
                loadFragment(TrainingFragment.newInstance());
                return true;
            }
            return true;
        }
    };

    private Fragment getCurrentFragment() {
        return getSupportFragmentManager().findFragmentById(R.id.frameLayout);
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigate);

        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigationView.setSelectedItemId(R.id.navigation_profile);
    }
}