package com.example.testgame

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.testgame.databinding.ActivityEasyBinding
import com.example.testgame.databinding.ActivityHardBinding
import java.util.Random

class hardActivity : AppCompatActivity() {
    private val binding by lazy { ActivityHardBinding.inflate(layoutInflater) }

    var number1 = 0
    var number2 = 0
    var javob = 0
    var amal = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        random()
        binding.apply {

            rdBtn1.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    if (rdBtn1.text.toString().toInt() == javob) {
                        random()
                        rdBtn1.isChecked = false
                        Toast.makeText(this@hardActivity, "Javob tog'ri!", Toast.LENGTH_SHORT).show()
                        val mediaPlayer = MediaPlayer.create(this@hardActivity, R.raw.true1)
                        mediaPlayer.start()

                    } else {
                        Toast.makeText(this@hardActivity, "Javob no'tg'ri!", Toast.LENGTH_SHORT).show()
                        val mediaPlayer = MediaPlayer.create(this@hardActivity, R.raw.error1)
                        mediaPlayer.start()

                    }
                }
            }
            rdBtn2.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    if (rdBtn2.text.toString().toInt() == javob) {
                        random()
                        rdBtn2.isChecked = false
                        Toast.makeText(this@hardActivity, "Javob tog'ri!", Toast.LENGTH_SHORT).show()
                        val mediaPlayer = MediaPlayer.create(this@hardActivity, R.raw.true1)
                        mediaPlayer.start()

                    } else {
                        Toast.makeText(this@hardActivity, "Javob no'tg'ri!", Toast.LENGTH_SHORT).show()
                        val mediaPlayer = MediaPlayer.create(this@hardActivity, R.raw.error1)
                        mediaPlayer.start()

                    }
                }
            }
            rdBtn3.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    if (rdBtn3.text.toString().toInt() == javob) {
                        random()
                        rdBtn3.isChecked = false
                        Toast.makeText(this@hardActivity, "Javob tog'ri!", Toast.LENGTH_SHORT).show()
                        val mediaPlayer = MediaPlayer.create(this@hardActivity, R.raw.true1)
                        mediaPlayer.start()

                    } else {
                        Toast.makeText(this@hardActivity, "Javob no'tg'ri!", Toast.LENGTH_SHORT)
                        val mediaPlayer = MediaPlayer.create(this@hardActivity, R.raw.error1)
                        mediaPlayer.start()

                    }
                }
            }
            rdBtn4.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked) {
                    if (rdBtn4.text.toString().toInt() == javob) {
                        random()
                        rdBtn4.isChecked = false
                        Toast.makeText(this@hardActivity, "Javob tog'ri!", Toast.LENGTH_SHORT).show()
                        val mediaPlayer = MediaPlayer.create(this@hardActivity, R.raw.true1)
                        mediaPlayer.start()

                    } else {
                        Toast.makeText(this@hardActivity, "Javob no'tg'ri!", Toast.LENGTH_SHORT).show()
                        val mediaPlayer = MediaPlayer.create(this@hardActivity, R.raw.error1)
                        mediaPlayer.start()
                    }
                }
            }
        }
    }

    fun random() {
        number1 = Random().nextInt(100)
        number2 = Random().nextInt(100)
        amal = Random().nextInt(4)

        showDisplay()
    }

    fun showDisplay() {

        when (amal) {


            0 -> {

                javob = number1 + number2
                binding.txt.text = "$number1 + $number2 ="
            }

            1 -> {
                javob = number1 - number2
                binding.txt.text = "$number1 - $number2 ="
            }

            2 -> {
                javob = number1 * number2
                binding.txt.text = "$number1 * $number2 ="
            }

            3 -> {
                if (number1 % number2 == 0) {
                    javob = number1 / number2
                    binding.txt.text = "$number1 / $number2 ="
                } else {
                    random()
                }
            }
        }
        binding.apply {
            val son = Random().nextInt(4)
            var javob1 = javob - 5
            var javob2 = javob + 12
            var javob3 = javob + 9
            when (son) {
                0 -> {
                    rdBtn1.text = javob.toString()
                    rdBtn2.text = javob1.toString()
                    rdBtn3.text = javob2.toString()
                    rdBtn4.text = javob3.toString()

                }

                1 -> {
                    rdBtn2.text = javob.toString()
                    rdBtn1.text = javob1.toString()
                    rdBtn3.text = javob2.toString()
                    rdBtn4.text = javob3.toString()
                }

                2 -> {
                    rdBtn3.text = javob.toString()
                    rdBtn2.text = javob1.toString()
                    rdBtn1.text = javob2.toString()
                    rdBtn4.text = javob3.toString()
                }

                3 -> {
                    rdBtn4.text = javob.toString()
                    rdBtn1.text = javob3.toString()
                    rdBtn2.text = javob1.toString()
                    rdBtn3.text = javob2.toString()
                }
            }
        }
    }
}