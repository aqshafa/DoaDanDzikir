package com.example.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class DzikirSetelahSholat extends AppCompatActivity {

    private DzikirAdapter dzikirAdapter;
    RecyclerView rvMain;
    ArrayList<ModelDzikir> arrayList;
    int count = 0;

    private String[] idshalat = {"Istighfar",
            "dzikir1",
            "dzikir2",
            "dzikir3",
            "dzikir4",
            "dzikir5",
            "dzikir6",
            "dzikir7",
            "dzikir8"};

    private String[] noshalat = {"1",
            "2",
            "3",
            "4",
            "5",
            "6 (Klik Disini!)",
            "7",
            "8",
            "Setelah selesai shalat Shubuh membaca"};

    private String[] judulshalat = {"أَسْتَغْفِرُ اللهَ (3x) اَللَّهُمَّ أَنْتَ السَّلاَمُ، وَمِنْكَ السَّلاَمُ، تَبَارَكْتَ يَا ذَا الْجَلاَلِ وَاْلإِكْرَامِ",
            "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ، اَللَّهُمَّ لاَ مَانِعَ لِمَا أَعْطَيْتَ، وَلاَ مُعْطِيَ لِمَا مَنَعْتَ، وَلاَ يَنْفَعُ ذَا الْجَدِّ مِنْكَ الْجَدُّ" ,
            "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. لاَ حَوْلَ وَلاَ قُوَّةَ إِلاَّ بِاللهِ، لاَ إِلَـهَ إِلاَّ اللهُ، وَلاَ نَعْبُدُ إِلاَّ إِيَّاهُ، لَهُ النِّعْمَةُ وَلَهُ الْفَضْلُ وَلَهُ الثَّنَاءُ الْحَسَنُ، لاَ إِلَـهَ إِلاَّ اللهُ مُخْلِصِيْنَ لَهُ الدِّيْنَ وَلَوْ كَرِهَ الْكَافِرُوْنَ" ,
            "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ يُحْيِيْ وَيُمِيْتُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ (10x)",
            "اَللّهُمَّ أَعِنِّيْ عَلَى ذِكْرِكَ وَشُكْرِكَ وَحُسْنِ عِبَادَتِكَ",
            "سُبْحَانَ اللهِ (33x ) الْحَمْدُ لِلَّهِ (33x )اللهُ أَكْبَرُ (33x )" ,
            "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
            "Kemudian mebaca surat Al-Ikhlash, Al-Falaq dan An-Naas setiap selesai shalat (fardhu). Membaca ayat Kursi setiap selesai shalat (fardhu).",
            "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً" ,};

    private String[] subjudulshalat= {"“Aku minta ampun kepada Allah,” (3x). Lantas membaca: “Ya Allah, Engkau pemberi keselamatan, dan dariMu keselamatan, Maha Suci Engkau, wahai Tuhan Yang Pemilik Keagungan dan Kemuliaan.”",
            "“Tiada Rabb yang berhak disembah selain Allah Yang Maha Esa, tidak ada sekutu bagiNya. BagiNya puji dan bagi-Nya kerajaan. Dia Maha Kuasa atas segala sesuatu. Ya Allah, tidak ada yang mencegah apa yang Engkau berikan dan tidak ada yang memberi apa yang Engkau cegah. Tidak berguna kekayaan dan kemuliaan itu bagi pemiliknya (selain iman dan amal shalihnya yang menyelamatkan dari siksaan). Hanya dari-Mu kekayaan dan kemuliaan.”" ,
            "“Tiada Rabb (yang berhak disembah) kecuali Allah, Yang Maha Esa, tidak ada sekutu bagiNya. BagiNya kerajaan dan pujaan. Dia Mahakuasa atas segala sesuatu. Tidak ada daya dan kekuatan kecuali (dengan pertolongan) Allah. Tiada Rabb (yang hak disembah) kecuali Allah. Kami tidak menyembah kecuali kepadaNya. Bagi-Nya nikmat, anugerah dan pujaan yang baik. Tiada Rabb (yang hak disembah) kecuali Allah, dengan memurnikan ibadah kepadaNya, sekalipun orang-orang kafir sama benci.”",
            "Tiada ilah yang berhak diibadahi dengan benar melainkan hanya Allah Yang Maha Esa, tidak ada sekutu bagi–Nya, bagi–Nya kerajaan dan bagi-Nya segala pujian. Dia-lah yang menghidupkan (orang yang sudah mati atau memberi ruh janin yang akan dilahirkan) dan yang mematikan. Dia-lah Yang Mahakuasa atas segala sesuatu.” (Dibaca 10 x setiap selesai shalat Maghrib dan Subuh).",
            "“Ya Allah, tolonglah aku untuk berdzikir kepada-Mu, Bersyukur kepada-Mu, serta beribadah dengan baik kepada-Mu.”",
            "Mahasuci Allah ( 33x) Segala puji bagi Allah (33x) Allah Mahabesar (33x)",
            "Tidak ada ilah yang berhak diibadahi dengan benar melainkan hanya Allah Yang Mahaesa, tidak ada sekutu bagi-Nya, bagi-Nya kerajaan, bagi-Nya segala puji. Dia-lah Yang Mahakuasa atas segala sesuatu.",
            "",
            "“Ya Allah, sesungguhnya aku mohon kepada–Mu ilmu yang bermanfaat, rizki yang halal dan amal yang diterima.”",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir_setelah_sholat);
        rvMain = findViewById(R.id.rvMain);
        arrayList = new ArrayList<>();
        setDataShalat();
        getSupportActionBar().setTitle("Dzikir Setelah Sholat Fardu");
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        dzikirAdapter = new DzikirAdapter(arrayList);
        rvMain.setAdapter(dzikirAdapter);
    }

    private void setDataShalat(){
        for (String idshalat : idshalat){
            arrayList.add(new ModelDzikir(idshalat, noshalat[count], judulshalat[count], subjudulshalat[count]));
            count++;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.tasbih:
                Intent intent = new Intent(DzikirSetelahSholat.this, Tasbih.class);
                startActivity(intent);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
