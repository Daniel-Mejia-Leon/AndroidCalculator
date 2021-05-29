package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //private var stringNumber = StringBuilder()
    //private lateinit var operator: String
    //private var result: Int
    lateinit var operation: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val tvDisplay:TextView = findViewById(R.id.tvDisplay)
        //tvDisplay.text = sum.toString()

        //this is closed since we added "apply plugin: kotlin-android-extensions" to the build.gradle file
        //then on the right upper corner we selected sync now, then on build we selected build Bundles
        //so now we do not need to specify the findViewById function since the system recognizes the
        //id as the var/val
        /*val button9:Button = findViewById(R.id.button9)*/

        //so we created a function called setOnClick, with the parameter button, which is going to be button1/2/3/4 etc,
        //inside this setOnClick function we have the .setOnClickListener, which is the function that activates certain
        //action once clicked, in this case we are telling the setOnClickListener to get the var stringNumber and add
        //it the text of button, and then tvDisplay.text is going to be equal to stringNumber with the button text
        //previously added
        val stringNumber = StringBuilder()
        val buttonsNumbers: Array<Button>
        val buttonsOperator: Array<Button>
        tvDisplay.text = ""
        nextDisplay.text = ""
        var value1: Int = 0
        var value2: Int = 0
        var result: Int = 0
        var resultLoop: Int = 0
        var resultDone: Boolean = false
        var operatorPressed: Boolean = false
        var numberPressed: Boolean = false
        var nextOperation: Boolean = false
        var firstOperation: Boolean = true
        //println(buttonsNumbers.indices.javaClass.name)
        buttonsOperator = arrayOf(buttonPlus, buttonMin, buttonDiv, buttonTimes)
        buttonsNumbers = arrayOf(button0, button1, button2, button3, button4, button5, button6, button7, button8, button9)
        //this for is to display numbers in tvDisplay
        for (i in buttonsNumbers) {
            i.setOnClickListener {
                stringNumber.append(i.text)
                tvDisplay.text = stringNumber
                numberPressed = true

            }
        }
        //this is to identify what opeartion is going to be performed
        //to send the number to nextDisplay and clearing to input the second number
        for (i in buttonsOperator) {
            i.setOnClickListener {
                if (resultDone){
                    nextDisplay.text = result.toString()
                }
                else if (!resultDone){
                    nextDisplay.text = stringNumber

                }
                operatorDisplay.text = i.text
                tvDisplay.text = ""
                stringNumber.clear()
                //operatorPressed = true
                when (i.text) {
                    "/" -> operation = "division"
                    "-" -> operation = "minus"
                    "*" -> operation = "times"
                    "+" -> operation = "plus"
                }
            }
        }

        buttonEqual.setOnClickListener {
            value1 = nextDisplay.text.toString().toInt()
            value2 = tvDisplay.text.toString().toInt()
            when (operation) {
                "plus" -> result = value1 + value2
                "times" -> result = value1 * value2
                "minus" -> result = value1 - value2
                "division" -> result = value1 / value2
            }
            tvDisplay.text = result.toString()
            //stringNumber.clear()
            nextDisplay.text = result.toString()
            operatorDisplay.text = ""
            resultDone = true
            //result = stringNumber.toString().toInt()
            //nextOperation = true
            //operatorPressed = false
        }


        /*if(resultDone){
            firstOperation = false
            //result = value1
            //if (nextOperation){
            for (i in buttonsNumbers){
                i.setOnClickListener {
                    stringNumber.append(i.text)
                    tvDisplay.text = stringNumber
                    numberPressed = true

                }
            }
            for (i in buttonsOperator){
                i.setOnClickListener {
                    nextDisplay.text = result.toString()
                    operatorDisplay.text = i.text
                    tvDisplay.text = ""
                    //stringNumber.clear()
                    operatorPressed = true
                    when(i.text){
                        "/" -> operation = "division"
                        "-" -> operation = "minus"
                        "*" -> operation = "times"
                        "+" -> operation = "plus"
                    }
                }
            }
            buttonEqual.setOnClickListener {
                result = value1
                value2 = tvDisplay.text.toString().toInt()
                when(operation){
                    "plus"     -> resultLoop = value1 + value2
                    "times"    -> resultLoop = value1 * value2
                    "minus"    -> resultLoop = value1 - value2
                    "division" -> resultLoop = value1 / value2
                }
                tvDisplay.text = resultLoop.toString()
                stringNumber.clear()
                nextDisplay.text = ""
                operatorDisplay.text = ""
                resultDone = true
                operatorPressed = false
            }
            //}

        }*/

        /*if (resultDone && operatorPressed){
            if (numberPressed){

            }
        }*/

    }




}

