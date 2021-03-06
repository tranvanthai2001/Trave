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
        arrayDulich.add(new dulich("H?? N???i","Th??? ???? c???a n?????c Vi???t Nam",R.drawable.hanoi));
        arrayDulich.add(new dulich("Sapa","Thi??n nhi??n ???m ??p, ??a d???ng s???c m??u v??n h??a",R.drawable.sapa));
        arrayDulich.add(new dulich("Tuy H??a","???????ng b??? bi???n tuy???t ?????p",R.drawable.tuyhoa));
        arrayDulich.add(new dulich("H???i An","Ki???n tr??c ?????c ????o, nh???ng ng??i nh?? g???ch v??ng ?????c trung v?? c??? k??nh",R.drawable.hoian));
        arrayDulich.add(new dulich("Phong Nha","V??? ?????p thi??n nhi??n k??? th??, h??? th???ng hang ?????ng kh???ng l??? ngo???n m???c",R.drawable.phongnha));
        arrayDulich.add(new dulich("Ninh B??nh","H??? th???ng n??i ???? v??i k??? v??, c??nh ?????ng l??a xanh ng??t",R.drawable.ninhbinh));
        arrayDulich.add(new dulich("Hu???","Di s???n v??n h??a phong ph??, ???m th???c ??a d???ng h???p d???n",R.drawable.hue));
        arrayDulich.add(new dulich("M??i n??","B??i bi???n ?????y n???ng, c???n c??t v??ng, c??c khu ngh??? d?????ng sang tr???ng",R.drawable.muine));
        arrayDulich.add(new dulich("Mai Ch??u","Ngh?? d?????ng y??n t??nh, g???n g??i thi??n nhi??n",R.drawable.maichau));
        arrayDulich.add(new dulich("?????ng H???i","Hang S??n ????ng k??? v??, kho???nh kh???c tuy???t ?????p khi m???t tr???i chi???u qua h??? s???t c???a hang",R.drawable.donghoi));
        arrayDulich.add(new dulich("C??n ?????o","Thi??n Nhi??n tuy???t ?????p, bi???n trong xanh",R.drawable.condao));

        }
        private void HaNoi(){
        DLlayout.setVisibility(View.VISIBLE);
        tvL0.setText("H?? N???i");
        ivL0.setImageResource(R.drawable.hanoi1);
        cedtL0.setText("Th???i gian: 2 ng??y 1 ????m" +
                "\n" +
                "Ph????ng ti???n: ?? t??" +
                "\n" +
                "Kh??ch s???n: Vinhome" +
                "\n" +
                "N??i ?????n: Tham Quan L??ng B??c, B???o t??ng D??n t???c h???c" +
                "\n" +
                "D???ch v??? gi???i tr??: ?????p v???t H??? T??y" +
                "\n" +
                "Gi?? t??? 900k/1ng?????i");
        }
        private void Sapa(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText("SaPa");
            ivL0.setImageResource(R.drawable.sapa1);
            cedtL0.setText("Th???i gian: 3 ng??y 2 ????m" +
                    "\n" +
                    "Ph????ng ti???n: ?? t??" +
                    "\n" +
                    "Kh??ch s???n: M?????ng Thanh" +
                    "\n" +
                    "N??i ?????n: Ch??? phi??n, Ch??? ????m " +
                    "\n" +
                    "D???ch v??? gi???i tr??: Ch???y xe th??ng ????m" +
                    "\n" +
                    "Gi?? t???:1200k/1ng?????i");

        }
        private void TuyHoa(){
        DLlayout.setVisibility(View.VISIBLE);
        tvL0.setText("Tuy H??a");
        ivL0.setImageResource(R.drawable.tuyhoa1);
        cedtL0.setText("Th???i gian: 5 ng??y 4 ????m" +
                "\n" +
                "Ph????ng ti???n: m??y bay" +
                "\n" +
                "Kh??ch s???n: FLC Tuy H??a" +
                "\n" +
                "N??i ?????n: T???m bi???n, leo n??i" +
                "\n" +
                "D???ch v??? gi???i tr??: Nh???y d??, c??u m???c ????m" +
                "\n" +
                "Gi?? t???:5200k/1ng?????i");
        }
        private void HoiAn(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText("H???i An");
            ivL0.setImageResource(R.drawable.hoian1);
            cedtL0.setText("Th???i gian: 4 ng??y 3 ????m" +
                    "\n" +
                    "Ph????ng ti???n: m??y bay" +
                    "\n" +
                    "Kh??ch s???n: M?????ng Thanh" +
                    "\n" +
                    "N??i ?????n: Ph??? c???, Ch??? ????m " +
                    "\n" +
                    "D???ch v??? gi???i tr??: Tham gia tr???i nghi???m khu du l???ch" +
                    "\n" +
                    "Gi?? t???:4200k/1ng?????i");
        }
        private void PhongNha(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" Phong Nha");
            ivL0.setImageResource(R.drawable.phongnha1);
            cedtL0.setText("Th???i gian: 3 ng??y 2 ????m" +
                    "\n" +
                    "Ph????ng ti???n: ?? t??" +
                    "\n" +
                    "Kh??ch s???n: T??n Ph??t" +
                    "\n" +
                    "N??i ?????n: Hang ?????ng, l??? ch??a " +
                    "\n" +
                    "D???ch v??? gi???i tr??: t???m s??ng" +
                    "\n" +
                    "Gi?? t???:2200k/1ng?????i");
        }
        private void NinhBinh(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText("Ninh B??nh");
            ivL0.setImageResource(R.drawable.ninhbinh1);
            cedtL0.setText("Th???i gian: 3 ng??y 2 ????m" +
                    "\n" +
                    "Ph????ng ti???n: ?? t??" +
                    "\n" +
                    "Kh??ch s???n: Ch?? H??a" +
                    "\n" +
                    "N??i ?????n: Leo n??i " +
                    "\n" +
                    "D???ch v??? gi???i tr??: L???n h???" +
                    "\n" +
                    "Gi?? t???:2000k/1ng?????i");
        }
        private void Hue(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" Hu???");
            ivL0.setImageResource(R.drawable.hue);
            cedtL0.setText("Th???i gian: 1 tu???n" +
                    "\n" +
                    "Ph????ng ti???n: m??y bay" +
                    "\n" +
                    "Kh??ch s???n: FLC Hu???" +
                    "\n" +
                    "N??i ?????n: Cung ??i???n, ????nh Ch??a " +
                    "\n" +
                    "D???ch v??? gi???i tr??: Th??? trang ph???c, ??n u???ng" +
                    "\n" +
                    "Gi?? t???:1200k/1ng?????i");
        }
        private void MuiNe(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" M??i N??");
            ivL0.setImageResource(R.drawable.muine1);
            cedtL0.setText("Th???i gian: 3 ng??y 2 ????m" +
                    "\n" +
                    "Ph????ng ti???n: m??y bay" +
                    "\n" +
                    "Kh??ch s???n: M?????ng Thanh" +
                    "\n" +
                    "N??i ?????n: Bi???n " +
                    "\n" +
                    "D???ch v??? gi???i tr??: ????nh b???t c??ng ng?? d??n" +
                    "\n" +
                    "Gi?? t???:7000k/1ng?????i");
        }
        private void MaiChau(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" Mai Ch??u");
            ivL0.setImageResource(R.drawable.maichau1);
            cedtL0.setText("Th???i gian: trong ng??y" +
                    "\n" +
                    "Ph????ng ti???n: ?? t??" +
                    "\n" +
                    "Kh??ch s???n: M?????ng Thanh" +
                    "\n" +
                    "N??i ?????n: Ch??? phi??n, Ch??? ????m " +
                    "\n" +
                    "D???ch v??? gi???i tr??: leo n??i, t???m h???" +
                    "\n" +
                    "Gi?? t???:700k/1ng?????i");
        }
        private void DongHoi(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText("?????ng H???i");
            ivL0.setImageResource(R.drawable.donghoi1);
           cedtL0.setText("Th???i gian: 5 ng??y 5 ????m" +
                   "\n" +
                   "Ph????ng ti???n: m??y bay" +
                   "\n" +
                   "Kh??ch s???n: M?????ng Thanh" +
                   "\n" +
                   "N??i ?????n: Th??nh ph???" +
                   "\n" +
                   "D???ch v??? gi???i tr??: t???m bi???n, ??n u???ng" +
                   "\n" +
                   "Gi?? t???:5200k/1ng?????i");
        }
        private void ConDao(){
            DLlayout.setVisibility(View.VISIBLE);
            tvL0.setText(" C??n ?????o");
            ivL0.setImageResource(R.drawable.condao1);
            cedtL0.setText("Th???i gian: 5 ng??y 4 ????m" +
                    "\n" +
                    "Ph????ng ti???n: m??y bya" +
                    "\n" +
                    "Kh??ch s???n: M?????ng Thanh" +
                    "\n" +
                    "N??i ?????n: Nh?? t?? Ph?? Qu???c " +
                    "\n" +
                    "D???ch v??? gi???i tr??: du l???ch" +
                    "\n" +
                    "Gi?? t???:9200k/1ng?????i");
        }

    }
