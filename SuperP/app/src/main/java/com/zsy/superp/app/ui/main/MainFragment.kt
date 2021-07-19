package com.zsy.superp.app.ui.main

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zsy.superp.R
import com.zsy.superp.java.util.LogUtils

class MainFragment : Fragment() {

    lateinit var mActivity:Activity

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        LogUtils.e("F === onAttach")
        synchronized(this){
            mActivity = activity
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        LogUtils.e("F === onActivityCreated")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        LogUtils.e("F === onCreateView")

        val view = inflater.inflate(R.layout.fragment_main,container)
        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.e("F === onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        LogUtils.e("F === onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        LogUtils.e("F === onStart")
    }

    override fun onResume() {
        super.onResume()
        LogUtils.e("F === onResume")
    }

    override fun onPause() {
        super.onPause()
        LogUtils.e("F === onPause")
    }

    override fun onStop() {
        super.onStop()
        LogUtils.e("F === onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtils.e("F === onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        LogUtils.e("F === onDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        LogUtils.e("F === onDetach")
    }
}