package com.example.schooly;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.support.v4.app.INotificationSideChannel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class AuthorizationFragment extends Fragment {
    int fragmentType;
    public AuthorizationFragment(int fragmentType) {
       this.fragmentType = fragmentType;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view;
        switch(fragmentType) {
            case 1:
                view = inflater.inflate(R.layout.authorization_fragment_1, container, false);
                break;
            case 2:
                view = inflater.inflate(R.layout.authorization_fragment_2, container, false);
                break;
            case 3:
                view = inflater.inflate(R.layout.authorization_fragment_3, container, false);
                break;
            default:
                view = inflater.inflate(R.layout.authorization_fragment_1, container, false);
        }
        return view;
    }
}