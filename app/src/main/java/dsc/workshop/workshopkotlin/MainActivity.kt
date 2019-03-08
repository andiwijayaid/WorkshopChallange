package dsc.workshop.workshopkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mNilai = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusBT.setOnClickListener {
            mNilai+=1
            angkaTV.setText(mNilai.toString())
        }

        minBT.setOnClickListener {
            if (isUnsignedInt()) {
                mNilai-=1
                angkaTV.setText(mNilai.toString())
            } else {
                Toast.makeText(this, "Can not be negatif", Toast.LENGTH_LONG).show()
            }
        }

        resetBT.setOnClickListener {
            mNilai = 0
            angkaTV.setText(mNilai.toString())
        }
    }

    fun isUnsignedInt(): Boolean {
        if(mNilai > 0) {
            return true
        } else {
            return false
        }
    }

}
