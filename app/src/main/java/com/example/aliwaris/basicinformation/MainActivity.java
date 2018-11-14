package com.example.aliwaris.basicinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


      String names[]={"Fida Hussain","Ghulam Mustafa","Sanaullah","Mashal","Adil Muhammad"};
      int images[]={R.drawable.fida,R.drawable.mustafa,R.drawable.sanaullah,R.drawable.mashal,R.drawable.adil};
      String rollnumbers[]={"F16sw31","F16sw03","F16sw01","F16sw37","F16sw169"} ;
      String emails[]={"fidahussain.shahani.fs@gmail.com","mustafa142@gmail.com","sanaullah780@gmail.com","mashal210@gmail.com","adilhussain20@gmail.com"};
      TextView name,rollnumber,email;
      ImageView image;
      Button next,previous;
      CardView cardViewprev,cardviewnext;
      int incrementer=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        rollnumber=findViewById(R.id.rollnumber);
        email=findViewById(R.id.email);
        image=findViewById(R.id.image);
        name.setText(names[incrementer]);
        rollnumber.setText(rollnumbers[incrementer]);
        email.setText(emails[incrementer]);
        image.setImageResource(images[incrementer]);
        cardViewprev=findViewById(R.id.prev);
        cardviewnext=findViewById(R.id.next);
        cardViewprev.setVisibility(View.INVISIBLE);
    }
    public void onNext(View v){

         if (incrementer>=4){

             cardviewnext.setVisibility(View.INVISIBLE);
             cardViewprev.setVisibility(View.VISIBLE);
             Toast.makeText(getApplicationContext(),"images has been completed",Toast.LENGTH_SHORT).show();
         }
         else{
             cardviewnext.setVisibility(View.VISIBLE);
             cardViewprev.setVisibility(View.VISIBLE);
             incrementer++;

             name.setText(names[incrementer]);
             rollnumber.setText(rollnumbers[incrementer]);
             email.setText(emails[incrementer]);
             image.setImageResource(images[incrementer]);

         }
    }
    public void onPrev(View v){

        if (incrementer<=0){
            cardViewprev.setVisibility(View.INVISIBLE);
            cardviewnext.setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(),"images has been completed",Toast.LENGTH_SHORT).show();
        }
        else{

            cardViewprev.setVisibility(View.VISIBLE);
            cardviewnext.setVisibility(View.VISIBLE);
            incrementer--;
            name.setText(names[incrementer]);
            rollnumber.setText(rollnumbers[incrementer]);
            email.setText(emails[incrementer]);
            image.setImageResource(images[incrementer]);

        }
    }

}
