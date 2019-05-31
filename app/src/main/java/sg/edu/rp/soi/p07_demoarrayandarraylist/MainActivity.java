package sg.edu.rp.soi.p07_demoarrayandarraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    //String[] items;

    ArrayList<String> items2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tvResult);

        /*
        items = new String[3];
        items[0] = "Apple";
        items[1] = "Ball";
        items[2] = "Cat";
        */

        items2 = new ArrayList<String>();
        items2.add("Apple");
        items2.add("Ball");
        items2.add("Cat");

        String data = "";
        for (int i = 0; i < items2.size(); i++){
            data = data + items2.get(i) + "\n";
        }
        tvResult.setText(data);

    }
}
