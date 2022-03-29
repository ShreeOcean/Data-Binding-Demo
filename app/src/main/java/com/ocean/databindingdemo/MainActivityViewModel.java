package com.ocean.databindingdemo;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    //TODO: LiveData Demo
    public MutableLiveData<Integer> count = new MutableLiveData<>();

    public MainActivityViewModel(MutableLiveData<Integer> count) {
        this.count = count;
    }

    public void setCurrentCount(){
        count.postValue(count.getValue());
    }

    public void getCurrentCount(){
        count.postValue(count.getValue() + 1);
    }
}
