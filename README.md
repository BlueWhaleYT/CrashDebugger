# Crash Debugger

Crash Debugger is a simple debugger for application crashes. It is useful when there are error messages occurred in your application, while you are currently unable to inspect the Logcat on Android Studio.

## Usage

It's easy, simply add one code in your activity.

```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // add this code
        Thread.setDefaultUncaughtExceptionHandler(new CrashHandler(this));
        setContentView(R.layout.activity_main);
        ...
    }
}
```