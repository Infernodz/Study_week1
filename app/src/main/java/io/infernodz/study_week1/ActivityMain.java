package io.infernodz.study_week1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ActivityMain extends AppCompatActivity {


    /*
     * Для того, чтобы при повороте экрана значение в EditText не сохранялось
     * есть два способа:
     *
     * 1) Не прописывать id для View элемента
     *
     * 2) Переопределить метод Activity onSaveInstanteState()
     * у которого не вызывать этот же метод суперкласса
     *
     */

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
