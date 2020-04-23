package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * Created by Kuan Wah Teo on 23/04/2020
 **/

class ScoreViewModel(finalScore: Int): ViewModel() {
    // The final score
    var score = finalScore

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}