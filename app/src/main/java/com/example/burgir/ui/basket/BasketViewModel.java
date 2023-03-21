package com.example.burgir.ui.basket;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BasketViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BasketViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Basket fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}