package com.valoy.deeplinknavlib.ui.home

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class HomeDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setMessage("Home dialog")
            .setPositiveButton("Ok") { _,_ -> }
            .create()

    companion object {
        const val TAG = "HomeDialogFragment"
    }
}