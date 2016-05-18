package com.example.danboru.tugas_kalkulator_672014113;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, nol, tambah, kurang, kali, bagi, reset, samadengan;
    TextView data, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        inisialisasi();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void inisialisasi(){

        satu = (Button) findViewById(R.id.satu);
        dua = (Button) findViewById(R.id.dua);
        tiga = (Button) findViewById(R.id.tiga);
        empat = (Button) findViewById(R.id.empat);
        lima = (Button) findViewById(R.id.lima);
        enam = (Button) findViewById(R.id.enam);
        tujuh = (Button) findViewById(R.id.tujuh);
        delapan = (Button) findViewById(R.id.delapan);
        sembilan = (Button) findViewById(R.id.sembilan);
        nol = (Button) findViewById(R.id.nol);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        samadengan = (Button) findViewById(R.id.hitung);
        reset = (Button)findViewById(R.id.reset);

        data = (TextView) findViewById(R.id.tampilkan);
        hasil = (TextView) findViewById(R.id.hasilnya);
    }


    @Override
    public void onClick(View tampilkan) {



        switch (tampilkan.getId()){


            case R.id.satu : {

                Toast.makeText(MainActivity.this, "Hello :)" , Toast.LENGTH_SHORT).show();

                break;
            }

            case R.id.dua : {

                Toast.makeText(MainActivity.this, "Hello :)" , Toast.LENGTH_SHORT).show();

                break;
            }

            case R.id.tiga : {


                break;
            }

            case R.id.empat : {


                break;
            }

            case R.id.lima : {


                break;
            }

            case R.id.enam : {


                break;
            }

            case R.id.tujuh : {


                break;
            }

            case R.id.delapan : {


                break;
            }

            case R.id.sembilan : {


                break;
            }

            case R.id.nol : {


                break;
            }

            case R.id.tambah : {


                break;
            }

            case R.id.kurang : {


                break;
            }

            case R.id.kali : {


                break;
            }

            case R.id.bagi : {


                break;
            }

            case R.id.reset : {


                break;
            }

            case R.id.hitung : {


                break;
            }


        }

    }
}
