package com.ocean.databindingdemo;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MainActivityViewModelFactory implements ViewModelProvider.Factory {

    MutableLiveData<Integer> count;

    public MainActivityViewModelFactory(MutableLiveData<Integer> count) {
        this.count = count;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {

        if (modelClass.isAssignableFrom(MainActivityViewModel.class)){
            return (T) new MainActivityViewModel(count);
        }
        throw new IllegalArgumentException("Unknown view model class");
    }
}
