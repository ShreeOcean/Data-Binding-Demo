package com.ocean.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.ocean.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;
    private MainActivityViewModelFactory viewModelFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        viewModelFactory = new MainActivityViewModelFactory(new MutableLiveData<>(101));
        viewModel = new ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel.class);

        binding.setLifecycleOwner(this);
        binding.setMyViewModel(viewModel);
    }
}