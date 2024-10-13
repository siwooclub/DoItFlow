package club.siwoo.doitflow.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("You don't have any thing set up yet! Get Started By Clicking the + Button Down There!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}