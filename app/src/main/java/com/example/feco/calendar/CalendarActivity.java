package com.example.feco.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.widget.CalendarView;

/**
 * Created by feco on 2017.05.27..
 */

public class CalendarActivity extends AppCompatActivity{

    private static final String TAG = "CalendarActivity";

    private CalendarView mCalendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = year + "." + (month + 1) + "." + dayOfMonth;
                Log.d(TAG, "onSelectDay Change: date: "+ date);

                Intent intent = new Intent(CalendarActivity.this, MainActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);

            }
        });
    }
}
