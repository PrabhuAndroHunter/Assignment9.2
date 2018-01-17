package com.assignment;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.toString();

    // menu item id's
    private static final int MENU_ITEM_COMPUTER = 1;
    private static final int MENU_ITEM_GAMEPAD = 2;
    private static final int MENU_ITEM_CAMERA = 3;
    private static final int MENU_ITEM_VIDEO = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // initialise layout
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
    }

    // This override method will create option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // add menu items
        menu.add(Menu.NONE, MENU_ITEM_COMPUTER, 1, "Computer");
        menu.add(Menu.NONE, MENU_ITEM_GAMEPAD, 1, "Gamepad");
        menu.add(Menu.NONE, MENU_ITEM_CAMERA, 1, "Camera");
        menu.add(Menu.NONE, MENU_ITEM_VIDEO, 1, "Video");
        Log.d(TAG, "onCreateOptionsMenu: ");
        return true;
    }

    // This method will call when option item is selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) { //  switch is used to identify the menu item
            case MENU_ITEM_COMPUTER:
                Toast.makeText(this, "COMPUTER", Toast.LENGTH_SHORT).show(); // show Toast when select computer
                break;

            case MENU_ITEM_GAMEPAD:
                Toast.makeText(this, "GAMEPAD", Toast.LENGTH_SHORT).show(); // show Toast when select GAMEPAD
                break;

            case MENU_ITEM_CAMERA:
                Toast.makeText(this, "CAMERA", Toast.LENGTH_SHORT).show();  // show Toast when select CAMERA
                break;

            case MENU_ITEM_VIDEO:
                Toast.makeText(this, "VIDEO", Toast.LENGTH_SHORT).show();  // show Toast when select VIDEO
                break;
        }
        return true;
    }
}
