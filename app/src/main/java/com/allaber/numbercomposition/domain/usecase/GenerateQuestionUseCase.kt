package com.allaber.numbercomposition.domain.usecase

import com.allaber.numbercomposition.domain.entity.Question
import com.allaber.numbercomposition.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val gameRepository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question {
        return gameRepository.generateQuestion(
            maxSumValue = maxSumValue,
            countOfOptions = COUNT_OF_OPTIONS
        )
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}
