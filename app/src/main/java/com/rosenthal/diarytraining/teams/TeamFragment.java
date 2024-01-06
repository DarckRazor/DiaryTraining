package com.rosenthal.diarytraining.teams;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.rosenthal.diarytraining.DataBaseConects;
import com.rosenthal.diarytraining.R;
import com.rosenthal.diarytraining.profile.ProfileFragment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamFragment extends Fragment {
    public TeamFragment() {
        // Required empty public constructor
    }

    public static TeamFragment newInstance(){
        return new TeamFragment();
    }

    public TextView resultTextView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_team, container, false);
        resultTextView = v.findViewById(R.id.asd);
        new DatabaseTask().execute();
        return  v;
    }

    private class DatabaseTask extends AsyncTask<Void, Void, String> {

        @Override
        protected String doInBackground(Void... voids) {
            try {
                Connection connection = DataBaseConects.connect();
                if (connection != null) {
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM roles");
                    ResultSet resultSet = preparedStatement.executeQuery();

                    StringBuilder result = new StringBuilder();
                    while (resultSet.next()) {
                        String columnName = resultSet.getString("name_roles");
                        // Добавьте обработку данных к result
                        result.append(columnName).append("\n");
                    }

                    resultSet.close();
                    preparedStatement.close();
                    connection.close();

                    return result.toString();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return "Error: " + e.getMessage();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String result) {
            resultTextView.setText(result);
        }
    }
}