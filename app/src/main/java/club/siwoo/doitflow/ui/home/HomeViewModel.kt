package club.siwoo.doitflow.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Nothing Here! Start Planning by clicking the + Button Below!"
    }
    val text: LiveData<String> = _text
}