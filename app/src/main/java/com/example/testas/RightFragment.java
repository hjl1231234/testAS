package com.example.testas;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.example.testas.LeftFragment.FTag;

public class RightFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.right_fragment, container, false);
        return view;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(FTag, "attach" + "  " + this + " ");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(FTag, "create" + "  " + this + " ");

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(FTag, "activitycreated" + "  " + this + " ");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(FTag, "start" + "  " + this + " ");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(FTag, "resume" + "  " + this + " ");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(FTag, "pause" + "  " + this + " ");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(FTag, "stop" + "  " + this + " ");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(FTag, "destroyview" + "  " + this + " ");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(FTag, "destroy" + "  " + this + " ");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(FTag, "detach" + "  " + this + " ");

    }
}