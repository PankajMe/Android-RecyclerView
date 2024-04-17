package com.example.myrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<NewUser> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        list.add(new NewUser("cnjdn1djf","123","nsansjn @gmail"));
        list.add(new NewUser("cnjd2djf","1234","nsansjn @gmail"));
        list.add(new NewUser("cnjdn3djf","12345","nsansjn @gmail"));
        list.add(new NewUser("cnjdn4djf","123456","nsansjn @gmail"));
        list.add(new NewUser("cnjdn5djf","1234567","nsansjn @gmail"));
        list.add(new NewUser("cndjf6","12345678","nsansjn @gmail"));
        list.add(new NewUser("cnjdn7djf","123456789","nsansjn @gmail"));

    }
}