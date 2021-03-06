package com.example.traveling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FActivity extends AppCompatActivity {
    private ConstraintLayout Flayout;
    private ListView lvFood;
    private TextView cedtF;
    private TextView tvF;
    private Button btdk;
    private ImageView ivF;
    private ImageButton ibtback;
    ArrayList<dulich> arrayF;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factivity);
        AddDl();
        Anhxa();
        Flayout.setVisibility(View.INVISIBLE);
        dulichAdapter adapter = new dulichAdapter(FActivity.this,R.layout.dulich, arrayF);
        lvFood.setAdapter(adapter);

        lvFood.setOnItemClickListener(new  AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    HaNoi();
                }
                if (position == 1){
                    Sapa();
                }
                if (position == 2){
                    TuyHoa();
                }
                if (position == 3){
                    HoiAn();
                }
                if (position ==4){
                    PhongNha();
                }

            }
        });
        ibtback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Flayout.setVisibility(View.INVISIBLE);
            }
        });
        btdk = findViewById(R.id.btdk);
        btdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FActivity.this,"????? ??n c???a b???n ???? ???????c ?????t tr?????c", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void Anhxa(){
        tvF = (TextView) findViewById(R.id.tvL0);
        ivF = (ImageView) findViewById(R.id.ivL0);
        lvFood = (ListView) findViewById(R.id.lvDulich);
        ibtback =  (ImageButton) findViewById(R.id.ibtback);
        cedtF  = (TextView) findViewById(R.id.cedtL0);
        Flayout = (ConstraintLayout) findViewById(R.id.DLlayout);

    }
    private void AddDl(){
        arrayF = new ArrayList<dulich>();
        arrayF.add(new dulich("Ch??p D??ng(H?? N???i)","????? ??n d??n d??, c???c ngon",R.drawable.fhn));
        arrayF.add(new dulich("C???y met(Sapa)","???m th???c thi??n nhi??n",R.drawable.fsp));
        arrayF.add(new dulich("???m th???c(Tuy H??a)","M??n ngon ?????a ph????ng",R.drawable.th));
        arrayF.add(new dulich("?????c s???n(H???i An)","Thi??n ???????ng ???m th???c",R.drawable.fha));
        arrayF.add(new dulich("Nh??? ngon(Phong Nha)","???m th???c quen thu???c",R.drawable.fpn));


    }
    private void HaNoi(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("B??n B?? Hu???");
        ivF.setImageResource(R.drawable.fhn1);
        cedtF.setText("M???t trong nh???ng m??n ??n ngon nh???t H?? N???i" +
                "\n" +
                "C?? d???p ?????n b???n nh???t ?????nh ph???i th???" +
                "\n" +
                "40k/1b??t");
    }
    private void Sapa(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("C??y m???t");
        ivF.setImageResource(R.drawable.fsp1);
        cedtF.setText("?????c s???n c???a n??i r???ng Sapa" +
                "\n" +
                "1 su???t c?? gi?? kho???ng 800k" +
                "\n" +
                "1 m???t kho???ng 6 ng?????i ??n");

    }
    private void TuyHoa(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("Cua rang mu???i");
        ivF.setImageResource(R.drawable.th1);
        cedtF.setText("?????c s???n Tuy H??a c?? r???t nhi???u m??n ngon" +
                "\n" +
                "Cua bi???n rang me" +
                "\n" +
                "1 con 150k");
    }
    private void HoiAn(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("B??nh tr??ng");
        ivF.setImageResource(R.drawable.fha1);
        cedtF.setText("B??nh tr??ng qu??n H???i An" +
                "\n" +
                "M??n ??n kh??ng th??? kh??ng th??? khi ?????n H???i An" +
                "\n" +
                "1 su???t l?? 30k");
    }
    private void PhongNha(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("N??i r???ng m???t");
        ivF.setImageResource(R.drawable.fpn1);
        cedtF.setText("M???t ????? ??n r???ng" +
                "\n" +
                "M???t m??m kho???ng 6 ng?????i" +
                "\n" +
                "Gi?? l?? 1tr/ m???t");
    }


}