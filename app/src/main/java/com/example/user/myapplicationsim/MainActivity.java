package com.example.user.myapplicationsim;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {


    //    private Button button;
//    private Button buttonPass;
    TextView money;
    TextView CostLvlUp;
    TextView textView1;
    int a = 100;
    int b = 100;
    int c = 30;
    int d = 2000;
    int k = 1;
    int l = 1;
    int j = 500;
    Button buttonLvL;
    Button buttonPass;
    TextView carLvl;
    TextView MainTexT;
    Button zapravka;
    TextView toplivoOST;
    TextView ZC;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLvL = findViewById(R.id.PayLvL);
        buttonPass = findViewById(R.id.pas);
        money = findViewById(R.id.Money);
        CostLvlUp = findViewById(R.id.LvlCost);
        carLvl = findViewById(R.id.CarLvl);
        MainTexT = findViewById(R.id.TexT);
        zapravka = findViewById(R.id.Zapravitsa);
        toplivoOST = findViewById(R.id.Toplivo);
        ZC = findViewById(R.id.ZapravkaCost);
        textView1 = findViewById(R.id.eventtext);

//        EventTask eventTask = new EventTask();
//        eventTask.doInBackground();
        mainProcessing();
        buttonLvL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a >= d) {
                    a -= d;
                    d *= 1.3;
                    k++;
                    b *= 1.5;
//                    l++;
//                    j *= l;
                    //MainTexT.setText("Вы улучшили машину");
                    CostLvlUp.setText(Integer.toString(d));
                    money.setText(Integer.toString(a));
                    carLvl.setText(Integer.toString(k));
                    Toast toast1 = Toast.makeText(getApplicationContext(),
                            "Вы улучшили машину", Toast.LENGTH_SHORT);
                    toast1.show();
                }
            }
        });

        buttonPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int event = (int) (Math.random());

//                int random_number1 = a+(int) (Math.random() *b);
//                money.setText(Integer.toString(a + random_number1));
                if (c > 0) {
                    a += b;
                }
                c--;
                money.setText(Integer.toString(a));
                toplivoOST.setText(c + "/30");

//                    MainTexT.setText("Вы отвезли клиента, +"+b +"рублей");
                Toast toast1 = Toast.makeText(getApplicationContext(),
                        "Вы отвезли клиента, +" + b + "рублей", Toast.LENGTH_SHORT);
                toast1.show();
//                if (event == 1){
//                    int dopevent = (int) (Math.random());
//                    if(dopevent == 0 || dopevent == 1 ||dopevent == 2){
//                        Toast toast = Toast.makeText(getApplicationContext(), "У вас лопнула шина, вы заплатили 500 рублей за новую",
//                                Toast.LENGTH_LONG);
//                        toast.show();
//                        a-=500;
//                    }
//                    if(dopevent == 3 || dopevent == 4 ||dopevent == 5){
//                        Toast toast3 = Toast.makeText(getApplicationContext(), "Что-то сломалось, -1000",
//                                Toast.LENGTH_LONG);
//                        toast3.show();
//                        a -= 1000;
//                    }
//                    if(dopevent == 6 || dopevent == 7 ||dopevent == 8 || dopevent == 9){
//                        Toast toast4 = Toast.makeText(getApplicationContext(), "Вам пришёл штраф за превышение скорости, -500",
//                                Toast.LENGTH_LONG);
//                        toast4.show();
//                        a-=500;
//                    }
//                }
            }
        });
        zapravka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a >= j) {
                    a -= j;
                    c = 30;
                    toplivoOST.setText(c + "/30");
                    money.setText(Integer.toString(a));
                }
//                ZC.setText(Integer.toString(j));
            }
        });

    }
    private void mainProcessing() {
        Thread thread = new Thread(null, doBackgroundThreadProcessing);
        thread.start();
    }

    private Runnable doBackgroundThreadProcessing = new Runnable() {
        public void run() {
            int random = (int) (Math.random());
            textView1.setText(Integer.toString(random));
//            if(random >= 0 && random < 11){
//                Toast toast2145 = Toast.makeText(getApplicationContext(),
//                        "работоспособно", Toast.LENGTH_SHORT);
//                toast2145.show();
//            }
        }
    };
}
//    class EventTask extends AsyncTask<Void, Integer, Void> {
//
//        @Override
//        protected Void doInBackground(Void... voids) {
//            int a = 1;
//            while (1 == a) {
//                publishProgress((int)(Math.round(Math.random() * 10)));
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            return null;
//        }
//
//        @Override
//        protected void onProgressUpdate(Integer... values) {
//            textView1.setText(values[0].toString());
//        }
//    }



//                textView1.setText(Integer.toString(values[0]));

//                money.setText(Integer.toString(a + b));


//                int random_number1 = a + (int) (Math.random() * b);
//                money.setTextContent(Integer.toString(a + random_number1));

//                System.out.println("1-ое случайное число: " + random_number1);
//                money.setText(Integer.toString(random_number1));

//                money = setTextContent(a + random_number1);