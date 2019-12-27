package com.example.phonebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] IMAGES=
            {
                    R.drawable.frnd1,
                    R.drawable.frnd2,
                    R.drawable.frnd3,
                    R.drawable.frnd4,
                    R.drawable.frnd5,
                    R.drawable.frnd6,
            };
    String[] Names=
            {
                "Arpan","Rahul","Rudra","Sam","Sumon","Sumit"
            };
    String[] Phones=
            {
                "1234","4567","7563","6738","6452","6297"
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list=findViewById(R.id.list);
        CustomAdapter customAdapter=new CustomAdapter();
        list.setAdapter(customAdapter);
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.viewlayout,null);
            ImageView img=view.findViewById(R.id.img);
            TextView text_name=view.findViewById(R.id.text);
            TextView text_phone=view.findViewById(R.id.text_phone);

            img.setImageResource(IMAGES[i]);

            text_name.setText(Names[i]);
            text_phone.setText(Phones[i]);

            return view;
        }
    }
}
