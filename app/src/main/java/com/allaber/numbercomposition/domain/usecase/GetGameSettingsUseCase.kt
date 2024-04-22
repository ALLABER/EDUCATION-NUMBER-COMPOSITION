package com.allaber.numbercomposition.domain.usecase

import com.allaber.numbercomposition.domain.entity.GameSettings
import com.allaber.numbercomposition.domain.entity.Level
import com.allaber.numbercomposition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val gameRepository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return gameRepository.getGameSettings(level = level)
    }
}
