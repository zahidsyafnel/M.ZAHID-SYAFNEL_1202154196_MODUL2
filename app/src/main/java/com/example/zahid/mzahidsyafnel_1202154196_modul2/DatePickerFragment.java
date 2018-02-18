package com.example.zahid.mzahidsyafnel_1202154196_modul2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // fungsi ini untuk mengambil tanggal bulan dan tahun
        final Calendar k = Calendar.getInstance();
        int year = k.get(Calendar.YEAR);
        int month = k.get(Calendar.MONTH);
        int day = k.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it.
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int x, int y, int z) {
     //Untuk melakukan set tanggal bulan dan tahun yang dipilih
        TakeAway activity = (TakeAway) getActivity();
        // Invoke Main Activity's processDatePickerResult() method.
        activity.processDatePickerResult(x, y, z);
    }
}
