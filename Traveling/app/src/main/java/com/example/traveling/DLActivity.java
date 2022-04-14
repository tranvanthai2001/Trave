package com.example.traveling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class DLActivity extends AppCompatActivity {
    private ConstraintLayout DLlayout;
    private ListView lvDulich;
    private TextView cedtL0;
    private TextView tvL0;
    private ImageView ivL0;
    private Button btct;
    private ImageButton ibtback;
    ArrayList<dulich> arrayDulich;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dlactivity);

        AddDl();
        Anhxa();
        DLlayout.setVisibility(View.INVISIBLE);
        dulichAdapter adapter = new dulichAdapter(DLActivity.this,R.layout.dulich, arrayDulich);
        lvDulich.setAdapter(adapter);

        lvDulich.setOnItemClickListener(new  AdapterView.OnItemClickListener() {
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
                if (position ==5){
                    NinhBinh();
                }
                if (position ==6){
                    Hue();
                }
                if (position ==7){
                    MuiNe();
                }
                if (position ==8){
                    MaiChau();
                }
                if (position ==9){
                    DongHoi();
                }
                if (position ==10){
                    ConDao();
                }
            }
        });
        ibtback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DLlayout.setVisibility(View.INVISIBLE);
            }
        });
        btct = (Button) findViewById(R.id.btct);
        btct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DLActivity.this, ChiTietActivity.class);
                startActivity(intent);
            }
        });
        }
        private void Anhxa(){
        tvL0 = (TextView) findViewById(R.id.tvL0);
        ivL0 = (ImageView) findViewById(R.id.ivL0);
        lvDulich = (ListView) findViewById(R.id.lvDulich);
        ibtback =  (ImageButton) findViewById(R.id.ibtback);
        cedtL0  = (TextView) findViewById(R.id.cedtL0);
        DLlayout = (ConstraintLayout) findViewById(R.id.DLlayout);

        }
        private void AddDl(){
        arrayDulich = new ArrayList<dulich>();
        arrayDulich.add(new dulich("Hà Nội","Thủ đô của nước Việt Nam",R.drawable.hanoi));
        arrayDulich.add(new dulich("Sapa","Thiên nhiên ấm áp, đa dạng sắc màu văn hóa",R.drawable.sapa));
        arrayDulich.add(new dulich("Tuy Hòa","Đường bờ biển tuyệt đẹp",R.drawable.tuyhoa));
        arrayDulich.add(new dulich("Hội An","Kiến trúc độc đáo, những ngôi nhà gạch vàng đặc trung và cổ kính",R.drawable.hoian));
        arrayDulich.add(new dulich("Phong Nha","Vẻ đẹp thiên nhiên kỳ thù, hệ thống hang động khổng lồ ngoạn mục",R.drawable.phongnha));
        arrayDulich.add(new dulich("Ninh Bình","Hệ thống núi đá vôi kỳ vĩ, cánh đồng lúa xanh ngát",R.drawable.ninhbinh));
        arrayDulich.add(new dulich("Huế","Di sản văn hóa phong phú, ẩm thực đa dạng hấp dẫn",R.drawable.hue));
        arrayDulich.add(new dulich("Mũi né","Bãi biển đầy nắng, cồn cát vàng, các khu nghỉ dưỡng sang trọng",R.drawable.muine));
        arrayDulich.add(new dulich("Mai Châu","Nghĩ dưỡng yên tĩnh, gần gũi thiên nhiên",R.drawable.maichau));
        arrayDulich.add(new dulich("Đồng Hới","Hang Sơn Đòng kỳ vĩ, khoảnh khắc tuyệt đẹp khi mặt trời chiếu qua hố sụt của hang",R.drawable.donghoi));
        arrayDulich.add(new dulich("Côn Đảo","Thiên Nhiên tuyệt đẹp, biển trong xanh",R.drawable.condao));

        }
        private void HaNoi(){
        DLlayout.setVisibility(View.VISIBLE);
        tvL0.setText("Hà Nội");
        ivL0.setImageResource(R.drawable.hanoi1);
        cedtL0.setText("Thời gian: 2 ngày 1 đêm" +
                "\n" +
                "Phương tiện: Ô tô" +
                "\n" +
                "Khách sạn: Vinhome" +
                "\n" +
                "Nơi đến: Tham Quan Lăng Bác, Bảo tàng Dân tộc học" +
                "\n" +
                "Dịch vụ giải trí: Đạp vịt Hồ Tây" +
                "\n" +
                "Giá từ 900k/1người");
        }
        private void Sapa(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText("SaPa");
            ivL0.setImageResource(R.drawable.sapa1);
            cedtL0.setText("Thời gian: 3 ngày 2 đêm" +
                    "\n" +
                    "Phương tiện: Ô tô" +
                    "\n" +
                    "Khách sạn: Mường Thanh" +
                    "\n" +
                    "Nơi đến: Chợ phiên, Chợ đêm " +
                    "\n" +
                    "Dịch vụ giải trí: Chạy xe thông đêm" +
                    "\n" +
                    "Giá từ:1200k/1người");

        }
        private void TuyHoa(){
        DLlayout.setVisibility(View.VISIBLE);
        tvL0.setText("Tuy Hòa");
        ivL0.setImageResource(R.drawable.tuyhoa1);
        cedtL0.setText("Thời gian: 5 ngày 4 đêm" +
                "\n" +
                "Phương tiện: máy bay" +
                "\n" +
                "Khách sạn: FLC Tuy Hòa" +
                "\n" +
                "Nơi đến: Tắm biển, leo núi" +
                "\n" +
                "Dịch vụ giải trí: Nhảy dù, câu mực đêm" +
                "\n" +
                "Giá từ:5200k/1người");
        }
        private void HoiAn(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText("Hội An");
            ivL0.setImageResource(R.drawable.hoian1);
            cedtL0.setText("Thời gian: 4 ngày 3 đêm" +
                    "\n" +
                    "Phương tiện: máy bay" +
                    "\n" +
                    "Khách sạn: Mường Thanh" +
                    "\n" +
                    "Nơi đến: Phố cổ, Chợ đêm " +
                    "\n" +
                    "Dịch vụ giải trí: Tham gia trải nghiệm khu du lịch" +
                    "\n" +
                    "Giá từ:4200k/1người");
        }
        private void PhongNha(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" Phong Nha");
            ivL0.setImageResource(R.drawable.phongnha1);
            cedtL0.setText("Thời gian: 3 ngày 2 đêm" +
                    "\n" +
                    "Phương tiện: Ô tô" +
                    "\n" +
                    "Khách sạn: Tân Phát" +
                    "\n" +
                    "Nơi đến: Hang động, lễ chùa " +
                    "\n" +
                    "Dịch vụ giải trí: tắm sông" +
                    "\n" +
                    "Giá từ:2200k/1người");
        }
        private void NinhBinh(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText("Ninh Bình");
            ivL0.setImageResource(R.drawable.ninhbinh1);
            cedtL0.setText("Thời gian: 3 ngày 2 đêm" +
                    "\n" +
                    "Phương tiện: Ô tô" +
                    "\n" +
                    "Khách sạn: Chí Hòa" +
                    "\n" +
                    "Nơi đến: Leo núi " +
                    "\n" +
                    "Dịch vụ giải trí: Lặn hồ" +
                    "\n" +
                    "Giá từ:2000k/1người");
        }
        private void Hue(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" Huế");
            ivL0.setImageResource(R.drawable.hue);
            cedtL0.setText("Thời gian: 1 tuần" +
                    "\n" +
                    "Phương tiện: máy bay" +
                    "\n" +
                    "Khách sạn: FLC Huế" +
                    "\n" +
                    "Nơi đến: Cung điện, Đình Chùa " +
                    "\n" +
                    "Dịch vụ giải trí: Thử trang phục, ăn uống" +
                    "\n" +
                    "Giá từ:1200k/1người");
        }
        private void MuiNe(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" Mũi Né");
            ivL0.setImageResource(R.drawable.muine1);
            cedtL0.setText("Thời gian: 3 ngày 2 đêm" +
                    "\n" +
                    "Phương tiện: máy bay" +
                    "\n" +
                    "Khách sạn: Mường Thanh" +
                    "\n" +
                    "Nơi đến: Biển " +
                    "\n" +
                    "Dịch vụ giải trí: đánh bắt cùng ngư dân" +
                    "\n" +
                    "Giá từ:7000k/1người");
        }
        private void MaiChau(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" Mai Châu");
            ivL0.setImageResource(R.drawable.maichau1);
            cedtL0.setText("Thời gian: trong ngày" +
                    "\n" +
                    "Phương tiện: Ô tô" +
                    "\n" +
                    "Khách sạn: Mường Thanh" +
                    "\n" +
                    "Nơi đến: Chợ phiên, Chợ đêm " +
                    "\n" +
                    "Dịch vụ giải trí: leo núi, tắm hồ" +
                    "\n" +
                    "Giá từ:700k/1người");
        }
        private void DongHoi(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText("Đồng Hới");
            ivL0.setImageResource(R.drawable.donghoi1);
           cedtL0.setText("Thời gian: 5 ngày 5 đêm" +
                   "\n" +
                   "Phương tiện: máy bay" +
                   "\n" +
                   "Khách sạn: Mường Thanh" +
                   "\n" +
                   "Nơi đến: Thành phố" +
                   "\n" +
                   "Dịch vụ giải trí: tắm biển, ăn uống" +
                   "\n" +
                   "Giá từ:5200k/1người");
        }
        private void ConDao(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" Côn Đảo");
            ivL0.setImageResource(R.drawable.condao1);
            cedtL0.setText("Thời gian: 5 ngày 4 đêm" +
                    "\n" +
                    "Phương tiện: máy bya" +
                    "\n" +
                    "Khách sạn: Mường Thanh" +
                    "\n" +
                    "Nơi đến: Nhà tù Phú Quốc " +
                    "\n" +
                    "Dịch vụ giải trí: du lịch" +
                    "\n" +
                    "Giá từ:9200k/1người");
        }

    }
