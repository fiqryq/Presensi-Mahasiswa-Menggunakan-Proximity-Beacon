package com.mango.autumnleaves.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.mango.autumnleaves.R;
import com.mango.autumnleaves.activity.base.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeDosenFragment extends BaseFragment {

    public HomeDosenFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_dosen, container, false);
    }

}


