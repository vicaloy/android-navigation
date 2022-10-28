package com.valoy.tutorial.ui.main

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.valoy.tutorial.databinding.FragmentFirstTutorialBinding

/**
 * A placeholder fragment containing a simple view.
 */
class FirstTutorialFragment : Fragment() {

    private lateinit var firstTutorialViewModel: FirstTutorialViewModel
    private var _binding: FragmentFirstTutorialBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        firstTutorialViewModel = ViewModelProvider(this).get(FirstTutorialViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstTutorialBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.homeDialogButton.setOnClickListener {
            val uri = Uri.parse("myapp://home/dialog")
            val intent = Intent(Intent.ACTION_VIEW, uri).apply {
                setPackage(requireContext().packageName)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }

            requireContext().startActivity(intent)
        }

        binding.homeButton.setOnClickListener {
            val uri = Uri.parse("myapp://home")
            val intent = Intent(Intent.ACTION_VIEW, uri).apply {
                setPackage(requireContext().packageName)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }

            requireContext().startActivity(intent)
        }

        binding.dashboardButton.setOnClickListener {
            val uri = Uri.parse("myapp://dashboard")
            val intent = Intent(Intent.ACTION_VIEW, uri).apply {
                setPackage(requireContext().packageName)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }

            requireContext().startActivity(intent)
        }

        binding.dashboardDialogButton.setOnClickListener {
            val uri = Uri.parse("myapp://home/dashboard/dialog")
            val intent = Intent(Intent.ACTION_VIEW, uri).apply {
                setPackage(requireContext().packageName)
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }

            requireContext().startActivity(intent)
        }

    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): FirstTutorialFragment {
            return FirstTutorialFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}