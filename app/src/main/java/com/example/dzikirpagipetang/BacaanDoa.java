package com.example.dzikirpagipetang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BacaanDoa extends AppCompatActivity {

    String idDoa;

    TextView tvNamaDoa, tvDoaArab, tvArtiDoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacaan_doa);
        idDoa = getIntent().getStringExtra("KEY");
        tvNamaDoa = findViewById(R.id.tvNamaDoa);
        tvDoaArab = findViewById(R.id.tvDoaArab);
        tvArtiDoa = findViewById(R.id.tvArtiDoa);

        if (idDoa.equals("doa1")){
            tvNamaDoa.setText("Doa bangun tidur");
            tvDoaArab.setText("الْحَمْدُ لِلَّهِ الَّذِي أَحْيَاناَ بَعْـدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُوْرُِ");
            tvArtiDoa.setText("“Segala puji bagi Allah Yang membangunkan kami setelah ditidurkan-Nya dan kepada-Nya kami dibangkitkan”");

        }else if (idDoa.equals("doa2")){
            tvNamaDoa.setText("Doa ketika bersin dan Mendengar orang lain bersinً");
            tvDoaArab.setText("اَلْحَمْدُ ِللهِ,\n" + "يَرْحَمُكاللهُ,\n" + "يَهْدِيْكُماللهُ وَيَصْلِحُ بَالَكُم");
            tvArtiDoa.setText("Artinya: Segala Puji Bagi Allah\n" +
                    "\n" +
                    "Doa Ketika Mendengar Orang lain Bersin,\n" +
                    "\n" +
                    "Artinya: Semoga Allah memberi rahmat kepadamu.\n" +
                    "\n" +
                    "Kemudian orang yang bersin juga mengucap doa lagi sebagai berikut.\n" +
                    "\n" +
                    "Artinya: Semoga Allah memberi petunjuk kepadamu dan membaguskan keadaanmu.");

        }else if (idDoa.equals("doa3")){
            tvNamaDoa.setText("Doa sebelum makanِ");
            tvDoaArab.setText("بِسْمِ الله");
            tvArtiDoa.setText("Dengan menyebut nama Allah");

        }else if (idDoa.equals("doa4")){
            tvNamaDoa.setText("Doa saat lupa baca doa sebelum makanً");
            tvDoaArab.setText("بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهِ");
            tvArtiDoa.setText("Dengan menyebut nama Allah pada awal dan akhirnya");

        }else if (idDoa.equals("doa5")){
            tvNamaDoa.setText("Doa sesudah makanِ");
            tvDoaArab.setText("اَلْحَمْدُ ِللهِ");
            tvArtiDoa.setText("Segala puji bagi Allah");

        }else if (idDoa.equals("doa6")){
            tvNamaDoa.setText("Doa sebelum belajarً");
            tvDoaArab.setText("رَبِّ زِدْنِي عِلْمًا، وَارْزُقْنِيْ فَهْمًا");
            tvArtiDoa.setText("Ya Alloh Tambahkanlah aku ilmu, Dan berilah aku karunia untuk dapat memahaminya");

        }else if (idDoa.equals("doa7")){
            tvNamaDoa.setText("Doa setelah wudhuِ");
            tvDoaArab.setText("اَشْهَدُ اَنْ لاَّاِلَهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللّٰهُمَّاجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ");
            tvArtiDoa.setText("Aku bersaksi, tidak ada Tuhan selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya, dan aku mengaku bahwa Nabi Muhammad itu adalah hamba dan Utusan Allah. Ya Allah, jadikanlah aku dari golongan orang-orang yang bertaubat dan jadikanlah aku dari golongan orang-orang yang bersuci");

        }else if (idDoa.equals("doa8")){
            tvNamaDoa.setText("Doa masuk kamar mandi / WC / Toiletً");
            tvDoaArab.setText("اَللهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ");
            tvArtiDoa.setText("Ya Allah, aku berlindung dari godaan syetan laki-laki dan syetan perempuan");

        }else if (idDoa.equals("doa9")){
            tvNamaDoa.setText("Doa keluar kamar mandiِ");
            tvDoaArab.setText("غُفْرَانَكَه");
            tvArtiDoa.setText("Dengan mengharap ampunanMu");

        }else if (idDoa.equals("doa10")){
            tvNamaDoa.setText("Doa masuk masjidً");
            tvDoaArab.setText("اَللّهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَُ");
            tvArtiDoa.setText("Wahai Tuhanku, bukakanlah untukku pintu-pintu rahmat-Mu");

        }else if (idDoa.equals("doa11")){
            tvNamaDoa.setText("Doa keluar masjidِ");
            tvDoaArab.setText("اَللّهُمَّ اِنِّيْ أسْأَلُكَ مِنْ فَضْلِكَ");
            tvArtiDoa.setText("Wahai Tuhanku, sesungguhnya aku memohon kepada-Mu akan segala keutamaan-Mu");

        }else if (idDoa.equals("doa12")){
            tvNamaDoa.setText("Doa naik kendaraanً");
            tvDoaArab.setText("سُبْحَانَ الَّذِىْ سَخَّرَلَنَا هَذَا وَمَاكُنَّالَهُ مُقْرِنِيْنَ وَاِنَّآ اِلَى رَبّنَا لَمُنْقَلِبُوْنَ");
            tvArtiDoa.setText("Maha suci Allah yang memudahkan ini (kendaraan) bagi kami dan tiada kami mempersekutukan bagi-Nya, dan sesungguhnya kami akan kembali kepada Tuhan kami");

        }else if (idDoa.equals("doa13")){
            tvNamaDoa.setText("Bacaan doa untuk kedua orang tuaِ");
            tvDoaArab.setText("اَللّٰهُمَّ اغْفِرْلِيْ وَلِوَالِدَيَّ وَارْحَمْهُمَاكَمَارَبَّيَانِيْ صَغِيْرَا");
            tvArtiDoa.setText("Wahai Tuhanku, ampunilah aku dan kedua orang tuaku (Ibu dan Bapakku), sayangilah mereka seperti mereka menyayangiku diwaktu kecil");

        }else if (idDoa.equals("doa14")){
            tvNamaDoa.setText("Doa agar selamat dunia akhiratً");
            tvDoaArab.setText("رَبَّنَا أَتِنَا فِى الدُّنْيَا حَسَنَةً وَفِي اْلأَخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ");
            tvArtiDoa.setText("Ya Tuhan kami, berilah kami kebaikan hidup di dunia dan kebaikan hidup di akhirat, dan jagalah kami dari siksa api neraka");

        }else if (idDoa.equals("doa15")){
            tvNamaDoa.setText("Doa mau tidurِ");
            tvDoaArab.setText("بِسْمِكَ اللّهُمَّ اَحْيَا وَاَمُوْتُ");
            tvArtiDoa.setText("Dengan nama-Mu ya Allah aku hidup dan aku mati");
        }
    }
}
