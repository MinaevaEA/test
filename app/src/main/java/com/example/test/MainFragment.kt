package com.example.test

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test.databinding.FragmentMainBinding



class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentMainBinding.inflate(inflater, container, false).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("main", "onViewCreated-main")
        binding.btnNext.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.activity_main, TwoFragment.newInstance())
                .commit()
        }
        binding.btnList.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.activity_main, ListFragment.newInstance())
                .commit()
        }
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("main", "onAttach-main")
    }

    override fun onStart() {
        super.onStart()
        Log.d("main", "onStart-main")
    }

    override fun onResume() {
        super.onResume()
        Log.d("main", "onResume-main")
    }

    override fun onPause() {
        super.onPause()
        Log.d("main", "onPause-main")
    }

    override fun onStop() {
        super.onStop()
        Log.d("main", "onStop-main")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("main", "onDestroyView-main")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("main", "onDestroy-main")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("main", "onDetach-main")
    }
}







