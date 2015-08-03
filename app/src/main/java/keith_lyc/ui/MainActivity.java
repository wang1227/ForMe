package keith_lyc.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView Diary, Schedule, BookMarks;
    private Button DiaryBtn, ScheduleBtn, BookMarksBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Diary = (TextView)findViewById(R.id.Diary);
        Schedule = (TextView)findViewById(R.id.Schedule);
        BookMarks = (TextView)findViewById(R.id.BookMarks);

        DiaryBtn = (Button)findViewById(R.id.DiaryBtn);
        ScheduleBtn = (Button)findViewById(R.id.ScheduleBtn);
        BookMarksBtn = (Button)findViewById(R.id.BookMarksBtn);

        Diary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiaryBtn.setBackgroundColor(getResources().getColor(R.color.TiffnyBule));
                ScheduleBtn.setBackgroundColor(getResources().getColor(R.color.Yellow));
                BookMarksBtn.setBackgroundColor(getResources().getColor(R.color.Yellow));
            }
        });

        Schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScheduleBtn.setBackgroundColor(getResources().getColor(R.color.TiffnyBule));
                DiaryBtn.setBackgroundColor(getResources().getColor(R.color.Yellow));
                BookMarksBtn.setBackgroundColor(getResources().getColor(R.color.Yellow));
            }
        });

        BookMarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookMarksBtn.setBackgroundColor(getResources().getColor(R.color.TiffnyBule));
                DiaryBtn.setBackgroundColor(getResources().getColor(R.color.Yellow));
                ScheduleBtn.setBackgroundColor(getResources().getColor(R.color.Yellow));
            }
        });

    }
}
