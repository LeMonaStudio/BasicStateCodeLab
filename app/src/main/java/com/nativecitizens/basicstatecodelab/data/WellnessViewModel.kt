package com.nativecitizens.basicstatecodelab.data


import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.nativecitizens.basicstatecodelab.model.WellnessTask


class WellnessViewModel: ViewModel(){

    private val _tasks = getWellnessTaskList().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun updateTaskChecked(task: WellnessTask, checkState: Boolean){
        tasks.find { it.id == task.id }?.let { tsk ->
            tsk.checked = checkState
        }
    }

    private fun getWellnessTaskList(): List<WellnessTask> =
        List(30) { i -> WellnessTask(i, "Task # $i") }

}
