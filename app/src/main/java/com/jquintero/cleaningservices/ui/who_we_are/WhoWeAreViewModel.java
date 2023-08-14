package com.jquintero.cleaningservices.ui.who_we_are;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WhoWeAreViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public WhoWeAreViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("¿Quienes Somos?");
    }

    public LiveData<String> getText() {
        return mText;
    }
}