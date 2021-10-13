package com.developer.johhns.fragmentos02;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private MutableLiveData<CharSequence> texto = new MutableLiveData<>();

    public void setTexto(CharSequence input) {
        texto.setValue(input);
    }

    public LiveData<CharSequence> getTexto() {
        return texto;
    }

}
