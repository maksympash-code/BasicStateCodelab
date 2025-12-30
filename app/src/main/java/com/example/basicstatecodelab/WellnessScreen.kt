package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
    ) {
        StatefulCounter(modifier)

        val list = remember { getWellnessTasksList().toMutableStateList() }
        WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })
    }

}


private fun getWellnessTasksList() = List(30) { i -> WellnessTask(i, "Item $i") }