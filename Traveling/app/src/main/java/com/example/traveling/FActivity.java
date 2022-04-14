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
                Toast.makeText(FActivity.this,"Đồ ăn của bạn đã được đặt trước", Toast.LENGTH_SHORT).show();
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
        arrayF.add(new dulich("Chép Dũng(Hà Nội)","Đồ Ăn dân dã, cực ngon",R.drawable.fhn));
        arrayF.add(new dulich("Cầy met(Sapa)","Ẩm thực thiên nhiên",R.drawable.fsp));
        arrayF.add(new dulich("Ẩm thực(Tuy Hòa)","Món ngon địa phương",R.drawable.th));
        arrayF.add(new dulich("Đặc sản(Hội An)","Thiên đường ẩm thực",R.drawable.fha));
        arrayF.add(new dulich("Nhớ ngon(Phong Nha)","Ẩm thực quen thuộc",R.drawable.fpn));


    }
    private void HaNoi(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("Bún Bò Huế");
        ivF.setImageResource(R.drawable.fhn1);
        cedtF.setText("Một trong những món ăn ngon nhất Hà Nội" +
                "\n" +
                "Có dịp đến bạn nhất định phải thử" +
                "\n" +
                "40k/1bát");
    }
    private void Sapa(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("Cày mẹt");
        ivF.setImageResource(R.drawable.fsp1);
        cedtF.setText("Đặc sản của núi rừng Sapa" +
                "\n" +
                "1 suất có giá khoảng 800k" +
                "\n" +
                "1 mẹt khoảng 6 người ăn");

    }
    private void TuyHoa(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("Cua rang muối");
        ivF.setImageResource(R.drawable.th1);
        cedtF.setText("Đặc sản Tuy Hòa có rất nhiều món ngon" +
                "\n" +
                "Cua biển rang me" +
                "\n" +
                "1 con 150k");
    }
    private void HoiAn(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("Bánh tráng");
        ivF.setImageResource(R.drawable.fha1);
        cedtF.setText("Bánh tráng quán Hội An" +
                "\n" +
                "Món ăn không thể không thử khi đến HỘi An" +
                "\n" +
                "1 suất là 30k");
    }
    private void PhongNha(){
        Flayout.setVisibility(View.VISIBLE);
        tvF.setText("Núi rừng mẹt");
        ivF.setImageResource(R.drawable.fpn1);
        cedtF.setText("Mẹt Đồ ăn rừng" +
                "\n" +
                "Một mâm khoảng 6 người" +
                "\n" +
                "Giá là 1tr/ mẹt");
    }


}