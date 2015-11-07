package com.rosenberg.shaul.secondassignment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ListView;
import android.app.AlertDialog;



public class TaskListActivity extends AppCompatActivity {

    AlertDialog alertDialogStores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        showPopUp();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_task_list, menu);
        return true;
    }

    public void showPopUp(){

        // add your items, this can be done programatically
        // your items can be from a database
        taskItem[] taskItemData = new taskItem[20];

        taskItemData[0] = new taskItem(91, "Drive");
        taskItemData[1] = new taskItem(92, "Smile");
        taskItemData[2] = new taskItem(93, "Learn");
        taskItemData[3] = new taskItem(94, "Puregold");
        taskItemData[4] = new taskItem(95, "Task");
        taskItemData[5] = new taskItem(96, "MultiTask");
        taskItemData[6] = new taskItem(97, "Ministop");
        taskItemData[7] = new taskItem(98, "Fat Chicken");
        taskItemData[8] = new taskItem(99, "Master Siomai");
        taskItemData[9] = new taskItem(100, "Mang Inasal");
        taskItemData[10] = new taskItem(101, "Play");
        taskItemData[11] = new taskItem(102, "Dance");
        taskItemData[12] = new taskItem(103, "Laugh");
        taskItemData[13] = new taskItem(104, "Learn2");
        taskItemData[14] = new taskItem(105, "Learn3");

        // our adapter instance
        ArrayAdapterItem adapter = new ArrayAdapterItem(this, R.layout.list_view_row_item, taskItemData);

        // create a new ListView, set the adapter and item click listener
        ListView listViewItems = new ListView(this);
        listViewItems.setAdapter(adapter);
        listViewItems.setOnItemClickListener(new OnItemClickListenerListViewItem());

        // put the ListView in the pop up


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    //move to CreateTask activity
    public void viewCreateTask(View view) {
        Intent intent = new Intent(this, CreateTaskActivity.class);
        startActivity(intent);
    }
}
