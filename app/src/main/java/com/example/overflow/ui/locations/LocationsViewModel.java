package com.example.overflow.ui.locations;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LocationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LocationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is pick up fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}