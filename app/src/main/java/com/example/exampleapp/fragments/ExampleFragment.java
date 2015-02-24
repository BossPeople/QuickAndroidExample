package com.example.exampleapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.exampleapp.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by zwilson on 2/19/15.
 */
public class ExampleFragment extends Fragment {


    @InjectView(R.id.editText)
    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_layout, null);
        ButterKnife.inject(this, v);
        return v;
    }
}
