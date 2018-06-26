package com.example.imsodam_i.a3rdseminarproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        val idx : Int = main_rv.getChildAdapterPosition(v)
        val name : String = kakaoItems[idx].name
        val profile : Int = kakaoItems[idx].profile


        val intent : Intent = Intent(applicationContext, ChatActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("profile", profile)
        startActivity(intent)

    }

    lateinit var kakaoItems : ArrayList<KakaoData>
    lateinit var KakaoAdapter : KakaoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kakaoItems = ArrayList()
        kakaoItems.add(KakaoData(R.drawable.img1, "09의 바나나 안드로이드",
                "낰낰", "오후 4:07"))
        kakaoItems.add(KakaoData(R.drawable.img2, "이돌이의 차근차근기획",
                ":D ><", "오후 6:05"))
        kakaoItems.add(KakaoData(R.drawable.img3, "고창 애기덜 ㅎㅎ",
                "(이모티콘)", "오후 3:57"))
        kakaoItems.add(KakaoData(R.drawable.img4, "슴앗으로 깔맞춤",
                "ㅋㅋㅋㅋㅋㅋㅋㅋ", "오후 6:07"))
        kakaoItems.add(KakaoData(R.drawable.img5, "우리 가족",
                "알겠습니다~!", "오후 1:07"))
        kakaoItems.add(KakaoData(R.drawable.img6, "재후니오빠",
                "웅 시혀나", "오후 2:17"))
        kakaoItems.add(KakaoData(R.drawable.img9, "예쁜햄",
                "오늘 모해요....?", "오후 3:04"))
        kakaoItems.add(KakaoData(R.drawable.img8, "안드 2조",
                "넹~~~~!", "오후 4:07"))
        kakaoItems.add(KakaoData(R.drawable.img10, "시현",
                "ㅠㅠㅠ", "오후 4:08"))
        kakaoItems.add(KakaoData(R.drawable.img11, "주히유",
                "고마우미~~", "오후 4:14"))

        KakaoAdapter = KakaoAdapter(kakaoItems)
        KakaoAdapter.setOnItemClickListener(this)

        main_rv.layoutManager = LinearLayoutManager(this)
        main_rv.adapter = KakaoAdapter

    }
}
