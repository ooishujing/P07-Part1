package sg.edu.rp.soi.p07_demoarrayandarraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    TextView tvTitle;
    TextView tvDiveder;
    String[] items;
    //String[] fruits;
    //register

    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);
        tvTitle = findViewById(R.id.tvTitle);
        tvDiveder = findViewById(R.id.tvDivider);
        /*

        fruits = new String[3];
        fruits[0]="apple";
        fruits[1] ="banana";
        fruits[2] ="cherry";
        String title= "Fruits";
        String divider= "========";
        tvTitle.setText(title);
        tvDiveder.setText(divider);


        String result = " ";
        for(int i= 0; i<fruits.length; i++){
            result += fruits[i]+"\n";
        }
        tvResult.setText(result);
         */


        //no need id for Arrays
        items = new String[3];
        items[0] = "Apple";
        items[1] = "Ball";
        items[2] = "Cat";


        fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Ball");
        fruits.add("Cherry");

        String data = "";
        for (int i = 0; i <  fruits.size(); i++){
            data = data + fruits.get(i) + "\n";
        }
        tvResult.setText(data);


    }
}
