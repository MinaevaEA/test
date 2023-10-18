package com.example.test


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.databinding.FragmentListBinding


class ListFragment : Fragment() {
    var dataSet = listOf(Data("vbvfjv", "vfjvnfjv"), Data("vbvfjv", "vfjvnfjv"))
    private lateinit var binding: FragmentListBinding
    private lateinit var adapter: Adapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentListBinding.inflate(inflater, container, false).also {
        binding = it
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = Adapter(requireContext(), dataSet)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        Log.d("1", "onCreateList")
    }

    companion object {
        fun newInstance(): ListFragment = ListFragment()
    }
}
