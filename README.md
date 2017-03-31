# CheckNetwork
Small foot print library for checking the network status continuously. 

![Library screen](https://github.com/ashokslsk/CheckNetwork/blob/master/screen/Screen1.png)

# Installation

```gradle


 
 //Add it in your root build.gradle at the end of repositories:

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
}

dependencies {
	        compile 'com.github.ashokslsk:CheckNetwork:41f1a12f20'
	}

```

# Usage 
```Java
public class YourActivity extends AppCompatActivity implements NetworkStateReceiver.NetworkStateReceiverListener {
	
	//Declare NetworkStateReceiver in global scope
	private NetworkStateReceiver networkStateReceiver;
	
	 @Override
         protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_splash_screen);

	 //Network register
        networkStateReceiver = new NetworkStateReceiver();
        networkStateReceiver.addListener(this);
        this.registerReceiver(networkStateReceiver, new IntentFilter(android.net.ConnectivityManager.CONNECTIVITY_ACTION));
	
   }
   
// Implemented interfaces to handle the network status

    @Override
    public void networkAvailable() {
        Toast.makeText(MainActivity.this, "Network Available", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void networkUnavailable() {
        Toast.makeText(MainActivity.this, "Network unavailable", Toast.LENGTH_SHORT).show();
    }

}

```

## License
```
MIT License

Copyright (c) 2017 Ashok Kumar S.


Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
