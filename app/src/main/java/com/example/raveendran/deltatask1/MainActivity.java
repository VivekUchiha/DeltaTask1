package com.example.raveendran.deltatask1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.raveendran.deltatask1.stone;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    static int x,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int arr[] = {0,0,0,0,0,0};
        final TextView hea=(TextView)findViewById(R.id.headin);
        final TextView says=(TextView)findViewById(R.id.say);
        final TextView power=(TextView)findViewById(R.id.p);
        final TextView space=(TextView)findViewById(R.id.sp);
        final TextView tim=(TextView)findViewById(R.id.t);
        final TextView reality=(TextView)findViewById(R.id.r);
        final TextView soul=(TextView)findViewById(R.id.so);
        final TextView mind=(TextView)findViewById(R.id.m);
        final TextView endz =(TextView)findViewById(R.id.end);
        final Button res=(Button)findViewById(R.id.rese) ;
        final Button button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random R = new Random();
                do {

                    x = R.nextInt(6);}
                while(arr[x]==1);
                arr[x]=1;
                switch (x)
                { case 0:
                    says.setText("You have acquired the Power stone");
                    says.setBackgroundColor(0xFF800080);
                    power.setVisibility(View.VISIBLE);

                    break;
                    case 1:says.setText("You have acquired the Space stone");
                        says.setBackgroundColor(0xFF0000FF);
                        space.setVisibility(View.VISIBLE);
                        break;
                        case 2:says.setText("You have acquired the Time stone");
                        says.setBackgroundColor(0xFF008000);
                            tim.setVisibility(View.VISIBLE);
                        break;
                    case 3: says.setText("You have acquired the Reality stone");
                         says.setBackgroundColor(0xFFFF0000);
                        reality.setVisibility(View.VISIBLE);
                         break;
                    case 4:says.setText("You have acquired the Soul stone");
                          says.setBackgroundColor(0xFFFFA500);
                        soul.setVisibility(View.VISIBLE);
                          break;
                           case 5:says.setText("You have acquired the Mind stone");
                        says.setBackgroundColor(0xFFFFFF00);
                        mind.setVisibility(View.VISIBLE);


                }f=0;
                for(int j=0;j<6;j++)
                {if(arr[j]==0)
                {
                        f = 1;
                        break;
                    }}
                if(f==0) {
                    power.setVisibility(View.GONE);
                    soul.setVisibility(View.GONE);
                    tim.setVisibility(View.GONE);
                    reality.setVisibility(View.GONE);
                    space.setVisibility(View.GONE);
                    mind.setVisibility(View.GONE);
                    says.setVisibility(View.GONE);
                    endz.setVisibility(View.VISIBLE);
                    hea.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);

                    }
            }});
        res.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int j=0;j<6;j++)
                        arr[j]=0;
                    power.setVisibility(View.INVISIBLE);
                    soul.setVisibility(View.INVISIBLE);
                    tim.setVisibility(View.INVISIBLE);
                    reality.setVisibility(View.INVISIBLE);
                    space.setVisibility(View.INVISIBLE);
                    mind.setVisibility(View.INVISIBLE);
                    says.setText("Welcome Lord Thanos");
                    says.setVisibility(View.VISIBLE);
                    endz.setVisibility(View.GONE);
                    hea.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);

                }});

        }
}
