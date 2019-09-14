package com.burhan.todo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button addButton;
        addButton = (Button) findViewById(R.id.addbutton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            PopupMenu popupMenu;
                popupMenu = new PopupMenu(MainActivity.this, addButton );
                popupMenu.getMenuInflater().inflate(R.menu.addmenu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item)
                    {
//                        Toast.makeText(MainActivity.this,""+item.getTitle(),Toast.LENGTH_SHORT);
                        Intent I = new Intent(MainActivity.this, addnote.class);
                        startActivity(I);
                        return true;

                    }
                });
                popupMenu.show();
            }

        });
    }
}
