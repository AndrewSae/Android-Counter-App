package AndrewS.Counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val showNum = findViewById<TextView>(R.id.num)
        var timesClicked = 0

        add.setOnClickListener {
            timesClicked++
            showNum.text = timesClicked.toString()
        }
    sub.setOnClickListener {
        timesClicked--
        if (timesClicked <= 0) {
            timesClicked = 0
        }
        showNum.text = timesClicked.toString()
    }
    }
}