package com.example.ekasilabalexcdtb.attendance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int attendance = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void increment(View view){
        attendance  = attendance + 1;
        displayQuantity(attendance);
    }
    /**
     * This method is called when the order button is clicked.
     */

    public void decrement(View view) {
        if (attendance == 1) {
            // show error message as a toast
            Toast.makeText(this, "can not have less than 1 person", Toast.LENGTH_SHORT).show();
            // Exit this method early because there`s nothing left to do
            return;
        }
        attendance = attendance - 1;
        displayQuantity(attendance);
    }

    public void resetAttendance(View v){
        attendance  = 0;
        displayQuantity(attendance);

    }





    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView)findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


}
