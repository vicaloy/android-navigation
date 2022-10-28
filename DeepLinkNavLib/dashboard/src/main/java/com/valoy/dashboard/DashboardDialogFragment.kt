package com.valoy.dashboard

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class DashboardDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setMessage("Dashboard dialog")
            .setPositiveButton("Ok") { _,_ -> }
            .create()

    companion object {
        const val TAG = "DashboardDialogFragment"
    }
}