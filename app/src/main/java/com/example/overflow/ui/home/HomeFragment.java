package com.example.overflow.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.overflow.R;
import com.example.overflow.databinding.FragmentHomeBinding;
import com.example.overflow.SamplePledge;
import com.example.overflow.databinding.FragmentLocationsBinding;
import com.example.overflow.ui.locations.LocationsViewModel;

public class HomeFragment extends Fragment  {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

//        View view = inflater.inflate(R.layout.fragment_home, container, false);
//
//        ImageView imageBrocolli = (ImageView) view.findViewById(R.id.todayBroccoli);
//        imageBrocolli.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent pledgeIntent = new Intent(v.getContext(), SamplePledge.class);
//                startActivity(pledgeIntent);
//            }
//        });
//        return view;

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        ImageView imageBrocolli = (ImageView) root.findViewById(R.id.todayBroccoli);
        imageBrocolli.setClickable(true);
        imageBrocolli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent pledgeIntent = new Intent(v.getContext(), SamplePledge.class);
//                startActivity(pledgeIntent);
                Toast.makeText(root.getContext(), "Feature coming soon", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}