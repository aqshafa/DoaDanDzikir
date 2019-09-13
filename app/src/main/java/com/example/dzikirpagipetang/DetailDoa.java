package com.example.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class DetailDoa extends AppCompatActivity {

    ListView ListDoa;

    String[] iddoa = {"doa1",
            "doa2",
            "doa3",
            "doa4",
            "doa5",
            "doa6",
            "doa7",
            "doa8",
            "doa9",
            "doa10",
            "doa11",
            "doa12",
            "doa13",
            "doa14",
            "doa15",
    };

    String[] doa = {"1. Doa bangun tidur",
            "2. Doa ketika bersin dan Mendengar orang lain bersin",
            "3. Doa saat mau makan",
            "4. Doa saat lupa baca doa sebelum makan",
            "5. Doa sesudah makan",
            "6. Doa sebelum belajar",
            "7. Doa setelah wudhu",
            "8. Doa masuk kamar mandi / WC / Toilet",
            "9. Doa keluar kamar mandi",
            "10. Doa masuk masjid",
            "11. Doa keluar masjid",
            "12. Doa naik kendaraan",
            "13. Bacaan doa untuk kedua orang tua",
            "14. Doa agar selamat dunia akhirat",
            "15. Doa Sebelum Tidur"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_doa);
        getSupportActionBar().setTitle("Doa Harian");
        ListDoa = findViewById(R.id.list_doa);
        ListAdapter adapter = new ListAdapter();
        ListDoa.setAdapter(adapter);

        ListDoa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(DetailDoa.this, BacaanDoa.class);
                i.putExtra("KEY", iddoa[position]);
                startActivity(i);
            }
        });
    }

    class ListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return doa.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.list_item, null);

            TextView textView = convertView.findViewById(R.id.tvListDoa);

            textView.setText(doa[position]);

            return convertView;
        }
    }

}
