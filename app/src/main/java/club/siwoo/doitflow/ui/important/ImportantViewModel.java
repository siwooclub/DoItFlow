package club.siwoo.doitflow.ui.important;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ImportantViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ImportantViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Important Components Will Be Displayed Here!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}