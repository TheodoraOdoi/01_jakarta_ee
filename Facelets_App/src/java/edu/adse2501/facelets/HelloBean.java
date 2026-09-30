/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/SingletonEjbClass.java to edit this template
 */
package edu.adse2501.facelets;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author user
 */
@Named(value="helloBean")
@RequestScoped
public class HelloBean
{
    // Application's name
    private String appName = "ADSE2501 Facelets";
    
    public HelloBean()
    {
    }
    
    public String getAppName()
    {
        return appName;
    }
    
    public void setAppName(String appName)
    {
        this.appName = appName;
    }
    
    // Method to display a welcome/greeting message
    public String getGreeting()
    {
        return "Welcome to the ADSE2501 Jakarta Faces Site!";
    }
      
}
