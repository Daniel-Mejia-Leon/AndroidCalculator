package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    private var stringNumber = StringBuilder()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //val tvDisplay:TextView = findViewById(R.id.tvDisplay)
        //tvDisplay.text = sum.toString()

        //this is closed since we added "apply plugin: kotlin-android-extensions" to the build.gradle file
        //then on the right upper corner we selected sync now, then on build we selected build Bundles
        //so now we do not need to specify the findViewById function since the system recognizes the
        //id as the var/val
        /*val button9:Button = findViewById(R.id.button9)
        val button8:Button = findViewById(R.id.button8)
        val button7:Button = findViewById(R.id.button7)
        val button6:Button = findViewById(R.id.button6)
        val button5:Button = findViewById(R.id.button5)
        val button4:Button = findViewById(R.id.button4)
        val button3:Button = findViewById(R.id.button3)
        val button2:Button = findViewById(R.id.button2)
        val button1:Button = findViewById(R.id.button1)
        val button0:Button = findViewById(R.id.button0)*/

        //so we created a function called setOnClick, with the parameter button, which is going to be button1/2/3/4 etc,
        //inside this setOnClick function we have the .setOnClickListener, which is the function that activates certain
        //action once clicked, in this case we are telling the setOnClickListener to get the var stringNumber and add
        //it the text of button, and then tvDisplay.text is going to be equal to stringNumber with the button text
        //previously added

        var buttonsNumbers: Array<Button>
        tvDisplay.text = ""
        nextDisplay.text = ""
        //var stringNumber = ""
        var value1: Int
        var value2: Int
        var result: Int
        //println(buttonsNumbers.indices.javaClass.name)

        buttonsNumbers = arrayOf(button0, button1, button2, button3, button4, button5, button6, button7, button8, button9)
        for (i in buttonsNumbers){
            i.setOnClickListener {
                stringNumber.append(i.text)
                tvDisplay.text = stringNumber
            }

        }
        //click a number and displays in the screen
        /*fun setOnClick(button: Button){
            button.setOnClickListener {
                //stringNumber += button.text
                stringNumber.append(button.text)
                tvDisplay.text = stringNumber

            }
        }*/


        buttonPlus.setOnClickListener {
            nextDisplay.text = stringNumber
            operatorDisplay.text = "+"
            tvDisplay.text = ""
            value2 = stringNumber.toString().toInt()
            stringNumber.clear()


        }

        buttonEqual.setOnClickListener {
            value1 = nextDisplay.text.toString().toInt()
            value2 = tvDisplay.text.toString().toInt()
            result = value1 + value2
            tvDisplay.text = result.toString()
            stringNumber.clear()
            nextDisplay.text = ""
            operatorDisplay.text = ""

        }



        /*setOnClick(button0)
        setOnClick(button1)
        setOnClick(button2)
        setOnClick(button3)
        setOnClick(button4)
        setOnClick(button5)
        setOnClick(button6)
        setOnClick(button7)
        setOnClick(button8)
        setOnClick(button9)*/



        /*button9.setOnClickListener {
            tvDisplay.text = button9.text
        }

        button8.setOnClickListener {
            tvDisplay.text = button8.text
        }

        button7.setOnClickListener {
            tvDisplay.text= button7.text
        }

        button6.setOnClickListener {
            tvDisplay.text = button6.text
        }

        button5.setOnClickListener {
            tvDisplay.text = button5.text
        }

        button4.setOnClickListener {
            tvDisplay.text = button4.text
        }

        button3.setOnClickListener {
            tvDisplay.text = button3.text
        }

        button3.setOnClickListener {
            tvDisplay.text = button3.text
        }

        button2.setOnClickListener {
            tvDisplay.text = button2.text
        }

        button1.setOnClickListener {
            tvDisplay.text = button1.text
        }

        button0.setOnClickListener {
            tvDisplay.text = button0.text
        }*/


        /*System.out.println(stringNumber.javaClass.name)
                var x = "mama"
                var y = "mami"
                System.out.println(x.toInt() + y.toInt())*/
    }
}