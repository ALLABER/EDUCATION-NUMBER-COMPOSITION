package com.allaber.numbercomposition.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.allaber.numbercomposition.R
import com.allaber.numbercomposition.databinding.FragmentChooseLevelBinding
import com.allaber.numbercomposition.domain.entity.Level
import com.allaber.numbercomposition.presentation.view.GameFragment.Companion.GAME_FRAGMENT_NAME

class ChooseLevelFragment : Fragment() {

    private var _binding: FragmentChooseLevelBinding? = null
    private val binding: FragmentChooseLevelBinding
        get() = _binding ?: error("ChooseLevelFragment == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChooseLevelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            buttonLevelTest.setOnClickListener {
                launchGameFragmentFragment(Level.TEST)
            }
            buttonLevelEasy.setOnClickListener {
                launchGameFragmentFragment(Level.EASY)
            }
            buttonLevelNormal.setOnClickListener {
                launchGameFragmentFragment(Level.NORMAL)
            }
            buttonLevelHard.setOnClickListener {
                launchGameFragmentFragment(Level.HARD)
            }
        }
    }

    private fun launchGameFragmentFragment(level: Level) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.mainContainer, GameFragment.newInstance(level))
            .addToBackStack(GAME_FRAGMENT_NAME)
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        const val CHOOSE_LEVEL_FRAGMENT_NAME = "ChooseLevelFragment"

        fun newInstance(): ChooseLevelFragment {
            return ChooseLevelFragment()
        }
    }
}
