package com.allaber.numbercomposition.domain.repository

import com.allaber.numbercomposition.domain.entity.GameSettings
import com.allaber.numbercomposition.domain.entity.Level
import com.allaber.numbercomposition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question

    fun getGameSettings(level: Level): GameSettings
}
