package ru.urvanov.javaexamples.springbootjmx.mbeans;

public interface MyMXBean {
    
    int getIntValue();
    
    void setIntValue(int intValue);
    
    double getDoubleValue();
    
    void setDoubleValue(double doubleValue);
    
    String getStringValue();
    
    void setStringValue(String stringValue);
    
    Monster getMonster();
    
    void setMonster(Monster monster);
    
    String writeToConsole(String str1, String str2);
}
