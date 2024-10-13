package club.siwoo.doitflow.ui.calendar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CalendarViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CalendarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("The Calendar Embed Is Going To Be Here Soon!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}