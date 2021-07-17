package com.benjamin.retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

/*new file*/
class MainViewModel: ViewModel() {
    val items: MutableLiveData<List<Todo>> = MutableLiveData()

    fun getAllTodos (){
        CoroutineScope(Dispatchers.IO).launch{
            val todos :List<Todo> = RetrofitProvider.service.getAllTodos()
            items.postValue(todos)
        }



    }


}