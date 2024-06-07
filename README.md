# AUTOMATIC CAR BUZZ APP
#### Video Demo:  <https://youtu.be/5WZ8DCmcEc8>
#### Description:

Automatic car buzz app is a mobile app that is made using Java and XML files in Android Studio.
This app is basically there to help control your car's lock-unlock.
I thought of a real life scenario where we park our cars/bikes in these big big parking lots
where we tend to forget where exactly did we park them. So to find it, I have created this app along with the hardware components that I will be using.
So, this app first of all, will provide you with a sign in page, then once you have entered the correct credentials, it takes you to the bluetooth main menu.
In this menu, you can switch on/off your mobile phone's bluetooth, see previously paired devices, see your car intrusion data on the cloud and also an option that takes you to the lock/unlock menu.
Sensors used are: 
1) HC05 Bluetooth Module (to connect to your mobile's bluetooth)
2) Arduino UNO (to acts as the microcontroller)
3) NodeMCU Wifi Module (to send data to the ThingSpeak cloud)
4) MPU6050 Gyro Sensor (to send x,y,z coordinates of car to cloud for safety)
5) Piezo Buzzer (for lock/unlock)
When you press on the Unlock button, the Piezo buzzer will intitiate and it will make a buzz sound, through which you can figure out,
where your car is parked and hence will be able to find your car.