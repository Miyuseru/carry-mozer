package app.miyuseru.carry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val people = arrayOf("ゆっこ","のあーるくん","せぇ","みこ")
    val food = arrayOf("カレー","ごはん","ピラフ","ごましお")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view: View?) {
        val randomName  = Random()
        val index = randomName.nextInt( 4)
        val name = people[index]
        nameTextView.text = name + "に"

        foodTextView.text =food[Random().nextInt(4)] + "を"

        if(Random().nextInt(100)<50) {
            varbTextView.text = "よそえませんでした"
        }else{
          varbTextView.text = "よそえました！"


    }


}

}
