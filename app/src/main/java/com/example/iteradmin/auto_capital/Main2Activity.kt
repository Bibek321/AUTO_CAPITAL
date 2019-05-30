package com.example.iteradmin.auto_capital

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val image=findViewById<ImageView>(R.id.image)
        val btn = findViewById<Button>(R.id.click)

        val im= arrayOf(
                "https://img.cinemablend.com/filter:scale/quill/a/b/a/b/c/a/ababca39b72d256cd8f47a8f114169165f42dba3.jpg?mw=600",
        "https://i.kinja-img.com/gawker-media/image/upload/s--SaoaptQN--/c_scale,f_auto,fl_progressive,q_80,w_800/k3rhb1of06srqhdtkbd8.jpg",
        "https://www.iafrica.com/wp-content/uploads/2019/02/Hugh-Jackman-e1550735705733.jpg"

        )
        Glide.with(this).load(im[0]).into(image)
        var i:Int = 0
        var n:Int = im.size
        btn.setOnClickListener {
            Glide.with(this).load(im[i%n]).into(image)
            i++

        }
    }
}
