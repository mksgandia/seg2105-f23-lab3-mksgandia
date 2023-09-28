package com.example.simplecalculator;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.simplecalculator.R.layout;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import android.view.View  ;
import android.view.Menu ;
import android.widget.EditText ;


@Metadata(
        mv = {1, 9, 0},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"},
        d2 = {"Lcom/example/simplecalculator/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class MainActivity extends AppCompatActivity {
    private double data1 = 0 ;
    private double data2 = 0 ;
    private enum Operator {none,add,minus,multiply,divide} ;
    private Operator optr = Operator.none ;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.activity_main);
    }

    public void btn00Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "0") ;
    }

    public void btn01Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "1") ;
    }

    public void btn02Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "2") ;
    }

    public void btn03Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "3") ;
    }

    public void btn04Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "4") ;
    }

    public void btn05Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "5") ;
    }

    public void btn06Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "6") ;
    }

    public void btn07Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "7") ;
    }

    public void btn08Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "8") ;
    }

    public void btn09Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText(eText.getText() + "9") ;
    }

    public void btnAddClick(View view) {
        optr = Operator.add ;
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        data1 = Double.parseDouble(eText.getText().toString()) ;
        eText.setText("") ;
    }

    public void btnMinusClick(View view) {
        optr = Operator.minus ;
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        data1 = Double.parseDouble(eText.getText().toString()) ;
        eText.setText("") ;
    }

    public void btnMultiplyClick(View view) {
        optr = Operator.multiply ;
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        data1 = Double.parseDouble(eText.getText().toString()) ;
        eText.setText("") ;
    }

    public void btnDivideClick(View view) {
        optr = Operator.divide ;
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        data1 = Double.parseDouble(eText.getText().toString()) ;
        eText.setText("") ;
    }

    public void btnClearClick(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText("") ;
    }

    public void btnDotClick(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit) ;
        eText.setText("") ;
    }

    public void btnResultClick(View view) {
        if (optr != Operator.none) {
            EditText eText = (EditText)findViewById(R.id.resultEdit) ;
            data2 = Double.parseDouble(eText.getText().toString()) ;
            double result = 0 ;
            if (optr == Operator.add) {
                result = data1 + data2 ;
            } else if (optr == Operator.minus) {
                result = data1-data2 ;
            } else if (optr == Operator.multiply) {
                result = data1*data2 ;
            } else if (optr == Operator.divide) {
                result = data1/data2 ;
            }
            optr = Operator.none ;
            data1 = result ;
            if((result-(int)result) != 0) {
                eText.setText( String.valueOf(result)) ;
            } else {
                eText.setText( String.valueOf((int)result)) ;
            }
        }
    }
}
